package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class EvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationExample() {
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

        public Criteria andEvalidIsNull() {
            addCriterion("evalId is null");
            return (Criteria) this;
        }

        public Criteria andEvalidIsNotNull() {
            addCriterion("evalId is not null");
            return (Criteria) this;
        }

        public Criteria andEvalidEqualTo(String value) {
            addCriterion("evalId =", value, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidNotEqualTo(String value) {
            addCriterion("evalId <>", value, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidGreaterThan(String value) {
            addCriterion("evalId >", value, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidGreaterThanOrEqualTo(String value) {
            addCriterion("evalId >=", value, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidLessThan(String value) {
            addCriterion("evalId <", value, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidLessThanOrEqualTo(String value) {
            addCriterion("evalId <=", value, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidLike(String value) {
            addCriterion("evalId like", value, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidNotLike(String value) {
            addCriterion("evalId not like", value, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidIn(List<String> values) {
            addCriterion("evalId in", values, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidNotIn(List<String> values) {
            addCriterion("evalId not in", values, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidBetween(String value1, String value2) {
            addCriterion("evalId between", value1, value2, "evalid");
            return (Criteria) this;
        }

        public Criteria andEvalidNotBetween(String value1, String value2) {
            addCriterion("evalId not between", value1, value2, "evalid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNull() {
            addCriterion("praise is null");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNotNull() {
            addCriterion("praise is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseEqualTo(Long value) {
            addCriterion("praise =", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotEqualTo(Long value) {
            addCriterion("praise <>", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThan(Long value) {
            addCriterion("praise >", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThanOrEqualTo(Long value) {
            addCriterion("praise >=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThan(Long value) {
            addCriterion("praise <", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThanOrEqualTo(Long value) {
            addCriterion("praise <=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseIn(List<Long> values) {
            addCriterion("praise in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotIn(List<Long> values) {
            addCriterion("praise not in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseBetween(Long value1, Long value2) {
            addCriterion("praise between", value1, value2, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotBetween(Long value1, Long value2) {
            addCriterion("praise not between", value1, value2, "praise");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeIsNull() {
            addCriterion("evaluationDatetime is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeIsNotNull() {
            addCriterion("evaluationDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeEqualTo(String value) {
            addCriterion("evaluationDatetime =", value, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeNotEqualTo(String value) {
            addCriterion("evaluationDatetime <>", value, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeGreaterThan(String value) {
            addCriterion("evaluationDatetime >", value, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("evaluationDatetime >=", value, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeLessThan(String value) {
            addCriterion("evaluationDatetime <", value, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeLessThanOrEqualTo(String value) {
            addCriterion("evaluationDatetime <=", value, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeLike(String value) {
            addCriterion("evaluationDatetime like", value, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeNotLike(String value) {
            addCriterion("evaluationDatetime not like", value, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeIn(List<String> values) {
            addCriterion("evaluationDatetime in", values, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeNotIn(List<String> values) {
            addCriterion("evaluationDatetime not in", values, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeBetween(String value1, String value2) {
            addCriterion("evaluationDatetime between", value1, value2, "evaluationdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluationdatetimeNotBetween(String value1, String value2) {
            addCriterion("evaluationDatetime not between", value1, value2, "evaluationdatetime");
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