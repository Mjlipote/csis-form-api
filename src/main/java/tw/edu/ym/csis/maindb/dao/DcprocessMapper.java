package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.Dcprocess;
import tw.edu.ym.csis.maindb.model.DcprocessExample;

public interface DcprocessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DCPROCESS
     *
     * @mbggenerated
     */
    int countByExample(DcprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DCPROCESS
     *
     * @mbggenerated
     */
    int deleteByExample(DcprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DCPROCESS
     *
     * @mbggenerated
     */
    int insert(Dcprocess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DCPROCESS
     *
     * @mbggenerated
     */
    int insertSelective(Dcprocess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DCPROCESS
     *
     * @mbggenerated
     */
    List<Dcprocess> selectByExample(DcprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DCPROCESS
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Dcprocess record, @Param("example") DcprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DCPROCESS
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Dcprocess record, @Param("example") DcprocessExample example);
}