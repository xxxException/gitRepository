package com.pointer.springbootdemo.mybatis.domin;

import java.util.ArrayList;
import java.util.List;

public class InstituteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstituteExample() {
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

        public Criteria andInstituteIdIsNull() {
            addCriterion("instituteId is null");
            return (Criteria) this;
        }

        public Criteria andInstituteIdIsNotNull() {
            addCriterion("instituteId is not null");
            return (Criteria) this;
        }

        public Criteria andInstituteIdEqualTo(Integer value) {
            addCriterion("instituteId =", value, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteIdNotEqualTo(Integer value) {
            addCriterion("instituteId <>", value, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteIdGreaterThan(Integer value) {
            addCriterion("instituteId >", value, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instituteId >=", value, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteIdLessThan(Integer value) {
            addCriterion("instituteId <", value, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteIdLessThanOrEqualTo(Integer value) {
            addCriterion("instituteId <=", value, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteIdIn(List<Integer> values) {
            addCriterion("instituteId in", values, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteIdNotIn(List<Integer> values) {
            addCriterion("instituteId not in", values, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteIdBetween(Integer value1, Integer value2) {
            addCriterion("instituteId between", value1, value2, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instituteId not between", value1, value2, "instituteId");
            return (Criteria) this;
        }

        public Criteria andInstituteNameIsNull() {
            addCriterion("instituteName is null");
            return (Criteria) this;
        }

        public Criteria andInstituteNameIsNotNull() {
            addCriterion("instituteName is not null");
            return (Criteria) this;
        }

        public Criteria andInstituteNameEqualTo(String value) {
            addCriterion("instituteName =", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameNotEqualTo(String value) {
            addCriterion("instituteName <>", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameGreaterThan(String value) {
            addCriterion("instituteName >", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameGreaterThanOrEqualTo(String value) {
            addCriterion("instituteName >=", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameLessThan(String value) {
            addCriterion("instituteName <", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameLessThanOrEqualTo(String value) {
            addCriterion("instituteName <=", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameLike(String value) {
            addCriterion("instituteName like", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameNotLike(String value) {
            addCriterion("instituteName not like", value, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameIn(List<String> values) {
            addCriterion("instituteName in", values, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameNotIn(List<String> values) {
            addCriterion("instituteName not in", values, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameBetween(String value1, String value2) {
            addCriterion("instituteName between", value1, value2, "instituteName");
            return (Criteria) this;
        }

        public Criteria andInstituteNameNotBetween(String value1, String value2) {
            addCriterion("instituteName not between", value1, value2, "instituteName");
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