package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.CsisTable;
import tw.edu.ym.csis.maindb.model.CsisTableExample;

public interface CsisTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABLE
     *
     * @mbggenerated
     */
    int countByExample(CsisTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABLE
     *
     * @mbggenerated
     */
    int deleteByExample(CsisTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABLE
     *
     * @mbggenerated
     */
    int insert(CsisTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABLE
     *
     * @mbggenerated
     */
    int insertSelective(CsisTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABLE
     *
     * @mbggenerated
     */
    List<CsisTable> selectByExample(CsisTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABLE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CsisTable record, @Param("example") CsisTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABLE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CsisTable record, @Param("example") CsisTableExample example);
}