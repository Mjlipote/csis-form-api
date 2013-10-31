package tw.edu.ym.csis.formapi.helper;

import static com.google.common.base.Preconditions.checkNotNull;

import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.FormVersionMapper;
import tw.edu.ym.csis.maindb.model.FormVersion;
import tw.edu.ym.csis.maindb.model.FormVersionExample;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class FormVersions extends
    MyBatisBase<FormVersion, FormVersionExample, FormVersionMapper> {

  private final SqlSessionFactory sessionFactory;

  public FormVersions(SqlSessionFactory main) {
    sessionFactory = checkNotNull(main);
  }

  public FormVersion findById(final Long id) {
    return selectOne(new Example<FormVersionExample>() {

      @Override
      public void set(FormVersionExample example) {
        example.or().andIdEqualTo(id);
      }

    });
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<FormVersionExample> getExampleClass() {
    return FormVersionExample.class;
  }

  @Override
  protected Class<FormVersionMapper> getMapperClass() {
    return FormVersionMapper.class;
  }

}
