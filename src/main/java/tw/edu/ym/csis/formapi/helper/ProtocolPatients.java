package tw.edu.ym.csis.formapi.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.ProtocolPatientMapper;
import tw.edu.ym.csis.maindb.model.Dcprocess;
import tw.edu.ym.csis.maindb.model.Patient;
import tw.edu.ym.csis.maindb.model.ProtocolPatient;
import tw.edu.ym.csis.maindb.model.ProtocolPatientExample;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class ProtocolPatients extends
    MyBatisBase<ProtocolPatient, ProtocolPatientExample, ProtocolPatientMapper> {

  private final SqlSessionFactory sessionFactory;

  public ProtocolPatients(SqlSessionFactory main) {
    sessionFactory = main;
  }

  public Long newId() {
    Long id = null;

    SqlSession sqlSession = null;
    Connection conn;
    Statement stmt;
    try {
      sqlSession = sessionFactory.openSession();
      conn = sqlSession.getConnection();

      ProtocolPatientExample protocolPatientExample;
      ProtocolPatientMapper protocolPatientMapper =
          sqlSession.getMapper(ProtocolPatientMapper.class);
      String query = "select PCLPATIENT_SEQ.nextval as id from dual";
      do {
        stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        result.next();
        id = result.getLong(1);
        stmt.close();

        protocolPatientExample = new ProtocolPatientExample();
        protocolPatientExample.or().andIdEqualTo(id);
      } while (protocolPatientMapper.countByExample(protocolPatientExample) != 0);

    } catch (SQLException ex) {
      Logger.getLogger(ProtocolPatients.class.getName()).log(Level.SEVERE,
          null, ex);
    } finally {
      if (sqlSession != null)
        sqlSession.close();
    }

    return id;
  }

  public ProtocolPatient create(Dcprocess dcprocess, Patient patient) {
    ProtocolPatient protocolPatient = new ProtocolPatient();
    protocolPatient.setId(newId());
    protocolPatient.setProtocolid(dcprocess.getId());
    protocolPatient.setPatientid(patient.getPatientid());

    insert(protocolPatient);

    return protocolPatient;
  }

  public ProtocolPatient findByDcprocessAndPatient(final Dcprocess dcprocess,
      final Patient patient) {
    return selectOne(new Example<ProtocolPatientExample>() {

      @Override
      public void set(ProtocolPatientExample example) {
        example.or().andProtocolidEqualTo(dcprocess.getId())
            .andPatientidEqualTo(patient.getPatientid());
      }

    });
  }

  public ProtocolPatient findById(final Long id) {
    return selectOne(new Example<ProtocolPatientExample>() {

      @Override
      public void set(ProtocolPatientExample example) {
        example.or().andIdEqualTo(id);
      }

    });
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<ProtocolPatientExample> getExampleClass() {
    return ProtocolPatientExample.class;
  }

  @Override
  protected Class<ProtocolPatientMapper> getMapperClass() {
    return ProtocolPatientMapper.class;
  }

}
