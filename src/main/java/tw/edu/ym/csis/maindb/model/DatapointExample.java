package tw.edu.ym.csis.maindb.model;

import java.util.ArrayList;
import java.util.List;

public class DatapointExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public DatapointExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andElementidIsNull() {
            addCriterion("ELEMENTID is null");
            return (Criteria) this;
        }

        public Criteria andElementidIsNotNull() {
            addCriterion("ELEMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andElementidEqualTo(Long value) {
            addCriterion("ELEMENTID =", value, "elementid");
            return (Criteria) this;
        }

        public Criteria andElementidNotEqualTo(Long value) {
            addCriterion("ELEMENTID <>", value, "elementid");
            return (Criteria) this;
        }

        public Criteria andElementidGreaterThan(Long value) {
            addCriterion("ELEMENTID >", value, "elementid");
            return (Criteria) this;
        }

        public Criteria andElementidGreaterThanOrEqualTo(Long value) {
            addCriterion("ELEMENTID >=", value, "elementid");
            return (Criteria) this;
        }

        public Criteria andElementidLessThan(Long value) {
            addCriterion("ELEMENTID <", value, "elementid");
            return (Criteria) this;
        }

        public Criteria andElementidLessThanOrEqualTo(Long value) {
            addCriterion("ELEMENTID <=", value, "elementid");
            return (Criteria) this;
        }

        public Criteria andElementidIn(List<Long> values) {
            addCriterion("ELEMENTID in", values, "elementid");
            return (Criteria) this;
        }

        public Criteria andElementidNotIn(List<Long> values) {
            addCriterion("ELEMENTID not in", values, "elementid");
            return (Criteria) this;
        }

        public Criteria andElementidBetween(Long value1, Long value2) {
            addCriterion("ELEMENTID between", value1, value2, "elementid");
            return (Criteria) this;
        }

        public Criteria andElementidNotBetween(Long value1, Long value2) {
            addCriterion("ELEMENTID not between", value1, value2, "elementid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidIsNull() {
            addCriterion("MEASUNITID is null");
            return (Criteria) this;
        }

        public Criteria andMeasunitidIsNotNull() {
            addCriterion("MEASUNITID is not null");
            return (Criteria) this;
        }

        public Criteria andMeasunitidEqualTo(Long value) {
            addCriterion("MEASUNITID =", value, "measunitid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidNotEqualTo(Long value) {
            addCriterion("MEASUNITID <>", value, "measunitid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidGreaterThan(Long value) {
            addCriterion("MEASUNITID >", value, "measunitid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidGreaterThanOrEqualTo(Long value) {
            addCriterion("MEASUNITID >=", value, "measunitid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidLessThan(Long value) {
            addCriterion("MEASUNITID <", value, "measunitid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidLessThanOrEqualTo(Long value) {
            addCriterion("MEASUNITID <=", value, "measunitid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidIn(List<Long> values) {
            addCriterion("MEASUNITID in", values, "measunitid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidNotIn(List<Long> values) {
            addCriterion("MEASUNITID not in", values, "measunitid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidBetween(Long value1, Long value2) {
            addCriterion("MEASUNITID between", value1, value2, "measunitid");
            return (Criteria) this;
        }

        public Criteria andMeasunitidNotBetween(Long value1, Long value2) {
            addCriterion("MEASUNITID not between", value1, value2, "measunitid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidIsNull() {
            addCriterion("DATATYPEID is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeidIsNotNull() {
            addCriterion("DATATYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeidEqualTo(Long value) {
            addCriterion("DATATYPEID =", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidNotEqualTo(Long value) {
            addCriterion("DATATYPEID <>", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidGreaterThan(Long value) {
            addCriterion("DATATYPEID >", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("DATATYPEID >=", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidLessThan(Long value) {
            addCriterion("DATATYPEID <", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidLessThanOrEqualTo(Long value) {
            addCriterion("DATATYPEID <=", value, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidIn(List<Long> values) {
            addCriterion("DATATYPEID in", values, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidNotIn(List<Long> values) {
            addCriterion("DATATYPEID not in", values, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidBetween(Long value1, Long value2) {
            addCriterion("DATATYPEID between", value1, value2, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andDatatypeidNotBetween(Long value1, Long value2) {
            addCriterion("DATATYPEID not between", value1, value2, "datatypeid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andHighthresholdIsNull() {
            addCriterion("HIGHTHRESHOLD is null");
            return (Criteria) this;
        }

        public Criteria andHighthresholdIsNotNull() {
            addCriterion("HIGHTHRESHOLD is not null");
            return (Criteria) this;
        }

        public Criteria andHighthresholdEqualTo(Long value) {
            addCriterion("HIGHTHRESHOLD =", value, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andHighthresholdNotEqualTo(Long value) {
            addCriterion("HIGHTHRESHOLD <>", value, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andHighthresholdGreaterThan(Long value) {
            addCriterion("HIGHTHRESHOLD >", value, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andHighthresholdGreaterThanOrEqualTo(Long value) {
            addCriterion("HIGHTHRESHOLD >=", value, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andHighthresholdLessThan(Long value) {
            addCriterion("HIGHTHRESHOLD <", value, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andHighthresholdLessThanOrEqualTo(Long value) {
            addCriterion("HIGHTHRESHOLD <=", value, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andHighthresholdIn(List<Long> values) {
            addCriterion("HIGHTHRESHOLD in", values, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andHighthresholdNotIn(List<Long> values) {
            addCriterion("HIGHTHRESHOLD not in", values, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andHighthresholdBetween(Long value1, Long value2) {
            addCriterion("HIGHTHRESHOLD between", value1, value2, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andHighthresholdNotBetween(Long value1, Long value2) {
            addCriterion("HIGHTHRESHOLD not between", value1, value2, "highthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdIsNull() {
            addCriterion("LOWTHRESHOLD is null");
            return (Criteria) this;
        }

        public Criteria andLowthresholdIsNotNull() {
            addCriterion("LOWTHRESHOLD is not null");
            return (Criteria) this;
        }

        public Criteria andLowthresholdEqualTo(Long value) {
            addCriterion("LOWTHRESHOLD =", value, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdNotEqualTo(Long value) {
            addCriterion("LOWTHRESHOLD <>", value, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdGreaterThan(Long value) {
            addCriterion("LOWTHRESHOLD >", value, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOWTHRESHOLD >=", value, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdLessThan(Long value) {
            addCriterion("LOWTHRESHOLD <", value, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdLessThanOrEqualTo(Long value) {
            addCriterion("LOWTHRESHOLD <=", value, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdIn(List<Long> values) {
            addCriterion("LOWTHRESHOLD in", values, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdNotIn(List<Long> values) {
            addCriterion("LOWTHRESHOLD not in", values, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdBetween(Long value1, Long value2) {
            addCriterion("LOWTHRESHOLD between", value1, value2, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andLowthresholdNotBetween(Long value1, Long value2) {
            addCriterion("LOWTHRESHOLD not between", value1, value2, "lowthreshold");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andDcpidIsNull() {
            addCriterion("DCPID is null");
            return (Criteria) this;
        }

        public Criteria andDcpidIsNotNull() {
            addCriterion("DCPID is not null");
            return (Criteria) this;
        }

        public Criteria andDcpidEqualTo(Long value) {
            addCriterion("DCPID =", value, "dcpid");
            return (Criteria) this;
        }

        public Criteria andDcpidNotEqualTo(Long value) {
            addCriterion("DCPID <>", value, "dcpid");
            return (Criteria) this;
        }

        public Criteria andDcpidGreaterThan(Long value) {
            addCriterion("DCPID >", value, "dcpid");
            return (Criteria) this;
        }

        public Criteria andDcpidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCPID >=", value, "dcpid");
            return (Criteria) this;
        }

        public Criteria andDcpidLessThan(Long value) {
            addCriterion("DCPID <", value, "dcpid");
            return (Criteria) this;
        }

        public Criteria andDcpidLessThanOrEqualTo(Long value) {
            addCriterion("DCPID <=", value, "dcpid");
            return (Criteria) this;
        }

        public Criteria andDcpidIn(List<Long> values) {
            addCriterion("DCPID in", values, "dcpid");
            return (Criteria) this;
        }

        public Criteria andDcpidNotIn(List<Long> values) {
            addCriterion("DCPID not in", values, "dcpid");
            return (Criteria) this;
        }

        public Criteria andDcpidBetween(Long value1, Long value2) {
            addCriterion("DCPID between", value1, value2, "dcpid");
            return (Criteria) this;
        }

        public Criteria andDcpidNotBetween(Long value1, Long value2) {
            addCriterion("DCPID not between", value1, value2, "dcpid");
            return (Criteria) this;
        }

        public Criteria andName081IsNull() {
            addCriterion("NAME_081 is null");
            return (Criteria) this;
        }

        public Criteria andName081IsNotNull() {
            addCriterion("NAME_081 is not null");
            return (Criteria) this;
        }

        public Criteria andName081EqualTo(String value) {
            addCriterion("NAME_081 =", value, "name081");
            return (Criteria) this;
        }

        public Criteria andName081NotEqualTo(String value) {
            addCriterion("NAME_081 <>", value, "name081");
            return (Criteria) this;
        }

        public Criteria andName081GreaterThan(String value) {
            addCriterion("NAME_081 >", value, "name081");
            return (Criteria) this;
        }

        public Criteria andName081GreaterThanOrEqualTo(String value) {
            addCriterion("NAME_081 >=", value, "name081");
            return (Criteria) this;
        }

        public Criteria andName081LessThan(String value) {
            addCriterion("NAME_081 <", value, "name081");
            return (Criteria) this;
        }

        public Criteria andName081LessThanOrEqualTo(String value) {
            addCriterion("NAME_081 <=", value, "name081");
            return (Criteria) this;
        }

        public Criteria andName081Like(String value) {
            addCriterion("NAME_081 like", value, "name081");
            return (Criteria) this;
        }

        public Criteria andName081NotLike(String value) {
            addCriterion("NAME_081 not like", value, "name081");
            return (Criteria) this;
        }

        public Criteria andName081In(List<String> values) {
            addCriterion("NAME_081 in", values, "name081");
            return (Criteria) this;
        }

        public Criteria andName081NotIn(List<String> values) {
            addCriterion("NAME_081 not in", values, "name081");
            return (Criteria) this;
        }

        public Criteria andName081Between(String value1, String value2) {
            addCriterion("NAME_081 between", value1, value2, "name081");
            return (Criteria) this;
        }

        public Criteria andName081NotBetween(String value1, String value2) {
            addCriterion("NAME_081 not between", value1, value2, "name081");
            return (Criteria) this;
        }

        public Criteria andInternalCodeIsNull() {
            addCriterion("INTERNAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInternalCodeIsNotNull() {
            addCriterion("INTERNAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInternalCodeEqualTo(String value) {
            addCriterion("INTERNAL_CODE =", value, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeNotEqualTo(String value) {
            addCriterion("INTERNAL_CODE <>", value, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeGreaterThan(String value) {
            addCriterion("INTERNAL_CODE >", value, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INTERNAL_CODE >=", value, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeLessThan(String value) {
            addCriterion("INTERNAL_CODE <", value, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeLessThanOrEqualTo(String value) {
            addCriterion("INTERNAL_CODE <=", value, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeLike(String value) {
            addCriterion("INTERNAL_CODE like", value, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeNotLike(String value) {
            addCriterion("INTERNAL_CODE not like", value, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeIn(List<String> values) {
            addCriterion("INTERNAL_CODE in", values, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeNotIn(List<String> values) {
            addCriterion("INTERNAL_CODE not in", values, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeBetween(String value1, String value2) {
            addCriterion("INTERNAL_CODE between", value1, value2, "internalCode");
            return (Criteria) this;
        }

        public Criteria andInternalCodeNotBetween(String value1, String value2) {
            addCriterion("INTERNAL_CODE not between", value1, value2, "internalCode");
            return (Criteria) this;
        }

        public Criteria andMinvalIsNull() {
            addCriterion("MINVAL is null");
            return (Criteria) this;
        }

        public Criteria andMinvalIsNotNull() {
            addCriterion("MINVAL is not null");
            return (Criteria) this;
        }

        public Criteria andMinvalEqualTo(String value) {
            addCriterion("MINVAL =", value, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalNotEqualTo(String value) {
            addCriterion("MINVAL <>", value, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalGreaterThan(String value) {
            addCriterion("MINVAL >", value, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalGreaterThanOrEqualTo(String value) {
            addCriterion("MINVAL >=", value, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalLessThan(String value) {
            addCriterion("MINVAL <", value, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalLessThanOrEqualTo(String value) {
            addCriterion("MINVAL <=", value, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalLike(String value) {
            addCriterion("MINVAL like", value, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalNotLike(String value) {
            addCriterion("MINVAL not like", value, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalIn(List<String> values) {
            addCriterion("MINVAL in", values, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalNotIn(List<String> values) {
            addCriterion("MINVAL not in", values, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalBetween(String value1, String value2) {
            addCriterion("MINVAL between", value1, value2, "minval");
            return (Criteria) this;
        }

        public Criteria andMinvalNotBetween(String value1, String value2) {
            addCriterion("MINVAL not between", value1, value2, "minval");
            return (Criteria) this;
        }

        public Criteria andMaxvalIsNull() {
            addCriterion("MAXVAL is null");
            return (Criteria) this;
        }

        public Criteria andMaxvalIsNotNull() {
            addCriterion("MAXVAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaxvalEqualTo(String value) {
            addCriterion("MAXVAL =", value, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalNotEqualTo(String value) {
            addCriterion("MAXVAL <>", value, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalGreaterThan(String value) {
            addCriterion("MAXVAL >", value, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalGreaterThanOrEqualTo(String value) {
            addCriterion("MAXVAL >=", value, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalLessThan(String value) {
            addCriterion("MAXVAL <", value, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalLessThanOrEqualTo(String value) {
            addCriterion("MAXVAL <=", value, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalLike(String value) {
            addCriterion("MAXVAL like", value, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalNotLike(String value) {
            addCriterion("MAXVAL not like", value, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalIn(List<String> values) {
            addCriterion("MAXVAL in", values, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalNotIn(List<String> values) {
            addCriterion("MAXVAL not in", values, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalBetween(String value1, String value2) {
            addCriterion("MAXVAL between", value1, value2, "maxval");
            return (Criteria) this;
        }

        public Criteria andMaxvalNotBetween(String value1, String value2) {
            addCriterion("MAXVAL not between", value1, value2, "maxval");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DATAPOINT
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DATAPOINT
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}