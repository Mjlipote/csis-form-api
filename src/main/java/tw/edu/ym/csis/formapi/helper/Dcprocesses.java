package tw.edu.ym.csis.formapi.helper;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import tw.edu.ym.csis.maindb.dao.DcprocessMapper;
import tw.edu.ym.csis.maindb.model.Dcprocess;
import tw.edu.ym.csis.maindb.model.DcprocessExample;
import tw.edu.ym.csis.maindb.model.Form;
import tw.edu.ym.csis.maindb.model.FormVersion;
import wmw.db.mybatis.Example;
import wmw.db.mybatis.MyBatisBase;

/**
 * 
 * @author Wei-Ming Wu
 * 
 */
public final class Dcprocesses extends
    MyBatisBase<Dcprocess, DcprocessExample, DcprocessMapper> {

  private final SqlSessionFactory sessionFactory;

  public Dcprocesses(SqlSessionFactory main) {
    sessionFactory = main;
  }

  public Dcprocess findByFormVersion(FormVersion formVersion) {
    final Form form =
        new Forms(sessionFactory).findById(formVersion.getFormid());
    if (form == null)
      return null;

    List<Dcprocess> dcprocesses = select(new Example<DcprocessExample>() {

      @Override
      public void set(DcprocessExample example) {
        example.or().andIdEqualTo(form.getDcpid());
      }

    });

    return dcprocesses.isEmpty() ? null : dcprocesses.get(0);
  }

  @Override
  protected SqlSessionFactory getSessionFactory() {
    return sessionFactory;
  }

  @Override
  protected Class<DcprocessExample> getExampleClass() {
    return DcprocessExample.class;
  }

  @Override
  protected Class<DcprocessMapper> getMapperClass() {
    return DcprocessMapper.class;
  }

}
