package tw.edu.ym.csis.maindb.model;

import java.util.Date;

public class DeletedContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DELETEDCONTENT.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DELETEDCONTENT.PERSONID
     *
     * @mbggenerated
     */
    private Long personid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DELETEDCONTENT.ACTIONTIMESTAMP
     *
     * @mbggenerated
     */
    private Date actiontimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DELETEDCONTENT.CLOBCONTENTID
     *
     * @mbggenerated
     */
    private Long clobcontentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DELETEDCONTENT.CLOBCONTENTTYPE
     *
     * @mbggenerated
     */
    private String clobcontenttype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DELETEDCONTENT.ID
     *
     * @return the value of DELETEDCONTENT.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DELETEDCONTENT.ID
     *
     * @param id the value for DELETEDCONTENT.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DELETEDCONTENT.PERSONID
     *
     * @return the value of DELETEDCONTENT.PERSONID
     *
     * @mbggenerated
     */
    public Long getPersonid() {
        return personid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DELETEDCONTENT.PERSONID
     *
     * @param personid the value for DELETEDCONTENT.PERSONID
     *
     * @mbggenerated
     */
    public void setPersonid(Long personid) {
        this.personid = personid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DELETEDCONTENT.ACTIONTIMESTAMP
     *
     * @return the value of DELETEDCONTENT.ACTIONTIMESTAMP
     *
     * @mbggenerated
     */
    public Date getActiontimestamp() {
        return actiontimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DELETEDCONTENT.ACTIONTIMESTAMP
     *
     * @param actiontimestamp the value for DELETEDCONTENT.ACTIONTIMESTAMP
     *
     * @mbggenerated
     */
    public void setActiontimestamp(Date actiontimestamp) {
        this.actiontimestamp = actiontimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DELETEDCONTENT.CLOBCONTENTID
     *
     * @return the value of DELETEDCONTENT.CLOBCONTENTID
     *
     * @mbggenerated
     */
    public Long getClobcontentid() {
        return clobcontentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DELETEDCONTENT.CLOBCONTENTID
     *
     * @param clobcontentid the value for DELETEDCONTENT.CLOBCONTENTID
     *
     * @mbggenerated
     */
    public void setClobcontentid(Long clobcontentid) {
        this.clobcontentid = clobcontentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DELETEDCONTENT.CLOBCONTENTTYPE
     *
     * @return the value of DELETEDCONTENT.CLOBCONTENTTYPE
     *
     * @mbggenerated
     */
    public String getClobcontenttype() {
        return clobcontenttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DELETEDCONTENT.CLOBCONTENTTYPE
     *
     * @param clobcontenttype the value for DELETEDCONTENT.CLOBCONTENTTYPE
     *
     * @mbggenerated
     */
    public void setClobcontenttype(String clobcontenttype) {
        this.clobcontenttype = clobcontenttype == null ? null : clobcontenttype.trim();
    }
}