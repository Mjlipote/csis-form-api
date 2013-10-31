package tw.edu.ym.csis.formapi.helper;

import static net.sf.rubycollect4j.RubyCollections.ra;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.rubycollect4j.RubyDate;
import net.sf.rubycollect4j.block.TransformBlock;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.DatapointDatarecordMapper;
import tw.edu.ym.csis.maindb.model.Datapoint;
import tw.edu.ym.csis.maindb.model.DatapointDatarecord;
import tw.edu.ym.csis.maindb.model.DatapointDatarecordExample;
import tw.edu.ym.csis.maindb.model.Datarecord;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class DatapointDatarecords
    extends
    MyBatisBase<DatapointDatarecord, DatapointDatarecordExample, DatapointDatarecordMapper> {

  private final SqlSessionFactory sessionFactory;

  public DatapointDatarecords(SqlSessionFactory main) {
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

      DatapointDatarecordExample dpdrExample;
      DatapointDatarecordMapper dpdrMapper =
          sqlSession.getMapper(DatapointDatarecordMapper.class);
      String query = "select DATAPOINTDATARECORD_SEQ.nextval as id from dual";
      do {
        stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        result.next();
        id = result.getLong(1);
        stmt.close();

        dpdrExample = new DatapointDatarecordExample();
        dpdrExample.or().andIdEqualTo(id);
      } while (dpdrMapper.countByExample(dpdrExample) != 0);
    } catch (SQLException ex) {
      Logger.getLogger(DatapointDatarecords.class.getName()).log(Level.SEVERE,
          null, ex);
    } finally {
      if (sqlSession != null)
        sqlSession.close();
    }

    return id;
  }

  public DatapointDatarecord create(Datapoint datapoint, Datarecord datarecord,
      String value) {
    DatapointDatarecord datapointDatarecord = new DatapointDatarecord();
    datapointDatarecord.setId(newId());
    datapointDatarecord.setCreatorid("ym");
    datapointDatarecord.setLastupdid("ym");
    datapointDatarecord.setCreateddate(new Date(RubyDate.today().getTime()));
    datapointDatarecord.setLastupddate(new Date(RubyDate.today().getTime()));
    datapointDatarecord.setDatapointid(datapoint.getId());
    datapointDatarecord.setDatarecordid(datarecord.getId());
    datapointDatarecord.setValue(value);

    insert(datapointDatarecord);

    return datapointDatarecord;
  }

  public void update(final DatapointDatarecord dpdr, String value) {
    dpdr.setValue(value);

    update(dpdr, new Example<DatapointDatarecordExample>() {

      @Override
      public void set(DatapointDatarecordExample example) {
        example.or().andIdEqualTo(dpdr.getId());
      }

    });
  }

  public void delete(List<DatapointDatarecord> datapointDatarecords) {
    if (ra(datapointDatarecords).anyʔ()) {
      final List<Long> ids =
          ra(datapointDatarecords).map(
              new TransformBlock<DatapointDatarecord, Long>() {

                @Override
                public Long yield(DatapointDatarecord item) {
                  return item.getId();
                }

              });

      delete(new Example<DatapointDatarecordExample>() {

        @Override
        public void set(DatapointDatarecordExample example) {
          example.or().andIdIn(ids);
        }

      });
    }
  }

  public List<DatapointDatarecord>
      findAllByDatarecordId(final Long datarecordId) {
    return select(new Example<DatapointDatarecordExample>() {

      @Override
      public void set(DatapointDatarecordExample example) {
        example.setDistinct(true);
        example.or().andDatarecordidEqualTo(datarecordId);
      }

    });
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<DatapointDatarecordExample> getExampleClass() {
    return DatapointDatarecordExample.class;
  }

  @Override
  protected Class<DatapointDatarecordMapper> getMapperClass() {
    return DatapointDatarecordMapper.class;
  }

}
