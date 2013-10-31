package tw.edu.ym.csis.formapi.helper;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.collect.Lists.newArrayList;
import static net.sf.rubycollect4j.RubyCollections.ra;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.DatapointMapper;
import tw.edu.ym.csis.maindb.model.Datapoint;
import tw.edu.ym.csis.maindb.model.DatapointExample;
import tw.edu.ym.csis.maindb.model.FormVersion;
import tw.edu.ym.csis.metadb.model.Question;
import tw.edu.ym.csis.metadb.model.Section;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class Datapoints extends
    MyBatisBase<Datapoint, DatapointExample, DatapointMapper> {

  private final SqlSessionFactory sessionFactory;
  private final SqlSessionFactory meta;

  public Datapoints(SqlSessionFactory main, SqlSessionFactory meta) {
    sessionFactory = checkNotNull(main);
    this.meta = checkNotNull(meta);
  }

  public List<Datapoint> findAllByQuesyions(List<Question> questions) {
    final List<Long> ids = ra(questions).map("getDatapointid");

    return select(new Example<DatapointExample>() {

      @Override
      public void set(DatapointExample example) {
        example.setDistinct(true);
        example.or().andIdIn(ids);
      }

    });
  }

  public List<Datapoint> findAllByFormVersionId(Long formVersionId) {
    FormVersion formVersion =
        new FormVersions(sessionFactory).findById(formVersionId);
    if (formVersion == null)
      return newArrayList();
    List<Section> sections =
        new Sections(meta).findAllByFormVersion(formVersion);
    List<Question> questions = new Questions(meta).findAllBySections(sections);
    return findAllByQuesyions(questions);
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<DatapointExample> getExampleClass() {
    return DatapointExample.class;
  }

  @Override
  protected Class<DatapointMapper> getMapperClass() {
    return DatapointMapper.class;
  }

}
