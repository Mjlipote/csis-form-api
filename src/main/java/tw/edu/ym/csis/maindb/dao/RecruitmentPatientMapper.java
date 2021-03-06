package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.RecruitmentPatient;
import tw.edu.ym.csis.maindb.model.RecruitmentPatientExample;

public interface RecruitmentPatientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECRUITMENTPATIENT
     *
     * @mbggenerated
     */
    int countByExample(RecruitmentPatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECRUITMENTPATIENT
     *
     * @mbggenerated
     */
    int deleteByExample(RecruitmentPatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECRUITMENTPATIENT
     *
     * @mbggenerated
     */
    int insert(RecruitmentPatient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECRUITMENTPATIENT
     *
     * @mbggenerated
     */
    int insertSelective(RecruitmentPatient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECRUITMENTPATIENT
     *
     * @mbggenerated
     */
    List<RecruitmentPatient> selectByExample(RecruitmentPatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECRUITMENTPATIENT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RecruitmentPatient record, @Param("example") RecruitmentPatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECRUITMENTPATIENT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RecruitmentPatient record, @Param("example") RecruitmentPatientExample example);
}