package tw.edu.ym.csis.formapi.helper;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.model.FormVersion;
import tw.edu.ym.csis.metadb.dao.SectionMapper;
import tw.edu.ym.csis.metadb.model.Section;
import tw.edu.ym.csis.metadb.model.SectionExample;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class Sections extends
    MyBatisBase<Section, SectionExample, SectionMapper> {

  private final SqlSessionFactory sessionFactory;

  public Sections(SqlSessionFactory meta) {
    sessionFactory = checkNotNull(meta);
  }

  public List<Section> findAllByFormVersion(final FormVersion formVersion) {
    return select(new Example<SectionExample>() {

      @Override
      public void set(SectionExample example) {
        example.or().andFormversionidEqualTo(formVersion.getId());
      }

    });
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<SectionExample> getExampleClass() {
    return SectionExample.class;
  }

  @Override
  protected Class<SectionMapper> getMapperClass() {
    return SectionMapper.class;
  }

}
