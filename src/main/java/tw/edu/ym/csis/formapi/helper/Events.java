package tw.edu.ym.csis.formapi.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.EventMapper;
import tw.edu.ym.csis.maindb.model.Event;
import tw.edu.ym.csis.maindb.model.EventExample;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class Events extends MyBatisBase<Event, EventExample, EventMapper> {

  private final SqlSessionFactory sessionFactory;

  public Events(SqlSessionFactory main) {
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

      EventExample eventExample;
      EventMapper eventMapper = sqlSession.getMapper(EventMapper.class);
      String query = "select EVENT_SEQ.nextval as id from dual";
      do {
        stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        result.next();
        id = result.getLong(1);
        stmt.close();

        eventExample = new EventExample();
        eventExample.or().andIdEqualTo(id);
      } while (eventMapper.countByExample(eventExample) != 0);

    } catch (SQLException ex) {
      Logger.getLogger(Events.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      if (sqlSession != null)
        sqlSession.close();
    }

    return id;
  }

  public Event findById(final Long id) {
    return selectOne(new Example<EventExample>() {

      @Override
      public void set(EventExample example) {
        example.or().andIdEqualTo(id);
      }

    });
  }

  public Event newEvent() {
    Event event = new Event();
    event.setId(newId());
    event.setEventType("VISIT");

    insert(event);

    return event;
  }

  public void deleteAll() {
    delete(new Example<EventExample>() {

      @Override
      public void set(EventExample example) {}

    });
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<EventExample> getExampleClass() {
    return EventExample.class;
  }

  @Override
  protected Class<EventMapper> getMapperClass() {
    return EventMapper.class;
  }

}
