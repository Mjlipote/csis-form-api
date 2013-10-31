package tw.edu.ym.csis.metadb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkippingRuleDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    public SkippingRuleDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
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
     * This method corresponds to the database table SKIPRULEDETAIL
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
     * This method corresponds to the database table SKIPRULEDETAIL
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPRULEDETAIL
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
     * This class corresponds to the database table SKIPRULEDETAIL
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

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidIsNull() {
            addCriterion("SKIPPINGRULEID is null");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidIsNotNull() {
            addCriterion("SKIPPINGRULEID is not null");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidEqualTo(BigDecimal value) {
            addCriterion("SKIPPINGRULEID =", value, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidNotEqualTo(BigDecimal value) {
            addCriterion("SKIPPINGRULEID <>", value, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidGreaterThan(BigDecimal value) {
            addCriterion("SKIPPINGRULEID >", value, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SKIPPINGRULEID >=", value, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidLessThan(BigDecimal value) {
            addCriterion("SKIPPINGRULEID <", value, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SKIPPINGRULEID <=", value, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidIn(List<BigDecimal> values) {
            addCriterion("SKIPPINGRULEID in", values, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidNotIn(List<BigDecimal> values) {
            addCriterion("SKIPPINGRULEID not in", values, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKIPPINGRULEID between", value1, value2, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSkippingruleidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKIPPINGRULEID not between", value1, value2, "skippingruleid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidIsNull() {
            addCriterion("SRCQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidIsNotNull() {
            addCriterion("SRCQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidEqualTo(BigDecimal value) {
            addCriterion("SRCQUESTIONID =", value, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidNotEqualTo(BigDecimal value) {
            addCriterion("SRCQUESTIONID <>", value, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidGreaterThan(BigDecimal value) {
            addCriterion("SRCQUESTIONID >", value, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SRCQUESTIONID >=", value, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidLessThan(BigDecimal value) {
            addCriterion("SRCQUESTIONID <", value, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SRCQUESTIONID <=", value, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidIn(List<BigDecimal> values) {
            addCriterion("SRCQUESTIONID in", values, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidNotIn(List<BigDecimal> values) {
            addCriterion("SRCQUESTIONID not in", values, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SRCQUESTIONID between", value1, value2, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andSrcquestionidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SRCQUESTIONID not between", value1, value2, "srcquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidIsNull() {
            addCriterion("TRGQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidIsNotNull() {
            addCriterion("TRGQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidEqualTo(BigDecimal value) {
            addCriterion("TRGQUESTIONID =", value, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidNotEqualTo(BigDecimal value) {
            addCriterion("TRGQUESTIONID <>", value, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidGreaterThan(BigDecimal value) {
            addCriterion("TRGQUESTIONID >", value, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRGQUESTIONID >=", value, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidLessThan(BigDecimal value) {
            addCriterion("TRGQUESTIONID <", value, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRGQUESTIONID <=", value, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidIn(List<BigDecimal> values) {
            addCriterion("TRGQUESTIONID in", values, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidNotIn(List<BigDecimal> values) {
            addCriterion("TRGQUESTIONID not in", values, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRGQUESTIONID between", value1, value2, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andTrgquestionidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRGQUESTIONID not between", value1, value2, "trgquestionid");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNull() {
            addCriterion("CREATEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("CREATEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterion("CREATEDDATE =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterion("CREATEDDATE <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterion("CREATEDDATE >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDDATE >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterion("CREATEDDATE <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDDATE <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterion("CREATEDDATE in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterion("CREATEDDATE not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterion("CREATEDDATE between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDDATE not between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("CREATORID is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("CREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(String value) {
            addCriterion("CREATORID =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(String value) {
            addCriterion("CREATORID <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(String value) {
            addCriterion("CREATORID >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATORID >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(String value) {
            addCriterion("CREATORID <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(String value) {
            addCriterion("CREATORID <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLike(String value) {
            addCriterion("CREATORID like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotLike(String value) {
            addCriterion("CREATORID not like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<String> values) {
            addCriterion("CREATORID in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<String> values) {
            addCriterion("CREATORID not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(String value1, String value2) {
            addCriterion("CREATORID between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(String value1, String value2) {
            addCriterion("CREATORID not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andLastupddateIsNull() {
            addCriterion("LASTUPDDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastupddateIsNotNull() {
            addCriterion("LASTUPDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastupddateEqualTo(Date value) {
            addCriterion("LASTUPDDATE =", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotEqualTo(Date value) {
            addCriterion("LASTUPDDATE <>", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateGreaterThan(Date value) {
            addCriterion("LASTUPDDATE >", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTUPDDATE >=", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateLessThan(Date value) {
            addCriterion("LASTUPDDATE <", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateLessThanOrEqualTo(Date value) {
            addCriterion("LASTUPDDATE <=", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateIn(List<Date> values) {
            addCriterion("LASTUPDDATE in", values, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotIn(List<Date> values) {
            addCriterion("LASTUPDDATE not in", values, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateBetween(Date value1, Date value2) {
            addCriterion("LASTUPDDATE between", value1, value2, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotBetween(Date value1, Date value2) {
            addCriterion("LASTUPDDATE not between", value1, value2, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupdidIsNull() {
            addCriterion("LASTUPDID is null");
            return (Criteria) this;
        }

        public Criteria andLastupdidIsNotNull() {
            addCriterion("LASTUPDID is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdidEqualTo(String value) {
            addCriterion("LASTUPDID =", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidNotEqualTo(String value) {
            addCriterion("LASTUPDID <>", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidGreaterThan(String value) {
            addCriterion("LASTUPDID >", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidGreaterThanOrEqualTo(String value) {
            addCriterion("LASTUPDID >=", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidLessThan(String value) {
            addCriterion("LASTUPDID <", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidLessThanOrEqualTo(String value) {
            addCriterion("LASTUPDID <=", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidLike(String value) {
            addCriterion("LASTUPDID like", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidNotLike(String value) {
            addCriterion("LASTUPDID not like", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidIn(List<String> values) {
            addCriterion("LASTUPDID in", values, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidNotIn(List<String> values) {
            addCriterion("LASTUPDID not in", values, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidBetween(String value1, String value2) {
            addCriterion("LASTUPDID between", value1, value2, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidNotBetween(String value1, String value2) {
            addCriterion("LASTUPDID not between", value1, value2, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("ACTION is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("ACTION =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("ACTION <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("ACTION >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("ACTION <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("ACTION <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("ACTION like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("ACTION not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("ACTION in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("ACTION not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("ACTION between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("ACTION not between", value1, value2, "action");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SKIPRULEDETAIL
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
     * This class corresponds to the database table SKIPRULEDETAIL
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