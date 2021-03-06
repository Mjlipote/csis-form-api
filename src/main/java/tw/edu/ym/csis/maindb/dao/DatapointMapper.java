package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.Datapoint;
import tw.edu.ym.csis.maindb.model.DatapointExample;

public interface DatapointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    int countByExample(DatapointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    int deleteByExample(DatapointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    int insert(Datapoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    int insertSelective(Datapoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    List<Datapoint> selectByExample(DatapointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Datapoint record, @Param("example") DatapointExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Datapoint record, @Param("example") DatapointExample example);
}