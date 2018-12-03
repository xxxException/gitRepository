package com.pointer.springbootdemo.mybatis.domin;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacherId is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacherId =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacherId <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacherId >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherId >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacherId <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacherId <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacherId in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacherId not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacherId between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherId not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacherName =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacherName <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacherName >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacherName >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacherName <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacherName <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacherName like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacherName not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacherName in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacherName not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacherName between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacherName not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIsNull() {
            addCriterion("teacherCourse is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIsNotNull() {
            addCriterion("teacherCourse is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseEqualTo(String value) {
            addCriterion("teacherCourse =", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseNotEqualTo(String value) {
            addCriterion("teacherCourse <>", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseGreaterThan(String value) {
            addCriterion("teacherCourse >", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseGreaterThanOrEqualTo(String value) {
            addCriterion("teacherCourse >=", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseLessThan(String value) {
            addCriterion("teacherCourse <", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseLessThanOrEqualTo(String value) {
            addCriterion("teacherCourse <=", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseLike(String value) {
            addCriterion("teacherCourse like", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseNotLike(String value) {
            addCriterion("teacherCourse not like", value, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIn(List<String> values) {
            addCriterion("teacherCourse in", values, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseNotIn(List<String> values) {
            addCriterion("teacherCourse not in", values, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseBetween(String value1, String value2) {
            addCriterion("teacherCourse between", value1, value2, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseNotBetween(String value1, String value2) {
            addCriterion("teacherCourse not between", value1, value2, "teacherCourse");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIsNull() {
            addCriterion("teacherAge is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIsNotNull() {
            addCriterion("teacherAge is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeEqualTo(String value) {
            addCriterion("teacherAge =", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotEqualTo(String value) {
            addCriterion("teacherAge <>", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeGreaterThan(String value) {
            addCriterion("teacherAge >", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeGreaterThanOrEqualTo(String value) {
            addCriterion("teacherAge >=", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeLessThan(String value) {
            addCriterion("teacherAge <", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeLessThanOrEqualTo(String value) {
            addCriterion("teacherAge <=", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeLike(String value) {
            addCriterion("teacherAge like", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotLike(String value) {
            addCriterion("teacherAge not like", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIn(List<String> values) {
            addCriterion("teacherAge in", values, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotIn(List<String> values) {
            addCriterion("teacherAge not in", values, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeBetween(String value1, String value2) {
            addCriterion("teacherAge between", value1, value2, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotBetween(String value1, String value2) {
            addCriterion("teacherAge not between", value1, value2, "teacherAge");
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