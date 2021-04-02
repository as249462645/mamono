package com.xiaohe.mamono.entity;

import java.util.ArrayList;
import java.util.List;

public class GrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrowExample() {
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

        public Criteria andMonoIdIsNull() {
            addCriterion("MONO_ID is null");
            return (Criteria) this;
        }

        public Criteria andMonoIdIsNotNull() {
            addCriterion("MONO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMonoIdEqualTo(Integer value) {
            addCriterion("MONO_ID =", value, "monoId");
            return (Criteria) this;
        }

        public Criteria andMonoIdNotEqualTo(Integer value) {
            addCriterion("MONO_ID <>", value, "monoId");
            return (Criteria) this;
        }

        public Criteria andMonoIdGreaterThan(Integer value) {
            addCriterion("MONO_ID >", value, "monoId");
            return (Criteria) this;
        }

        public Criteria andMonoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONO_ID >=", value, "monoId");
            return (Criteria) this;
        }

        public Criteria andMonoIdLessThan(Integer value) {
            addCriterion("MONO_ID <", value, "monoId");
            return (Criteria) this;
        }

        public Criteria andMonoIdLessThanOrEqualTo(Integer value) {
            addCriterion("MONO_ID <=", value, "monoId");
            return (Criteria) this;
        }

        public Criteria andMonoIdIn(List<Integer> values) {
            addCriterion("MONO_ID in", values, "monoId");
            return (Criteria) this;
        }

        public Criteria andMonoIdNotIn(List<Integer> values) {
            addCriterion("MONO_ID not in", values, "monoId");
            return (Criteria) this;
        }

        public Criteria andMonoIdBetween(Integer value1, Integer value2) {
            addCriterion("MONO_ID between", value1, value2, "monoId");
            return (Criteria) this;
        }

