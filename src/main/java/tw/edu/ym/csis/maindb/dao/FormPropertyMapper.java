package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.FormProperty;
import tw.edu.ym.csis.maindb.model.FormPropertyExample;

public interface FormPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMPROPERTY
     *
     * @mbggenerated
     */
    int countByExample(FormPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMPROPERTY
     *
     * @mbggenerated
     */
    int deleteByExample(FormPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMPROPERTY
     *
     * @mbggenerated
     */
    int insert(FormProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMPROPERTY
     *
     * @mbggenerated
     */
    int insertSelective(FormProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMPROPERTY
     *
     * @mbggenerated
     */
    List<FormProperty> selectByExample(FormPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMPROPERTY
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FormProperty record, @Param("example") FormPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FORMPROPERTY
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FormProperty record, @Param("example") FormPropertyExample example);
}