package tw.edu.ym.csis.maindb.model;

import java.util.Date;

public class StudyPlan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYPLAN.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYPLAN.PROTOCOLID
     *
     * @mbggenerated
     */
    private Long protocolid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYPLAN.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYPLAN.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYPLAN.CREATION_DT
     *
     * @mbggenerated
     */
    private Date creationDt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYPLAN.CREATED_BY
     *
     * @mbggenerated
     */
    private Long createdBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYPLAN.ID
     *
     * @return the value of STUDYPLAN.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYPLAN.ID
     *
     * @param id the value for STUDYPLAN.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYPLAN.PROTOCOLID
     *
     * @return the value of STUDYPLAN.PROTOCOLID
     *
     * @mbggenerated
     */
    public Long getProtocolid() {
        return protocolid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYPLAN.PROTOCOLID
     *
     * @param protocolid the value for STUDYPLAN.PROTOCOLID
     *
     * @mbggenerated
     */
    public void setProtocolid(Long protocolid) {
        this.protocolid = protocolid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYPLAN.NAME
     *
     * @return the value of STUDYPLAN.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYPLAN.NAME
     *
     * @param name the value for STUDYPLAN.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYPLAN.DESCRIPTION
     *
     * @return the value of STUDYPLAN.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYPLAN.DESCRIPTION
     *
     * @param description the value for STUDYPLAN.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYPLAN.CREATION_DT
     *
     * @return the value of STUDYPLAN.CREATION_DT
     *
     * @mbggenerated
     */
    public Date getCreationDt() {
        return creationDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYPLAN.CREATION_DT
     *
     * @param creationDt the value for STUDYPLAN.CREATION_DT
     *
     * @mbggenerated
     */
    public void setCreationDt(Date creationDt) {
        this.creationDt = creationDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYPLAN.CREATED_BY
     *
     * @return the value of STUDYPLAN.CREATED_BY
     *
     * @mbggenerated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYPLAN.CREATED_BY
     *
     * @param createdBy the value for STUDYPLAN.CREATED_BY
     *
     * @mbggenerated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }
}