package tw.edu.ym.csis.formapi;

import static com.google.common.collect.Maps.newHashMap;
import static net.sf.rubycollect4j.RubyCollections.Hash;
import static net.sf.rubycollect4j.RubyCollections.hp;
import static net.sf.rubycollect4j.RubyCollections.ra;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.rubycollect4j.RubyDate;
import net.sf.rubycollect4j.block.TransformBlock;

import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.formapi.helper.DatapointDatarecords;
import tw.edu.ym.csis.formapi.helper.Datapoints;
import tw.edu.ym.csis.formapi.helper.Datarecords;
import tw.edu.ym.csis.formapi.helper.Events;
import tw.edu.ym.csis.formapi.helper.FormVersions;
import tw.edu.ym.csis.formapi.helper.Patients;
import tw.edu.ym.csis.formapi.helper.Visits;
import tw.edu.ym.csis.maindb.model.Datapoint;
import tw.edu.ym.csis.maindb.model.DatapointDatarecord;
import tw.edu.ym.csis.maindb.model.Datarecord;
import tw.edu.ym.csis.maindb.model.Event;
import tw.edu.ym.csis.maindb.model.FormVersion;
import tw.edu.ym.csis.maindb.model.ProtocolPatient;
import tw.edu.ym.csis.maindb.model.Visit;

