package tw.edu.ym.csis.maindb.model;

import java.util.ArrayList;
import java.util.List;

public class SchemaMetaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    public SchemaMetaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMAMETA
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
     * This method corresponds to the database table SCHEMAMETA
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
     * This method corresponds to the database table SCHEMAMETA
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCHEMAMETA
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
     * This class corresponds to the database table SCHEMAMETA
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

        public Criteria andSchemaversionIsNull() {
            addCriterion("SCHEMAVERSION is null");
            return (Criteria) this;
        }

        public Criteria andSchemaversionIsNotNull() {
            addCriterion("SCHEMAVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaversionEqualTo(String value) {
            addCriterion("SCHEMAVERSION =", value, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionNotEqualTo(String value) {
            addCriterion("SCHEMAVERSION <>", value, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionGreaterThan(String value) {
            addCriterion("SCHEMAVERSION >", value, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEMAVERSION >=", value, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionLessThan(String value) {
            addCriterion("SCHEMAVERSION <", value, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionLessThanOrEqualTo(String value) {
            addCriterion("SCHEMAVERSION <=", value, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionLike(String value) {
            addCriterion("SCHEMAVERSION like", value, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionNotLike(String value) {
            addCriterion("SCHEMAVERSION not like", value, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionIn(List<String> values) {
            addCriterion("SCHEMAVERSION in", values, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionNotIn(List<String> values) {
            addCriterion("SCHEMAVERSION not in", values, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionBetween(String value1, String value2) {
            addCriterion("SCHEMAVERSION between", value1, value2, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andSchemaversionNotBetween(String value1, String value2) {
            addCriterion("SCHEMAVERSION not between", value1, value2, "schemaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionIsNull() {
            addCriterion("METAVERSION is null");
            return (Criteria) this;
        }

        public Criteria andMetaversionIsNotNull() {
            addCriterion("METAVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andMetaversionEqualTo(String value) {
            addCriterion("METAVERSION =", value, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionNotEqualTo(String value) {
            addCriterion("METAVERSION <>", value, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionGreaterThan(String value) {
            addCriterion("METAVERSION >", value, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionGreaterThanOrEqualTo(String value) {
            addCriterion("METAVERSION >=", value, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionLessThan(String value) {
            addCriterion("METAVERSION <", value, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionLessThanOrEqualTo(String value) {
            addCriterion("METAVERSION <=", value, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionLike(String value) {
            addCriterion("METAVERSION like", value, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionNotLike(String value) {
            addCriterion("METAVERSION not like", value, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionIn(List<String> values) {
            addCriterion("METAVERSION in", values, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionNotIn(List<String> values) {
            addCriterion("METAVERSION not in", values, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionBetween(String value1, String value2) {
            addCriterion("METAVERSION between", value1, value2, "metaversion");
            return (Criteria) this;
        }

        public Criteria andMetaversionNotBetween(String value1, String value2) {
            addCriterion("METAVERSION not between", value1, value2, "metaversion");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SCHEMAMETA
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
     * This class corresponds to the database table SCHEMAMETA
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