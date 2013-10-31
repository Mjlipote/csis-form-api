package tw.edu.ym.csis.metadb.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.metadb.model.SkippingRuleDetail;
import tw.edu.ym.csis.metadb.model.SkippingRuleDetailExample;

public interface SkippingRuleDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    int countByExample(SkippingRuleDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    int deleteByExample(SkippingRuleDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    int insert(SkippingRuleDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    int insertSelective(SkippingRuleDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    List<SkippingRuleDetail> selectByExample(SkippingRuleDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    SkippingRuleDetail selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SkippingRuleDetail record, @Param("example") SkippingRuleDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SkippingRuleDetail record, @Param("example") SkippingRuleDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SkippingRuleDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SkippingRuleDetail record);
}