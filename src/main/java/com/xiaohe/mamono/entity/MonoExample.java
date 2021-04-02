package com.xiaohe.mamono.entity;

import java.util.ArrayList;
import java.util.List;

public class MonoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonoExample() {
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

        public Criteria andPaIsNull() {
            addCriterion("PA is null");
            return (Criteria) this;
        }

        public Criteria andPaIsNotNull() {
            addCriterion("PA is not null");
            return (Criteria) this;
        }

        public Criteria andPaEqualTo(Float value) {
            addCriterion("PA =", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotEqualTo(Float value) {
            addCriterion("PA <>", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaGreaterThan(Float value) {
            addCriterion("PA >", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaGreaterThanOrEqualTo(Float value) {
            addCriterion("PA >=", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaLessThan(Float value) {
            addCriterion("PA <", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaLessThanOrEqualTo(Float value) {
            addCriterion("PA <=", value, "pa");
            return (Criteria) this;
        }

        public Criteria andPaIn(List<Float> values) {
            addCriterion("PA in", values, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotIn(List<Float> values) {
            addCriterion("PA not in", values, "pa");
            return (Criteria) this;
        }

        public Criteria andPaBetween(Float value1, Float value2) {
            addCriterion("PA between", value1, value2, "pa");
            return (Criteria) this;
        }

        public Criteria andPaNotBetween(Float value1, Float value2) {
            addCriterion("PA not between", value1, value2, "pa");
            return (Criteria) this;
        }

        public Criteria andMaIsNull() {
            addCriterion("MA is null");
            return (Criteria) this;
        }

        public Criteria andMaIsNotNull() {
            addCriterion("MA is not null");
            return (Criteria) this;
        }

        public Criteria andMaEqualTo(Float value) {
            addCriterion("MA =", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaNotEqualTo(Float value) {
            addCriterion("MA <>", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaGreaterThan(Float value) {
            addCriterion("MA >", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaGreaterThanOrEqualTo(Float value) {
            addCriterion("MA >=", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaLessThan(Float value) {
            addCriterion("MA <", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaLessThanOrEqualTo(Float value) {
            addCriterion("MA <=", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaIn(List<Float> values) {
            addCriterion("MA in", values, "ma");
            return (Criteria) this;
        }

        public Criteria andMaNotIn(List<Float> values) {
            addCriterion("MA not in", values, "ma");
            return (Criteria) this;
        }

        public Criteria andMaBetween(Float value1, Float value2) {
            addCriterion("MA between", value1, value2, "ma");
            return (Criteria) this;
        }

        public Criteria andMaNotBetween(Float value1, Float value2) {
            addCriterion("MA not between", value1, value2, "ma");
            return (Criteria) this;
        }

        public Criteria andPdIsNull() {
            addCriterion("PD is null");
            return (Criteria) this;
        }

        public Criteria andPdIsNotNull() {
            addCriterion("PD is not null");
            return (Criteria) this;
        }

        public Criteria andPdEqualTo(Float value) {
            addCriterion("PD =", value, "pd");
            return (Criteria) this;
        }

        public Criteria andPdNotEqualTo(Float value) {
            addCriterion("PD <>", value, "pd");
            return (Criteria) this;
        }

        public Criteria andPdGreaterThan(Float value) {
            addCriterion("PD >", value, "pd");
            return (Criteria) this;
        }

        public Criteria andPdGreaterThanOrEqualTo(Float value) {
            addCriterion("PD >=", value, "pd");
            return (Criteria) this;
        }

        public Criteria andPdLessThan(Float value) {
            addCriterion("PD <", value, "pd");
            return (Criteria) this;
        }

        public Criteria andPdLessThanOrEqualTo(Float value) {
            addCriterion("PD <=", value, "pd");
            return (Criteria) this;
        }

        public Criteria andPdIn(List<Float> values) {
            addCriterion("PD in", values, "pd");
            return (Criteria) this;
        }

        public Criteria andPdNotIn(List<Float> values) {
            addCriterion("PD not in", values, "pd");
            return (Criteria) this;
        }

        public Criteria andPdBetween(Float value1, Float value2) {
            addCriterion("PD between", value1, value2, "pd");
            return (Criteria) this;
        }

        public Criteria andPdNotBetween(Float value1, Float value2) {
            addCriterion("PD not between", value1, value2, "pd");
            return (Criteria) this;
        }

        public Criteria andMdIsNull() {
            addCriterion("MD is null");
            return (Criteria) this;
        }

        public Criteria andMdIsNotNull() {
            addCriterion("MD is not null");
            return (Criteria) this;
        }

        public Criteria andMdEqualTo(Float value) {
            addCriterion("MD =", value, "md");
            return (Criteria) this;
        }

        public Criteria andMdNotEqualTo(Float value) {
            addCriterion("MD <>", value, "md");
            return (Criteria) this;
        }

        public Criteria andMdGreaterThan(Float value) {
            addCriterion("MD >", value, "md");
            return (Criteria) this;
        }

        public Criteria andMdGreaterThanOrEqualTo(Float value) {
            addCriterion("MD >=", value, "md");
            return (Criteria) this;
        }

        public Criteria andMdLessThan(Float value) {
            addCriterion("MD <", value, "md");
            return (Criteria) this;
        }

        public Criteria andMdLessThanOrEqualTo(Float value) {
            addCriterion("MD <=", value, "md");
            return (Criteria) this;
        }

        public Criteria andMdIn(List<Float> values) {
            addCriterion("MD in", values, "md");
            return (Criteria) this;
        }

        public Criteria andMdNotIn(List<Float> values) {
            addCriterion("MD not in", values, "md");
            return (Criteria) this;
        }

        public Criteria andMdBetween(Float value1, Float value2) {
            addCriterion("MD between", value1, value2, "md");
            return (Criteria) this;
        }

        public Criteria andMdNotBetween(Float value1, Float value2) {
            addCriterion("MD not between", value1, value2, "md");
            return (Criteria) this;
        }

        public Criteria andHpIsNull() {
            addCriterion("HP is null");
            return (Criteria) this;
        }

        public Criteria andHpIsNotNull() {
            addCriterion("HP is not null");
            return (Criteria) this;
        }

        public Criteria andHpEqualTo(Integer value) {
            addCriterion("HP =", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotEqualTo(Integer value) {
            addCriterion("HP <>", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThan(Integer value) {
            addCriterion("HP >", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThanOrEqualTo(Integer value) {
            addCriterion("HP >=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThan(Integer value) {
            addCriterion("HP <", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThanOrEqualTo(Integer value) {
            addCriterion("HP <=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpIn(List<Integer> values) {
            addCriterion("HP in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotIn(List<Integer> values) {
            addCriterion("HP not in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpBetween(Integer value1, Integer value2) {
            addCriterion("HP between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotBetween(Integer value1, Integer value2) {
            addCriterion("HP not between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andMpIsNull() {
            addCriterion("MP is null");
            return (Criteria) this;
        }

        public Criteria andMpIsNotNull() {
            addCriterion("MP is not null");
            return (Criteria) this;
        }

        public Criteria andMpEqualTo(Integer value) {
            addCriterion("MP =", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotEqualTo(Integer value) {
            addCriterion("MP <>", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThan(Integer value) {
            addCriterion("MP >", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThanOrEqualTo(Integer value) {
            addCriterion("MP >=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThan(Integer value) {
            addCriterion("MP <", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThanOrEqualTo(Integer value) {
            addCriterion("MP <=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpIn(List<Integer> values) {
            addCriterion("MP in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotIn(List<Integer> values) {
            addCriterion("MP not in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpBetween(Integer value1, Integer value2) {
            addCriterion("MP between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotBetween(Integer value1, Integer value2) {
            addCriterion("MP not between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andMaxHpIsNull() {
            addCriterion("MAX_HP is null");
            return (Criteria) this;
        }

        public Criteria andMaxHpIsNotNull() {
            addCriterion("MAX_HP is not null");
            return (Criteria) this;
        }

        public Criteria andMaxHpEqualTo(Float value) {
            addCriterion("MAX_HP =", value, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxHpNotEqualTo(Float value) {
            addCriterion("MAX_HP <>", value, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxHpGreaterThan(Float value) {
            addCriterion("MAX_HP >", value, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxHpGreaterThanOrEqualTo(Float value) {
            addCriterion("MAX_HP >=", value, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxHpLessThan(Float value) {
            addCriterion("MAX_HP <", value, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxHpLessThanOrEqualTo(Float value) {
            addCriterion("MAX_HP <=", value, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxHpIn(List<Float> values) {
            addCriterion("MAX_HP in", values, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxHpNotIn(List<Float> values) {
            addCriterion("MAX_HP not in", values, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxHpBetween(Float value1, Float value2) {
            addCriterion("MAX_HP between", value1, value2, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxHpNotBetween(Float value1, Float value2) {
            addCriterion("MAX_HP not between", value1, value2, "maxHp");
            return (Criteria) this;
        }

        public Criteria andMaxMpIsNull() {
            addCriterion("MAX_MP is null");
            return (Criteria) this;
        }

        public Criteria andMaxMpIsNotNull() {
            addCriterion("MAX_MP is not null");
            return (Criteria) this;
        }

        public Criteria andMaxMpEqualTo(Float value) {
            addCriterion("MAX_MP =", value, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMaxMpNotEqualTo(Float value) {
            addCriterion("MAX_MP <>", value, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMaxMpGreaterThan(Float value) {
            addCriterion("MAX_MP >", value, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMaxMpGreaterThanOrEqualTo(Float value) {
            addCriterion("MAX_MP >=", value, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMaxMpLessThan(Float value) {
            addCriterion("MAX_MP <", value, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMaxMpLessThanOrEqualTo(Float value) {
            addCriterion("MAX_MP <=", value, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMaxMpIn(List<Float> values) {
            addCriterion("MAX_MP in", values, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMaxMpNotIn(List<Float> values) {
            addCriterion("MAX_MP not in", values, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMaxMpBetween(Float value1, Float value2) {
            addCriterion("MAX_MP between", value1, value2, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMaxMpNotBetween(Float value1, Float value2) {
            addCriterion("MAX_MP not between", value1, value2, "maxMp");
            return (Criteria) this;
        }

        public Criteria andMasterIsNull() {
            addCriterion("MASTER is null");
            return (Criteria) this;
        }

        public Criteria andMasterIsNotNull() {
            addCriterion("MASTER is not null");
            return (Criteria) this;
        }

        public Criteria andMasterEqualTo(Integer value) {
            addCriterion("MASTER =", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotEqualTo(Integer value) {
            addCriterion("MASTER <>", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThan(Integer value) {
            addCriterion("MASTER >", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThanOrEqualTo(Integer value) {
            addCriterion("MASTER >=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThan(Integer value) {
            addCriterion("MASTER <", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThanOrEqualTo(Integer value) {
            addCriterion("MASTER <=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterIn(List<Integer> values) {
            addCriterion("MASTER in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotIn(List<Integer> values) {
            addCriterion("MASTER not in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterBetween(Integer value1, Integer value2) {
            addCriterion("MASTER between", value1, value2, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotBetween(Integer value1, Integer value2) {
            addCriterion("MASTER not between", value1, value2, "master");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("COUNTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("COUNTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("COUNTRY_ID =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("COUNTRY_ID <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("COUNTRY_ID >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNTRY_ID >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("COUNTRY_ID <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("COUNTRY_ID <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("COUNTRY_ID in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("COUNTRY_ID not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("COUNTRY_ID between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNTRY_ID not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andRaceIdIsNull() {
            addCriterion("RACE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRaceIdIsNotNull() {
            addCriterion("RACE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRaceIdEqualTo(Integer value) {
            addCriterion("RACE_ID =", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdNotEqualTo(Integer value) {
            addCriterion("RACE_ID <>", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdGreaterThan(Integer value) {
            addCriterion("RACE_ID >", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RACE_ID >=", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdLessThan(Integer value) {
            addCriterion("RACE_ID <", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("RACE_ID <=", value, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdIn(List<Integer> values) {
            addCriterion("RACE_ID in", values, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdNotIn(List<Integer> values) {
            addCriterion("RACE_ID not in", values, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdBetween(Integer value1, Integer value2) {
            addCriterion("RACE_ID between", value1, value2, "raceId");
            return (Criteria) this;
        }

        public Criteria andRaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RACE_ID not between", value1, value2, "raceId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdIsNull() {
            addCriterion("DISPOSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andDispositionIdIsNotNull() {
            addCriterion("DISPOSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDispositionIdEqualTo(Integer value) {
            addCriterion("DISPOSITION_ID =", value, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdNotEqualTo(Integer value) {
            addCriterion("DISPOSITION_ID <>", value, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdGreaterThan(Integer value) {
            addCriterion("DISPOSITION_ID >", value, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISPOSITION_ID >=", value, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdLessThan(Integer value) {
            addCriterion("DISPOSITION_ID <", value, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("DISPOSITION_ID <=", value, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdIn(List<Integer> values) {
            addCriterion("DISPOSITION_ID in", values, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdNotIn(List<Integer> values) {
            addCriterion("DISPOSITION_ID not in", values, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdBetween(Integer value1, Integer value2) {
            addCriterion("DISPOSITION_ID between", value1, value2, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andDispositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DISPOSITION_ID not between", value1, value2, "dispositionId");
            return (Criteria) this;
        }

        public Criteria andGrowIdIsNull() {
            addCriterion("GROW_ID is null");
            return (Criteria) this;
        }

        public Criteria andGrowIdIsNotNull() {
            addCriterion("GROW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGrowIdEqualTo(Integer value) {
            addCriterion("GROW_ID =", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdNotEqualTo(Integer value) {
            addCriterion("GROW_ID <>", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdGreaterThan(Integer value) {
            addCriterion("GROW_ID >", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GROW_ID >=", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdLessThan(Integer value) {
            addCriterion("GROW_ID <", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("GROW_ID <=", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdIn(List<Integer> values) {
            addCriterion("GROW_ID in", values, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdNotIn(List<Integer> values) {
            addCriterion("GROW_ID not in", values, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdBetween(Integer value1, Integer value2) {
            addCriterion("GROW_ID between", value1, value2, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GROW_ID not between", value1, value2, "growId");
            return (Criteria) this;
        }

        public Criteria andMoodIdIsNull() {
            addCriterion("MOOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andMoodIdIsNotNull() {
            addCriterion("MOOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMoodIdEqualTo(Integer value) {
            addCriterion("MOOD_ID =", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotEqualTo(Integer value) {
            addCriterion("MOOD_ID <>", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdGreaterThan(Integer value) {
            addCriterion("MOOD_ID >", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MOOD_ID >=", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdLessThan(Integer value) {
            addCriterion("MOOD_ID <", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("MOOD_ID <=", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdIn(List<Integer> values) {
            addCriterion("MOOD_ID in", values, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotIn(List<Integer> values) {
            addCriterion("MOOD_ID not in", values, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdBetween(Integer value1, Integer value2) {
            addCriterion("MOOD_ID between", value1, value2, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MOOD_ID not between", value1, value2, "moodId");
            return (Criteria) this;
        }

        public Criteria andGreateTimeIsNull() {
            addCriterion("GREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGreateTimeIsNotNull() {
            addCriterion("GREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGreateTimeEqualTo(Long value) {
            addCriterion("GREATE_TIME =", value, "greateTime");
            return (Criteria) this;
        }

        public Criteria andGreateTimeNotEqualTo(Long value) {
            addCriterion("GREATE_TIME <>", value, "greateTime");
            return (Criteria) this;
        }

        public Criteria andGreateTimeGreaterThan(Long value) {
            addCriterion("GREATE_TIME >", value, "greateTime");
            return (Criteria) this;
        }

        public Criteria andGreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("GREATE_TIME >=", value, "greateTime");
            return (Criteria) this;
        }

        public Criteria andGreateTimeLessThan(Long value) {
            addCriterion("GREATE_TIME <", value, "greateTime");
            return (Criteria) this;
        }

        public Criteria andGreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("GREATE_TIME <=", value, "greateTime");
            return (Criteria) this;
        }

        public Criteria andGreateTimeIn(List<Long> values) {
            addCriterion("GREATE_TIME in", values, "greateTime");
            return (Criteria) this;
        }

        public Criteria andGreateTimeNotIn(List<Long> values) {
            addCriterion("GREATE_TIME not in", values, "greateTime");
            return (Criteria) this;
        }

        public Criteria andGreateTimeBetween(Long value1, Long value2) {
            addCriterion("GREATE_TIME between", value1, value2, "greateTime");
            return (Criteria) this;
        }

        public Criteria andGreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("GREATE_TIME not between", value1, value2, "greateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsLiveIsNull() {
            addCriterion("IS_LIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsLiveIsNotNull() {
            addCriterion("IS_LIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsLiveEqualTo(Integer value) {
            addCriterion("IS_LIVE =", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveNotEqualTo(Integer value) {
            addCriterion("IS_LIVE <>", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveGreaterThan(Integer value) {
            addCriterion("IS_LIVE >", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_LIVE >=", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveLessThan(Integer value) {
            addCriterion("IS_LIVE <", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveLessThanOrEqualTo(Integer value) {
            addCriterion("IS_LIVE <=", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveIn(List<Integer> values) {
            addCriterion("IS_LIVE in", values, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveNotIn(List<Integer> values) {
            addCriterion("IS_LIVE not in", values, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveBetween(Integer value1, Integer value2) {
            addCriterion("IS_LIVE between", value1, value2, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_LIVE not between", value1, value2, "isLive");
            return (Criteria) this;
        }

        public Criteria andLifetimeIsNull() {
            addCriterion("LIFETIME is null");
            return (Criteria) this;
        }

        public Criteria andLifetimeIsNotNull() {
            addCriterion("LIFETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLifetimeEqualTo(Long value) {
            addCriterion("LIFETIME =", value, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLifetimeNotEqualTo(Long value) {
            addCriterion("LIFETIME <>", value, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLifetimeGreaterThan(Long value) {
            addCriterion("LIFETIME >", value, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLifetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("LIFETIME >=", value, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLifetimeLessThan(Long value) {
            addCriterion("LIFETIME <", value, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLifetimeLessThanOrEqualTo(Long value) {
            addCriterion("LIFETIME <=", value, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLifetimeIn(List<Long> values) {
            addCriterion("LIFETIME in", values, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLifetimeNotIn(List<Long> values) {
            addCriterion("LIFETIME not in", values, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLifetimeBetween(Long value1, Long value2) {
            addCriterion("LIFETIME between", value1, value2, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLifetimeNotBetween(Long value1, Long value2) {
            addCriterion("LIFETIME not between", value1, value2, "lifetime");
            return (Criteria) this;
        }

        public Criteria andLvIsNull() {
            addCriterion("LV is null");
            return (Criteria) this;
        }

        public Criteria andLvIsNotNull() {
            addCriterion("LV is not null");
            return (Criteria) this;
        }

        public Criteria andLvEqualTo(Integer value) {
            addCriterion("LV =", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotEqualTo(Integer value) {
            addCriterion("LV <>", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThan(Integer value) {
            addCriterion("LV >", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("LV >=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThan(Integer value) {
            addCriterion("LV <", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThanOrEqualTo(Integer value) {
            addCriterion("LV <=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvIn(List<Integer> values) {
            addCriterion("LV in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotIn(List<Integer> values) {
            addCriterion("LV not in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvBetween(Integer value1, Integer value2) {
            addCriterion("LV between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotBetween(Integer value1, Integer value2) {
            addCriterion("LV not between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andEmpiricalIsNull() {
            addCriterion("EMPIRICAL is null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalIsNotNull() {
            addCriterion("EMPIRICAL is not null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalEqualTo(Integer value) {
            addCriterion("EMPIRICAL =", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalNotEqualTo(Integer value) {
            addCriterion("EMPIRICAL <>", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalGreaterThan(Integer value) {
            addCriterion("EMPIRICAL >", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPIRICAL >=", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalLessThan(Integer value) {
            addCriterion("EMPIRICAL <", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalLessThanOrEqualTo(Integer value) {
            addCriterion("EMPIRICAL <=", value, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalIn(List<Integer> values) {
            addCriterion("EMPIRICAL in", values, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalNotIn(List<Integer> values) {
            addCriterion("EMPIRICAL not in", values, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalBetween(Integer value1, Integer value2) {
            addCriterion("EMPIRICAL between", value1, value2, "empirical");
            return (Criteria) this;
        }

        public Criteria andEmpiricalNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPIRICAL not between", value1, value2, "empirical");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpIsNull() {
            addCriterion("NEXT_LV_EMP is null");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpIsNotNull() {
            addCriterion("NEXT_LV_EMP is not null");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpEqualTo(String value) {
            addCriterion("NEXT_LV_EMP =", value, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpNotEqualTo(String value) {
            addCriterion("NEXT_LV_EMP <>", value, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpGreaterThan(String value) {
            addCriterion("NEXT_LV_EMP >", value, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_LV_EMP >=", value, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpLessThan(String value) {
            addCriterion("NEXT_LV_EMP <", value, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpLessThanOrEqualTo(String value) {
            addCriterion("NEXT_LV_EMP <=", value, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpLike(String value) {
            addCriterion("NEXT_LV_EMP like", value, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpNotLike(String value) {
            addCriterion("NEXT_LV_EMP not like", value, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpIn(List<String> values) {
            addCriterion("NEXT_LV_EMP in", values, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpNotIn(List<String> values) {
            addCriterion("NEXT_LV_EMP not in", values, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpBetween(String value1, String value2) {
            addCriterion("NEXT_LV_EMP between", value1, value2, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andNextLvEmpNotBetween(String value1, String value2) {
            addCriterion("NEXT_LV_EMP not between", value1, value2, "nextLvEmp");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("POSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("POSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("POSITION_ID =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("POSITION_ID <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("POSITION_ID >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("POSITION_ID >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("POSITION_ID <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("POSITION_ID <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("POSITION_ID in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("POSITION_ID not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("POSITION_ID between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("POSITION_ID not between", value1, value2, "positionId");
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