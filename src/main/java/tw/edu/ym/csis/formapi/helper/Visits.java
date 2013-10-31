package tw.edu.ym.csis.formapi.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.rubycollect4j.RubyDate;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.VisitMapper;
import tw.edu.ym.csis.maindb.model.Event;
import tw.edu.ym.csis.maindb.model.ProtocolPatient;
import tw.edu.ym.csis.maindb.model.Visit;
import tw.edu.ym.csis.maindb.model.VisitExample;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class Visits extends MyBatisBase<Visit, VisitExample, VisitMapper> {

  private final SqlSessionFactory sessionFactory;

  public Visits(SqlSessionFactory main) {
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

      VisitExample visitExample;
      VisitMapper visitMapper = sqlSession.getMapper(VisitMapper.class);
      String query = "select VISIT_SEQ.nextval as id from dual";
      do {
        stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        result.next();
        id = result.getLong(1);
        stmt.close();

        visitExample = new VisitExample();
        visitExample.or().andIdEqualTo(id);
      } while (visitMapper.countByExample(visitExample) != 0);

    } catch (SQLException ex) {
      Logger.getLogger(Visits.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      if (sqlSession != null)
        sqlSession.close();
    }

    return id;
  }

  public Visit create(Event event, ProtocolPatient protocolPatient) {
    Visit visit = new Visit();
    visit.setId(newId());
    visit.setFuturevisitFlg("N");
    visit.setVisitdate(new Date(RubyDate.today().getTime()));
    visit.setEventid(event.getId());
    visit.setPclpatientid(protocolPatient.getId());

    insert(visit);

    return visit;
  }

  public Visit findByEventId(final Long eventId) {
    return selectOne(new Example<VisitExample>() {

      @Override
      public void set(VisitExample example) {
        example.or().andEventidEqualTo(eventId);
      }

    });
  }

  public Visit findByPclPatientIdAndVisitDate(final Long pclPatientId,
      final Date visitDate) {
    return selectOne(new Example<VisitExample>() {

      @Override
      public void set(VisitExample example) {
        example.or().andPclpatientidEqualTo(pclPatientId)
            .andVisitdateEqualTo(visitDate);
      }

    });
  }

  public void deleteAll() {
    delete(new Example<VisitExample>() {

      @Override
      public void set(VisitExample example) {}

    });
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<VisitExample> getExampleClass() {
    return VisitExample.class;
  }

  @Override
  protected Class<VisitMapper> getMapperClass() {
    return VisitMapper.class;
  }

}
