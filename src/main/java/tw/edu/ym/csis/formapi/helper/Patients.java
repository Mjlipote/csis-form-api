package tw.edu.ym.csis.formapi.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.PatientMapper;
import tw.edu.ym.csis.maindb.model.Patient;
import tw.edu.ym.csis.maindb.model.PatientExample;
import tw.edu.ym.csis.maindb.model.ProtocolPatient;
import tw.edu.ym.csis.maindb.model.Visit;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class Patients extends
    MyBatisBase<Patient, PatientExample, PatientMapper> {

  public static final String DEFAULT_LAST_NAME = "AutoGen";

  private final SqlSessionFactory sessionFactory;
  private final SqlSessionFactory meta;

  public Patients(SqlSessionFactory main, SqlSessionFactory meta) {
    sessionFactory = main;
    this.meta = meta;
  }

  public Long newId() {
    Long id = null;

    SqlSession sqlSession = null;
    Connection conn;
    Statement stmt;
    try {
      sqlSession = sessionFactory.openSession();
      conn = sqlSession.getConnection();

      PatientExample patientExample;
      PatientMapper patientMapper = sqlSession.getMapper(PatientMapper.class);
      String query = "select PATIENT_SEQ.nextval as id from dual";
      do {
        stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        result.next();
        id = result.getLong(1);
        stmt.close();

        patientExample = new PatientExample();
        patientExample.or().andPatientidEqualTo(id);
      } while (patientMapper.countByExample(patientExample) != 0);

    } catch (SQLException ex) {
      Logger.getLogger(Patients.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      if (sqlSession != null)
        sqlSession.close();
    }

    return id;
  }

  public Patient create(String mrn) {
    Patient patient = new Patient();
    patient.setPatientid(newId());
    patient.setMrn(mrn);
    patient.setLastName("AutoGen");

    insert(patient);

    return patient;
  }

  public Patient findByPatientId(final Long patientId) {
    return selectOne(new Example<PatientExample>() {

      @Override
      public void set(PatientExample example) {
        example.or().andPatientidEqualTo(patientId);
      }

    });
  }

  public Patient findByMrn(final String mrn) {
    return selectOne(new Example<PatientExample>() {

      @Override
      public void set(PatientExample example) {
        example.or().andMrnEqualTo(mrn);
      }

    });
  }

  public Patient findByEventId(Long eventId) {
    Visit visit = new Visits(meta).findByEventId(eventId);
    ProtocolPatient protocolPatient =
        new ProtocolPatients(sessionFactory).findById(visit.getPclpatientid());
    return findByPatientId(protocolPatient.getPatientid());
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<PatientExample> getExampleClass() {
    return PatientExample.class;
  }

  @Override
  protected Class<PatientMapper> getMapperClass() {
    return PatientMapper.class;
  }

}