/**
 * 
 * FormCRUD is built to support CsisFormApi.
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class FormCRUD {

  public static final String MRN = "mrn";
  public static final String FORMVERSION = "formversion";

  private final SqlSessionFactory main;
  private final SqlSessionFactory meta;

  public FormCRUD(SqlSessionFactory main, SqlSessionFactory meta) {
    this.main = main;
    this.meta = meta;
  }

  /**
   * Creates a form in Csis.
   * 
   * @param form
   *          contains datapoint-value pairs
   * @param formVersion
   *          version of the form
   * @param protocolPatient
   *          who form belongs to
   */
  public void create(Map<String, String> form, FormVersion formVersion,
      ProtocolPatient protocolPatient) {
    create(form, formVersion, protocolPatient, null);
  }

  /**
   * Creates a form in Csis.
   * 
   * @param form
   *          contains datapoint-value pairs
   * @param formVersion
   *          version of the form
   * @param protocolPatient
   *          who form belongs to
   * @param datarecordId
   *          an Id is assigned to the datarecord
   */
  public void create(Map<String, String> form, FormVersion formVersion,
      ProtocolPatient protocolPatient, Long datarecordId) {
    List<Datapoint> datapoints =
        new Datapoints(main, meta).findAllByFormVersionId(formVersion.getId());
    Event event;
    Visit visit =
        new Visits(main).findByPclPatientIdAndVisitDate(
            protocolPatient.getId(), new Date(RubyDate.today().getTime()));
    if (visit == null) {
      event = new Events(main).newEvent();
      visit = new Visits(main).create(event, protocolPatient);
    } else {
      event = new Events(main).findById(visit.getEventid());
    }

    Datarecord datarecord;
    if (datarecordId == null)
      datarecord = new Datarecords(main).create(event, formVersion);
    else
      datarecord =
          new Datarecords(main).create(event, formVersion, datarecordId);

    for (Datapoint datapoint : datapoints) {
      if (form.containsKey(datapoint.getName()))
        new DatapointDatarecords(main).create(datapoint, datarecord,
            form.get(datapoint.getName()));
    }
  }

  /**
   * Gets all datapoint-value pairs of the form.
   * 
   * @param datarecordId
   *          the id of the datarecord
   * @return a Map contains datapoint-value pairs of the form
   */
  public Map<String, String> read(Long datarecordId) {
    Map<String, String> form = newHashMap();

    Datarecord datarecord = new Datarecords(main).findById(datarecordId);
    if (datarecord == null)
      return null;

    FormVersion formVersion =
        new FormVersions(main).findById(datarecord.getFormversionid());

    List<DatapointDatarecord> datapointDatarecords =
        new DatapointDatarecords(main)
            .findAllByDatarecordId(datarecord.getId());

    List<Datapoint> datapoints =
        new Datapoints(main, meta).findAllByFormVersionId(formVersion.getId());

    Map<Long, String> datapointIndex =
        Hash(ra(datapoints).map(
            new TransformBlock<Datapoint, Entry<Long, String>>() {

              @Override
              public Entry<Long, String> yield(Datapoint item) {
                return hp(item.getId(), item.getName());
              }

            }));

    for (DatapointDatarecord dpdr : datapointDatarecords) {
      form.put(datapointIndex.get(dpdr.getDatapointid()), dpdr.getValue());
    }
    form.put(FORMVERSION, formVersion.getId().toString());
    form.put(MRN,
        new Patients(main, meta).findByEventId(datarecord.getEventid())
            .getMrn());

    return form;
  }

  /**
   * Updates the content of a datarecord.
   * 
   * @param datarecord
   *          a Datarecord
   * @param form
   *          contains datapoint-value pairs
   */
  public void update(Datarecord datarecord, Map<String, String> form) {
    List<Datapoint> datapoints =
        new Datapoints(main, meta).findAllByFormVersionId(datarecord
            .getFormversionid());
    Map<Long, Datapoint> dpId2dp =
        Hash(ra(datapoints).map(
            new TransformBlock<Datapoint, Entry<Long, Datapoint>>() {

              @Override
              public Entry<Long, Datapoint> yield(Datapoint item) {
                return hp(item.getId(), item);
              }

            }));

    List<DatapointDatarecord> datapointDatarecords =
        new DatapointDatarecords(main)
            .findAllByDatarecordId(datarecord.getId());
    Map<Long, DatapointDatarecord> dpId2dpdr =
        Hash(ra(datapointDatarecords)
            .map(
                new TransformBlock<DatapointDatarecord, Entry<Long, DatapointDatarecord>>() {

                  @Override
                  public Entry<Long, DatapointDatarecord> yield(
                      DatapointDatarecord item) {
                    return hp(item.getDatapointid(), item);
                  }

                }));

    Map<String, Long> dpName2id =
        Hash(ra(datapoints).map(
            new TransformBlock<Datapoint, Entry<String, Long>>() {

              @Override
              public Entry<String, Long> yield(Datapoint item) {
                return hp(item.getName(), item.getId());
              }

            }));

    Map<Long, String> dpId2dpdrValue =
        Hash(ra(datapointDatarecords).map(
            new TransformBlock<DatapointDatarecord, Entry<Long, String>>() {

              @Override
              public Entry<Long, String> yield(DatapointDatarecord item) {
                return hp(item.getDatapointid(), item.getValue());
              }

            }));

    Map<String, String> dpName2dpdrValue = bridge(dpName2id, dpId2dpdrValue);

    for (String dpName : form.keySet()) {
      if (dpName2dpdrValue.containsKey(dpName)) {
        String oldValue = dpName2dpdrValue.get(dpName);
        String newValue = form.get(dpName);
        if (oldValue == null || !(oldValue.equals(newValue))) {
          DatapointDatarecord dpdr = dpId2dpdr.get(dpName2id.get(dpName));
          new DatapointDatarecords(main).update(dpdr, newValue);
        }
      } else if (dpName2id.containsKey(dpName)) {
        String value = form.get(dpName);
        Datapoint datapoint = dpId2dp.get(dpName2id.get(dpName));
        new DatapointDatarecords(main).create(datapoint, datarecord, value);
      }
    }
  }

  /**
   * Deletes the content of a datarecord.
   * 
   * @param datarecord
   *          a Datarecord
   */
  public void delete(Datarecord datarecord) {
    List<DatapointDatarecord> dpdrs =
        new DatapointDatarecords(main)
            .findAllByDatarecordId(datarecord.getId());
    new DatapointDatarecords(main).delete(dpdrs);
    new Datarecords(main).delete(datarecord);
  }

  private <K, T, V> Map<K, V> bridge(Map<K, T> keyHash, Map<T, V> valueHash) {
    Map<K, V> hash = newHashMap();

    for (K key : keyHash.keySet()) {
      V value = valueHash.get(keyHash.get(key));
      if (valueHash.containsKey(keyHash.get(key)))
        hash.put(key, value);
    }

    return hash;
  }

}
