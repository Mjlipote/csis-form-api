package tw.edu.ym.csis.formapi.helper;

import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.FormMapper;
import tw.edu.ym.csis.maindb.model.Form;
import tw.edu.ym.csis.maindb.model.FormExample;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class Forms extends MyBatisBase<Form, FormExample, FormMapper> {

  private final SqlSessionFactory sessionFactory;

  public Forms(SqlSessionFactory main) {
    sessionFactory = main;
  }

  public Form findById(final Long id) {
    return selectOne(new Example<FormExample>() {

      @Override
      public void set(FormExample example) {
        example.or().andIdEqualTo(id);
      }

    });
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<FormExample> getExampleClass() {
    return FormExample.class;
  }

  @Override
  protected Class<FormMapper> getMapperClass() {
    return FormMapper.class;
  }

}
