package tw.edu.ym.csis.maindb.model;

public class Permission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PERMISSION.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PERMISSION.PERMISSION
     *
     * @mbggenerated
     */
    private String permission;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PERMISSION.DISPLAYORDER
     *
     * @mbggenerated
     */
    private Long displayorder;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PERMISSION.ID
     *
     * @return the value of PERMISSION.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PERMISSION.ID
     *
     * @param id the value for PERMISSION.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PERMISSION.PERMISSION
     *
     * @return the value of PERMISSION.PERMISSION
     *
     * @mbggenerated
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PERMISSION.PERMISSION
     *
     * @param permission the value for PERMISSION.PERMISSION
     *
     * @mbggenerated
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PERMISSION.DISPLAYORDER
     *
     * @return the value of PERMISSION.DISPLAYORDER
     *
     * @mbggenerated
     */
    public Long getDisplayorder() {
        return displayorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PERMISSION.DISPLAYORDER
     *
     * @param displayorder the value for PERMISSION.DISPLAYORDER
     *
     * @mbggenerated
     */
    public void setDisplayorder(Long displayorder) {
        this.displayorder = displayorder;
    }
}