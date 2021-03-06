package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.CsisTabColumn;
import tw.edu.ym.csis.maindb.model.CsisTabColumnExample;

public interface CsisTabColumnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABCOLUMN
     *
     * @mbggenerated
     */
    int countByExample(CsisTabColumnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABCOLUMN
     *
     * @mbggenerated
     */
    int deleteByExample(CsisTabColumnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABCOLUMN
     *
     * @mbggenerated
     */
    int insert(CsisTabColumn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABCOLUMN
     *
     * @mbggenerated
     */
    int insertSelective(CsisTabColumn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABCOLUMN
     *
     * @mbggenerated
     */
    List<CsisTabColumn> selectByExample(CsisTabColumnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABCOLUMN
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CsisTabColumn record, @Param("example") CsisTabColumnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CSISTABCOLUMN
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CsisTabColumn record, @Param("example") CsisTabColumnExample example);
}