package tw.edu.ym.csis.maindb.model;

public class FormProperty {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FORMPROPERTY.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FORMPROPERTY.FORMID
     *
     * @mbggenerated
     */
    private Long formid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FORMPROPERTY.SIGNIFICANT_DPID
     *
     * @mbggenerated
     */
    private Long significantDpid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FORMPROPERTY.FORMGROUPID
     *
     * @mbggenerated
     */
    private Long formgroupid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FORMPROPERTY.ID
     *
     * @return the value of FORMPROPERTY.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FORMPROPERTY.ID
     *
     * @param id the value for FORMPROPERTY.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FORMPROPERTY.FORMID
     *
     * @return the value of FORMPROPERTY.FORMID
     *
     * @mbggenerated
     */
    public Long getFormid() {
        return formid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FORMPROPERTY.FORMID
     *
     * @param formid the value for FORMPROPERTY.FORMID
     *
     * @mbggenerated
     */
    public void setFormid(Long formid) {
        this.formid = formid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FORMPROPERTY.SIGNIFICANT_DPID
     *
     * @return the value of FORMPROPERTY.SIGNIFICANT_DPID
     *
     * @mbggenerated
     */
    public Long getSignificantDpid() {
        return significantDpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FORMPROPERTY.SIGNIFICANT_DPID
     *
     * @param significantDpid the value for FORMPROPERTY.SIGNIFICANT_DPID
     *
     * @mbggenerated
     */
    public void setSignificantDpid(Long significantDpid) {
        this.significantDpid = significantDpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FORMPROPERTY.FORMGROUPID
     *
     * @return the value of FORMPROPERTY.FORMGROUPID
     *
     * @mbggenerated
     */
    public Long getFormgroupid() {
        return formgroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FORMPROPERTY.FORMGROUPID
     *
     * @param formgroupid the value for FORMPROPERTY.FORMGROUPID
     *
     * @mbggenerated
     */
    public void setFormgroupid(Long formgroupid) {
        this.formgroupid = formgroupid;
    }
}