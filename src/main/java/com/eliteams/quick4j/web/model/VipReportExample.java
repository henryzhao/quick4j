package com.eliteams.quick4j.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VipReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipReportExample() {
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

        public Criteria andVipreportidIsNull() {
            addCriterion("vipReportId is null");
            return (Criteria) this;
        }

        public Criteria andVipreportidIsNotNull() {
            addCriterion("vipReportId is not null");
            return (Criteria) this;
        }

        public Criteria andVipreportidEqualTo(String value) {
            addCriterion("vipReportId =", value, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidNotEqualTo(String value) {
            addCriterion("vipReportId <>", value, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidGreaterThan(String value) {
            addCriterion("vipReportId >", value, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidGreaterThanOrEqualTo(String value) {
            addCriterion("vipReportId >=", value, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidLessThan(String value) {
            addCriterion("vipReportId <", value, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidLessThanOrEqualTo(String value) {
            addCriterion("vipReportId <=", value, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidLike(String value) {
            addCriterion("vipReportId like", value, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidNotLike(String value) {
            addCriterion("vipReportId not like", value, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidIn(List<String> values) {
            addCriterion("vipReportId in", values, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidNotIn(List<String> values) {
            addCriterion("vipReportId not in", values, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidBetween(String value1, String value2) {
            addCriterion("vipReportId between", value1, value2, "vipreportid");
            return (Criteria) this;
        }

        public Criteria andVipreportidNotBetween(String value1, String value2) {
            addCriterion("vipReportId not between", value1, value2, "vipreportid");
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

        public Criteria andRechargedatetimeIsNull() {
            addCriterion("rechargeDatetime is null");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeIsNotNull() {
            addCriterion("rechargeDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeEqualTo(String value) {
            addCriterion("rechargeDatetime =", value, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeNotEqualTo(String value) {
            addCriterion("rechargeDatetime <>", value, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeGreaterThan(String value) {
            addCriterion("rechargeDatetime >", value, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("rechargeDatetime >=", value, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeLessThan(String value) {
            addCriterion("rechargeDatetime <", value, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeLessThanOrEqualTo(String value) {
            addCriterion("rechargeDatetime <=", value, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeLike(String value) {
            addCriterion("rechargeDatetime like", value, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeNotLike(String value) {
            addCriterion("rechargeDatetime not like", value, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeIn(List<String> values) {
            addCriterion("rechargeDatetime in", values, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeNotIn(List<String> values) {
            addCriterion("rechargeDatetime not in", values, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeBetween(String value1, String value2) {
            addCriterion("rechargeDatetime between", value1, value2, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargedatetimeNotBetween(String value1, String value2) {
            addCriterion("rechargeDatetime not between", value1, value2, "rechargedatetime");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeIsNull() {
            addCriterion("rechargeBefore is null");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeIsNotNull() {
            addCriterion("rechargeBefore is not null");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeEqualTo(BigDecimal value) {
            addCriterion("rechargeBefore =", value, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeNotEqualTo(BigDecimal value) {
            addCriterion("rechargeBefore <>", value, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeGreaterThan(BigDecimal value) {
            addCriterion("rechargeBefore >", value, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rechargeBefore >=", value, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeLessThan(BigDecimal value) {
            addCriterion("rechargeBefore <", value, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rechargeBefore <=", value, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeIn(List<BigDecimal> values) {
            addCriterion("rechargeBefore in", values, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeNotIn(List<BigDecimal> values) {
            addCriterion("rechargeBefore not in", values, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rechargeBefore between", value1, value2, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargebeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rechargeBefore not between", value1, value2, "rechargebefore");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyIsNull() {
            addCriterion("rechargeMoney is null");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyIsNotNull() {
            addCriterion("rechargeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyEqualTo(BigDecimal value) {
            addCriterion("rechargeMoney =", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyNotEqualTo(BigDecimal value) {
            addCriterion("rechargeMoney <>", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyGreaterThan(BigDecimal value) {
            addCriterion("rechargeMoney >", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rechargeMoney >=", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyLessThan(BigDecimal value) {
            addCriterion("rechargeMoney <", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rechargeMoney <=", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyIn(List<BigDecimal> values) {
            addCriterion("rechargeMoney in", values, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyNotIn(List<BigDecimal> values) {
            addCriterion("rechargeMoney not in", values, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rechargeMoney between", value1, value2, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rechargeMoney not between", value1, value2, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyIsNull() {
            addCriterion("awardMoney is null");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyIsNotNull() {
            addCriterion("awardMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyEqualTo(BigDecimal value) {
            addCriterion("awardMoney =", value, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyNotEqualTo(BigDecimal value) {
            addCriterion("awardMoney <>", value, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyGreaterThan(BigDecimal value) {
            addCriterion("awardMoney >", value, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("awardMoney >=", value, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyLessThan(BigDecimal value) {
            addCriterion("awardMoney <", value, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("awardMoney <=", value, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyIn(List<BigDecimal> values) {
            addCriterion("awardMoney in", values, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyNotIn(List<BigDecimal> values) {
            addCriterion("awardMoney not in", values, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("awardMoney between", value1, value2, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andAwardmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("awardMoney not between", value1, value2, "awardmoney");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
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