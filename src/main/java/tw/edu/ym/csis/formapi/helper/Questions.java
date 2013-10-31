package tw.edu.ym.csis.formapi.helper;

import static net.sf.rubycollect4j.RubyCollections.ra;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.metadb.dao.QuestionMapper;
import tw.edu.ym.csis.metadb.model.Question;
import tw.edu.ym.csis.metadb.model.QuestionExample;
import tw.edu.ym.csis.metadb.model.Section;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class Questions extends
    MyBatisBase<Question, QuestionExample, QuestionMapper> {

  private final SqlSessionFactory sessionFactory;

  public Questions(SqlSessionFactory meta) {
    sessionFactory = meta;
  }

  public List<Question> findAllBySections(List<Section> sections) {
    final List<Long> ids = ra(sections).map("getId");

    return select(new Example<QuestionExample>() {

      @Override
      public void set(QuestionExample example) {
        example.or().andSectionidIn(ids);
      }

    });
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<QuestionExample> getExampleClass() {
    return QuestionExample.class;
  }

  @Override
  protected Class<QuestionMapper> getMapperClass() {
    return QuestionMapper.class;
  }

}
