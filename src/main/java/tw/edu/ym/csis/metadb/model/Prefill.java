package tw.edu.ym.csis.metadb.model;

public class Prefill {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PREFILL.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PREFILL.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PREFILL.PATH
     *
     * @mbggenerated
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PREFILL.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PREFILL.FORMAT
     *
     * @mbggenerated
     */
    private String format;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PREFILL.DCPID
     *
     * @mbggenerated
     */
    private Long dcpid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PREFILL.ID
     *
     * @return the value of PREFILL.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PREFILL.ID
     *
     * @param id the value for PREFILL.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PREFILL.DESCRIPTION
     *
     * @return the value of PREFILL.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PREFILL.DESCRIPTION
     *
     * @param description the value for PREFILL.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PREFILL.PATH
     *
     * @return the value of PREFILL.PATH
     *
     * @mbggenerated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PREFILL.PATH
     *
     * @param path the value for PREFILL.PATH
     *
     * @mbggenerated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PREFILL.TYPE
     *
     * @return the value of PREFILL.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PREFILL.TYPE
     *
     * @param type the value for PREFILL.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PREFILL.FORMAT
     *
     * @return the value of PREFILL.FORMAT
     *
     * @mbggenerated
     */
    public String getFormat() {
        return format;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PREFILL.FORMAT
     *
     * @param format the value for PREFILL.FORMAT
     *
     * @mbggenerated
     */
    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PREFILL.DCPID
     *
     * @return the value of PREFILL.DCPID
     *
     * @mbggenerated
     */
    public Long getDcpid() {
        return dcpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PREFILL.DCPID
     *
     * @param dcpid the value for PREFILL.DCPID
     *
     * @mbggenerated
     */
    public void setDcpid(Long dcpid) {
        this.dcpid = dcpid;
    }
}