package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.Event;
import tw.edu.ym.csis.maindb.model.EventExample;

public interface EventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT
     *
     * @mbggenerated
     */
    int countByExample(EventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT
     *
     * @mbggenerated
     */
    int deleteByExample(EventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT
     *
     * @mbggenerated
     */
    int insert(Event record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT
     *
     * @mbggenerated
     */
    int insertSelective(Event record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT
     *
     * @mbggenerated
     */
    List<Event> selectByExample(EventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);
}