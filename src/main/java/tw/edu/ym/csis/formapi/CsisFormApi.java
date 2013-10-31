package tw.edu.ym.csis.formapi;

import static tw.edu.ym.csis.formapi.CsisFormStatus.DATARECORD_NOT_FOUND;
import static tw.edu.ym.csis.formapi.CsisFormStatus.FORMVERSION_NOT_FOUND;
import static tw.edu.ym.csis.formapi.CsisFormStatus.MRN_IS_EMPTY;
import static tw.edu.ym.csis.formapi.CsisFormStatus.OK;
import static tw.edu.ym.csis.formapi.FormCRUD.FORMVERSION;
import static tw.edu.ym.csis.formapi.FormCRUD.MRN;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.formapi.helper.Datarecords;
import tw.edu.ym.csis.formapi.helper.Dcprocesses;
import tw.edu.ym.csis.formapi.helper.Events;
import tw.edu.ym.csis.formapi.helper.FormVersions;
import tw.edu.ym.csis.formapi.helper.Patients;
import tw.edu.ym.csis.formapi.helper.ProtocolPatients;
import tw.edu.ym.csis.formapi.helper.Visits;
import tw.edu.ym.csis.maindb.model.Datarecord;
import tw.edu.ym.csis.maindb.model.Dcprocess;
import tw.edu.ym.csis.maindb.model.FormVersion;
import tw.edu.ym.csis.maindb.model.Patient;
import tw.edu.ym.csis.maindb.model.ProtocolPatient;

/**
 * 
 * CsisFormApi provides all CRUD of Csis form operation.
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class CsisFormApi {

  private static final Logger log = Logger.getLogger(CsisFormApi.class
      .getName());

  private final SqlSessionFactory main;
  private final SqlSessionFactory meta;

  public CsisFormApi(SqlSessionFactory main, SqlSessionFactory meta) {
    this.main = main;
    this.meta = meta;
  }

  /**
   * Creates a datarecord by given content Map.
   * 
   * @param form
   *          contains datapoint-value pairs of a form
   * @return a CsisFormStatus
   */
  public CsisFormStatus create(Map<String, String> form) {
    return create(form, null);
  }

  /**
   * Creates a datarecord by given id and content Map.
   * 
   * @param form
   *          contains datapoint-value pairs of a form
   * @param datarecordId
   *          an id is assigned to this record
   * @return a CsisFormStatus
   */
  public CsisFormStatus create(Map<String, String> form, Long datarecordId) {
    FormVersion formVersion =
        new FormVersions(main).findById(Long.valueOf(form.get(FORMVERSION)));

    if (formVersion == null)
      return FORMVERSION_NOT_FOUND;
    if (!form.containsKey(MRN) || form.get(MRN) == null
        || form.get(MRN).trim().equals(""))
      return MRN_IS_EMPTY;

    ProtocolPatient protocolPatient = checkPatient(form, formVersion);
    if (datarecordId == null)
      new FormCRUD(main, meta).create(form, formVersion, protocolPatient);
    else
      new FormCRUD(main, meta).create(form, formVersion, protocolPatient,
          datarecordId);

    return OK;
  }

  /**
   * Gets all datapoint-value pairs of the form.
   * 
   * @param datarecordId
   *          the id of the datarecord
   * @return a Map contains datapoint-value pairs of the form
   */
  public Map<String, String> read(Long datarecordId) {
    return new FormCRUD(main, meta).read(datarecordId);
  }

  /**
   * Updates the content of a datarecord.
   * 
   * @param datarecordId
   *          the id of the datarecord
   * @param form
   *          contains datapoint-value pairs
   * @return a CsisFormStatus
   */
  public CsisFormStatus update(Long datarecordId, Map<String, String> form) {
    Datarecord datarecord = new Datarecords(main).findById(datarecordId);
    if (datarecord == null)
      return DATARECORD_NOT_FOUND;

    new FormCRUD(main, meta).update(datarecord, form);

    return OK;
  }

  /**
   * Deletes the content of a datarecord.
   * 
   * @param datarecordId
   *          the id of the datarecord
   * @return a CsisFormStatus
   */
  public CsisFormStatus delete(Long datarecordId) {
    Datarecord datarecord = new Datarecords(main).findById(datarecordId);
    if (datarecord == null)
      return DATARECORD_NOT_FOUND;

    new FormCRUD(main, meta).delete(datarecord);

    return OK;
  }

  /**
   * Deletes the content of all datarecords.
   */
  public void deleteAll() {
    List<Datarecord> datarecords = new Datarecords(main).selectAll();
    for (int i = 0; i < datarecords.size(); i++) {
      delete(datarecords.get(i).getId());
      log.info(i + 1 + "/" + datarecords.size() + " : Deleting all forms...");
    }

    new Visits(main).deleteAll();
    new Events(main).deleteAll();
  }

  private ProtocolPatient checkPatient(Map<String, String> form,
      FormVersion formVersion) {
    Patient patient = new Patients(main, meta).findByMrn(form.get(MRN));
    if (patient == null)
      patient = new Patients(main, meta).create(form.get(MRN));

    Dcprocess dcprocess = new Dcprocesses(main).findByFormVersion(formVersion);

    ProtocolPatient protocolPatient =
        new ProtocolPatients(main)
            .findByDcprocessAndPatient(dcprocess, patient);
    if (protocolPatient == null)
      protocolPatient = new ProtocolPatients(main).create(dcprocess, patient);

    return protocolPatient;
  }

}
