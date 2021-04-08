package com.xiaohe.mamono.entity;

import java.util.ArrayList;
import java.util.List;

public class RaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andLifetimeMinIsNull() {
            addCriterion("LIFETIME_MIN is null");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinIsNotNull() {
            addCriterion("LIFETIME_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinEqualTo(Long value) {
            addCriterion("LIFETIME_MIN =", value, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinNotEqualTo(Long value) {
            addCriterion("LIFETIME_MIN <>", value, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinGreaterThan(Long value) {
            addCriterion("LIFETIME_MIN >", value, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinGreaterThanOrEqualTo(Long value) {
            addCriterion("LIFETIME_MIN >=", value, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinLessThan(Long value) {
            addCriterion("LIFETIME_MIN <", value, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinLessThanOrEqualTo(Long value) {
            addCriterion("LIFETIME_MIN <=", value, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinIn(List<Long> values) {
            addCriterion("LIFETIME_MIN in", values, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinNotIn(List<Long> values) {
            addCriterion("LIFETIME_MIN not in", values, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinBetween(Long value1, Long value2) {
            addCriterion("LIFETIME_MIN between", value1, value2, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMinNotBetween(Long value1, Long value2) {
            addCriterion("LIFETIME_MIN not between", value1, value2, "lifetimeMin");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxIsNull() {
            addCriterion("LIFETIME_MAX is null");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxIsNotNull() {
            addCriterion("LIFETIME_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxEqualTo(Long value) {
            addCriterion("LIFETIME_MAX =", value, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxNotEqualTo(Long value) {
            addCriterion("LIFETIME_MAX <>", value, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxGreaterThan(Long value) {
            addCriterion("LIFETIME_MAX >", value, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxGreaterThanOrEqualTo(Long value) {
            addCriterion("LIFETIME_MAX >=", value, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxLessThan(Long value) {
            addCriterion("LIFETIME_MAX <", value, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxLessThanOrEqualTo(Long value) {
            addCriterion("LIFETIME_MAX <=", value, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxIn(List<Long> values) {
            addCriterion("LIFETIME_MAX in", values, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxNotIn(List<Long> values) {
            addCriterion("LIFETIME_MAX not in", values, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxBetween(Long value1, Long value2) {
            addCriterion("LIFETIME_MAX between", value1, value2, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andLifetimeMaxNotBetween(Long value1, Long value2) {
            addCriterion("LIFETIME_MAX not between", value1, value2, "lifetimeMax");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdIsNull() {
            addCriterion("FATHER_RACE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdIsNotNull() {
            addCriterion("FATHER_RACE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdEqualTo(Integer value) {
            addCriterion("FATHER_RACE_ID =", value, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdNotEqualTo(Integer value) {
            addCriterion("FATHER_RACE_ID <>", value, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdGreaterThan(Integer value) {
            addCriterion("FATHER_RACE_ID >", value, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FATHER_RACE_ID >=", value, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdLessThan(Integer value) {
            addCriterion("FATHER_RACE_ID <", value, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("FATHER_RACE_ID <=", value, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdIn(List<Integer> values) {
            addCriterion("FATHER_RACE_ID in", values, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdNotIn(List<Integer> values) {
            addCriterion("FATHER_RACE_ID not in", values, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdBetween(Integer value1, Integer value2) {
            addCriterion("FATHER_RACE_ID between", value1, value2, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andFatherRaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FATHER_RACE_ID not between", value1, value2, "fatherRaceId");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidIsNull() {
            addCriterion("MOTHER_RACEID is null");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidIsNotNull() {
            addCriterion("MOTHER_RACEID is not null");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidEqualTo(Integer value) {
            addCriterion("MOTHER_RACEID =", value, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidNotEqualTo(Integer value) {
            addCriterion("MOTHER_RACEID <>", value, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidGreaterThan(Integer value) {
            addCriterion("MOTHER_RACEID >", value, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MOTHER_RACEID >=", value, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidLessThan(Integer value) {
            addCriterion("MOTHER_RACEID <", value, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidLessThanOrEqualTo(Integer value) {
            addCriterion("MOTHER_RACEID <=", value, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidIn(List<Integer> values) {
            addCriterion("MOTHER_RACEID in", values, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidNotIn(List<Integer> values) {
            addCriterion("MOTHER_RACEID not in", values, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidBetween(Integer value1, Integer value2) {
            addCriterion("MOTHER_RACEID between", value1, value2, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andMotherRaceidNotBetween(Integer value1, Integer value2) {
            addCriterion("MOTHER_RACEID not between", value1, value2, "motherRaceid");
            return (Criteria) this;
        }

        public Criteria andQualityIsNull() {
            addCriterion("QUALITY is null");
            return (Criteria) this;
        }

        public Criteria andQualityIsNotNull() {
            addCriterion("QUALITY is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEqualTo(Integer value) {
            addCriterion("QUALITY =", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotEqualTo(Integer value) {
            addCriterion("QUALITY <>", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThan(Integer value) {
            addCriterion("QUALITY >", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUALITY >=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThan(Integer value) {
            addCriterion("QUALITY <", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThanOrEqualTo(Integer value) {
            addCriterion("QUALITY <=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityIn(List<Integer> values) {
            addCriterion("QUALITY in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotIn(List<Integer> values) {
            addCriterion("QUALITY not in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityBetween(Integer value1, Integer value2) {
            addCriterion("QUALITY between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("QUALITY not between", value1, value2, "quality");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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