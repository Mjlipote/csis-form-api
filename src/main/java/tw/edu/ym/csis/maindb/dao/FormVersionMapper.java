package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.FormVersion;
import tw.edu.ym.csis.maindb.model.FormVersionExample;

public interface FormVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMVERSION
     *
     * @mbggenerated
     */
    int countByExample(FormVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMVERSION
     *
     * @mbggenerated
     */
    int deleteByExample(FormVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMVERSION
     *
     * @mbggenerated
     */
    int insert(FormVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMVERSION
     *
     * @mbggenerated
     */
    int insertSelective(FormVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMVERSION
     *
     * @mbggenerated
     */
    List<FormVersion> selectByExample(FormVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMVERSION
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FormVersion record, @Param("example") FormVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMVERSION
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FormVersion record, @Param("example") FormVersionExample example);
}