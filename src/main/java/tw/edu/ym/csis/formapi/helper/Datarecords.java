package tw.edu.ym.csis.formapi.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.rubycollect4j.RubyDate;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.DatarecordMapper;
import tw.edu.ym.csis.maindb.model.Datarecord;
import tw.edu.ym.csis.maindb.model.DatarecordExample;
import tw.edu.ym.csis.maindb.model.Event;
import tw.edu.ym.csis.maindb.model.FormVersion;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class Datarecords extends
    MyBatisBase<Datarecord, DatarecordExample, DatarecordMapper> {

  private final SqlSessionFactory sessionFactory;

  public Datarecords(SqlSessionFactory main) {
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

      DatarecordExample datarecordExample;
      DatarecordMapper datarecordMapper =
          sqlSession.getMapper(DatarecordMapper.class);
      String query = "select DATARECORD_SEQ.nextval as id from dual";
      do {
        stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        result.next();
        id = result.getLong(1);
        stmt.close();

        datarecordExample = new DatarecordExample();
        datarecordExample.or().andIdEqualTo(id);
      } while (datarecordMapper.countByExample(datarecordExample) != 0);

    } catch (SQLException ex) {
      Logger.getLogger(Datarecords.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      if (sqlSession != null)
        sqlSession.close();
    }

    return id;
  }

  public Datarecord create(Event event, FormVersion formVersion) {
    return create(event, formVersion, null);
  }

  public Datarecord create(Event event, FormVersion formVersion,
      Long datarecordId) {
    Datarecord datarecord = new Datarecord();
    datarecord.setId(datarecordId == null ? newId() : datarecordId);
    datarecord.setStatus("COMPLETED");
    datarecord.setFilledoutlabel("#1");
    Integer sequence =
        findAllByFormversionIdAndEventId(formVersion.getId(), event.getId())
            .size();
    datarecord.setEventsequence(sequence + 1L);
    datarecord.setCreatorid("ym");
    datarecord.setLastupdid("ym");
    datarecord.setCreateddate(new Date(RubyDate.today().getTime()));
    datarecord.setLastupddate(new Date(RubyDate.today().getTime()));
    datarecord.setFormversionid(formVersion.getId());
    datarecord.setEventid(event.getId());

    insert(datarecord);

    return datarecord;
  }

  public void update(final Datarecord datarecord) {
    update(datarecord, new Example<DatarecordExample>() {

      @Override
      public void set(DatarecordExample example) {
        example.or().andIdEqualTo(datarecord.getId());
      }

    });
  }

  public void delete(final Datarecord datarecord) {
    delete(new Example<DatarecordExample>() {

      @Override
      public void set(DatarecordExample example) {
        example.or().andIdEqualTo(datarecord.getId());
      }

    });
  }

  public Datarecord findById(final Long id) {
    List<Datarecord> datarecords = select(new Example<DatarecordExample>() {

      @Override
      public void set(DatarecordExample example) {
        example.or().andIdEqualTo(id);
      }

    });

    return datarecords.isEmpty() ? null : datarecords.get(0);
  }

  public List<Datarecord> findAllByFormversionIdAndEventId(
      final Long formversionId, final Long eventId) {
    return select(new Example<DatarecordExample>() {

      @Override
      public void set(DatarecordExample example) {
        example.or().andFormversionidEqualTo(formversionId)
            .andEventidEqualTo(eventId);
      }

    });
  }

  public List<Datarecord> findAllByFormversionId(final Long formversionId) {
    return select(new Example<DatarecordExample>() {

      @Override
      public void set(DatarecordExample example) {
        example.or().andFormversionidEqualTo(formversionId);
      }

    });
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<DatarecordExample> getExampleClass() {
    return DatarecordExample.class;
  }

  @Override
  protected Class<DatarecordMapper> getMapperClass() {
    return DatarecordMapper.class;
  }

}