        public Criteria andMonoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MONO_ID not between", value1, value2, "monoId");
            return (Criteria) this;
        }

        public Criteria andChildIsNull() {
            addCriterion("CHILD is null");
            return (Criteria) this;
        }

        public Criteria andChildIsNotNull() {
            addCriterion("CHILD is not null");
            return (Criteria) this;
        }

        public Criteria andChildEqualTo(Float value) {
            addCriterion("CHILD =", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotEqualTo(Float value) {
            addCriterion("CHILD <>", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThan(Float value) {
            addCriterion("CHILD >", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThanOrEqualTo(Float value) {
            addCriterion("CHILD >=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThan(Float value) {
            addCriterion("CHILD <", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThanOrEqualTo(Float value) {
            addCriterion("CHILD <=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildIn(List<Float> values) {
            addCriterion("CHILD in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotIn(List<Float> values) {
            addCriterion("CHILD not in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildBetween(Float value1, Float value2) {
            addCriterion("CHILD between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotBetween(Float value1, Float value2) {
            addCriterion("CHILD not between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andYoungIsNull() {
            addCriterion("YOUNG is null");
            return (Criteria) this;
        }

        public Criteria andYoungIsNotNull() {
            addCriterion("YOUNG is not null");
            return (Criteria) this;
        }

        public Criteria andYoungEqualTo(Float value) {
            addCriterion("YOUNG =", value, "young");
            return (Criteria) this;
        }

        public Criteria andYoungNotEqualTo(Float value) {
            addCriterion("YOUNG <>", value, "young");
            return (Criteria) this;
        }

        public Criteria andYoungGreaterThan(Float value) {
            addCriterion("YOUNG >", value, "young");
            return (Criteria) this;
        }

        public Criteria andYoungGreaterThanOrEqualTo(Float value) {
            addCriterion("YOUNG >=", value, "young");
            return (Criteria) this;
        }

        public Criteria andYoungLessThan(Float value) {
            addCriterion("YOUNG <", value, "young");
            return (Criteria) this;
        }

        public Criteria andYoungLessThanOrEqualTo(Float value) {
            addCriterion("YOUNG <=", value, "young");
            return (Criteria) this;
        }

        public Criteria andYoungIn(List<Float> values) {
            addCriterion("YOUNG in", values, "young");
            return (Criteria) this;
        }

        public Criteria andYoungNotIn(List<Float> values) {
            addCriterion("YOUNG not in", values, "young");
            return (Criteria) this;
        }

        public Criteria andYoungBetween(Float value1, Float value2) {
            addCriterion("YOUNG between", value1, value2, "young");
            return (Criteria) this;
        }

        public Criteria andYoungNotBetween(Float value1, Float value2) {
            addCriterion("YOUNG not between", value1, value2, "young");
            return (Criteria) this;
        }

        public Criteria andAdultIsNull() {
            addCriterion("ADULT is null");
            return (Criteria) this;
        }

        public Criteria andAdultIsNotNull() {
            addCriterion("ADULT is not null");
            return (Criteria) this;
        }

        public Criteria andAdultEqualTo(Float value) {
            addCriterion("ADULT =", value, "adult");
            return (Criteria) this;
        }

        public Criteria andAdultNotEqualTo(Float value) {
            addCriterion("ADULT <>", value, "adult");
            return (Criteria) this;
        }

        public Criteria andAdultGreaterThan(Float value) {
            addCriterion("ADULT >", value, "adult");
            return (Criteria) this;
        }

        public Criteria andAdultGreaterThanOrEqualTo(Float value) {
            addCriterion("ADULT >=", value, "adult");
            return (Criteria) this;
        }

        public Criteria andAdultLessThan(Float value) {
            addCriterion("ADULT <", value, "adult");
            return (Criteria) this;
        }

        public Criteria andAdultLessThanOrEqualTo(Float value) {
            addCriterion("ADULT <=", value, "adult");
            return (Criteria) this;
        }

        public Criteria andAdultIn(List<Float> values) {
            addCriterion("ADULT in", values, "adult");
            return (Criteria) this;
        }

        public Criteria andAdultNotIn(List<Float> values) {
            addCriterion("ADULT not in", values, "adult");
            return (Criteria) this;
        }

        public Criteria andAdultBetween(Float value1, Float value2) {
            addCriterion("ADULT between", value1, value2, "adult");
            return (Criteria) this;
        }

        public Criteria andAdultNotBetween(Float value1, Float value2) {
            addCriterion("ADULT not between", value1, value2, "adult");
            return (Criteria) this;
        }

        public Criteria andMiddleIsNull() {
            addCriterion("MIDDLE is null");
            return (Criteria) this;
        }

        public Criteria andMiddleIsNotNull() {
            addCriterion("MIDDLE is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleEqualTo(Float value) {
            addCriterion("MIDDLE =", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleNotEqualTo(Float value) {
            addCriterion("MIDDLE <>", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleGreaterThan(Float value) {
            addCriterion("MIDDLE >", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleGreaterThanOrEqualTo(Float value) {
            addCriterion("MIDDLE >=", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleLessThan(Float value) {
            addCriterion("MIDDLE <", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleLessThanOrEqualTo(Float value) {
            addCriterion("MIDDLE <=", value, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleIn(List<Float> values) {
            addCriterion("MIDDLE in", values, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleNotIn(List<Float> values) {
            addCriterion("MIDDLE not in", values, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleBetween(Float value1, Float value2) {
            addCriterion("MIDDLE between", value1, value2, "middle");
            return (Criteria) this;
        }

        public Criteria andMiddleNotBetween(Float value1, Float value2) {
            addCriterion("MIDDLE not between", value1, value2, "middle");
            return (Criteria) this;
        }

        public Criteria andOldIsNull() {
            addCriterion("OLD is null");
            return (Criteria) this;
        }

        public Criteria andOldIsNotNull() {
            addCriterion("OLD is not null");
            return (Criteria) this;
        }

        public Criteria andOldEqualTo(Float value) {
            addCriterion("OLD =", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotEqualTo(Float value) {
            addCriterion("OLD <>", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThan(Float value) {
            addCriterion("OLD >", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThanOrEqualTo(Float value) {
            addCriterion("OLD >=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThan(Float value) {
            addCriterion("OLD <", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThanOrEqualTo(Float value) {
            addCriterion("OLD <=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldIn(List<Float> values) {
            addCriterion("OLD in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotIn(List<Float> values) {
            addCriterion("OLD not in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldBetween(Float value1, Float value2) {
            addCriterion("OLD between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotBetween(Float value1, Float value2) {
            addCriterion("OLD not between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpIsNull() {
            addCriterion("LV_UP_EMP is null");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpIsNotNull() {
            addCriterion("LV_UP_EMP is not null");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpEqualTo(Float value) {
            addCriterion("LV_UP_EMP =", value, "lvUpEmp");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpNotEqualTo(Float value) {
            addCriterion("LV_UP_EMP <>", value, "lvUpEmp");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpGreaterThan(Float value) {
            addCriterion("LV_UP_EMP >", value, "lvUpEmp");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpGreaterThanOrEqualTo(Float value) {
            addCriterion("LV_UP_EMP >=", value, "lvUpEmp");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpLessThan(Float value) {
            addCriterion("LV_UP_EMP <", value, "lvUpEmp");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpLessThanOrEqualTo(Float value) {
            addCriterion("LV_UP_EMP <=", value, "lvUpEmp");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpIn(List<Float> values) {
            addCriterion("LV_UP_EMP in", values, "lvUpEmp");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpNotIn(List<Float> values) {
            addCriterion("LV_UP_EMP not in", values, "lvUpEmp");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpBetween(Float value1, Float value2) {
            addCriterion("LV_UP_EMP between", value1, value2, "lvUpEmp");
            return (Criteria) this;
        }

        public Criteria andLvUpEmpNotBetween(Float value1, Float value2) {
            addCriterion("LV_UP_EMP not between", value1, value2, "lvUpEmp");
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

        public Criteria andHpEqualTo(Float value) {
            addCriterion("HP =", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotEqualTo(Float value) {
            addCriterion("HP <>", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThan(Float value) {
            addCriterion("HP >", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThanOrEqualTo(Float value) {
            addCriterion("HP >=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThan(Float value) {
            addCriterion("HP <", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThanOrEqualTo(Float value) {
            addCriterion("HP <=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpIn(List<Float> values) {
            addCriterion("HP in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotIn(List<Float> values) {
            addCriterion("HP not in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpBetween(Float value1, Float value2) {
            addCriterion("HP between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotBetween(Float value1, Float value2) {
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

        public Criteria andMpEqualTo(Float value) {
            addCriterion("MP =", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotEqualTo(Float value) {
            addCriterion("MP <>", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThan(Float value) {
            addCriterion("MP >", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThanOrEqualTo(Float value) {
            addCriterion("MP >=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThan(Float value) {
            addCriterion("MP <", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThanOrEqualTo(Float value) {
            addCriterion("MP <=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpIn(List<Float> values) {
            addCriterion("MP in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotIn(List<Float> values) {
            addCriterion("MP not in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpBetween(Float value1, Float value2) {
            addCriterion("MP between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotBetween(Float value1, Float value2) {
            addCriterion("MP not between", value1, value2, "mp");
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