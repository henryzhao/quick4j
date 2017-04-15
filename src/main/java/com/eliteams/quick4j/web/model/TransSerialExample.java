package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class TransSerialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransSerialExample() {
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

        public Criteria andSerialidIsNull() {
            addCriterion("serialId is null");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNotNull() {
            addCriterion("serialId is not null");
            return (Criteria) this;
        }

        public Criteria andSerialidEqualTo(String value) {
            addCriterion("serialId =", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotEqualTo(String value) {
            addCriterion("serialId <>", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThan(String value) {
            addCriterion("serialId >", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThanOrEqualTo(String value) {
            addCriterion("serialId >=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThan(String value) {
            addCriterion("serialId <", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThanOrEqualTo(String value) {
            addCriterion("serialId <=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLike(String value) {
            addCriterion("serialId like", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotLike(String value) {
            addCriterion("serialId not like", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidIn(List<String> values) {
            addCriterion("serialId in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotIn(List<String> values) {
            addCriterion("serialId not in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidBetween(String value1, String value2) {
            addCriterion("serialId between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotBetween(String value1, String value2) {
            addCriterion("serialId not between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNull() {
            addCriterion("transDate is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("transDate is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(String value) {
            addCriterion("transDate =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(String value) {
            addCriterion("transDate <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(String value) {
            addCriterion("transDate >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(String value) {
            addCriterion("transDate >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(String value) {
            addCriterion("transDate <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(String value) {
            addCriterion("transDate <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLike(String value) {
            addCriterion("transDate like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotLike(String value) {
            addCriterion("transDate not like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<String> values) {
            addCriterion("transDate in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<String> values) {
            addCriterion("transDate not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(String value1, String value2) {
            addCriterion("transDate between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(String value1, String value2) {
            addCriterion("transDate not between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNull() {
            addCriterion("transTime is null");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNotNull() {
            addCriterion("transTime is not null");
            return (Criteria) this;
        }

        public Criteria andTranstimeEqualTo(String value) {
            addCriterion("transTime =", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotEqualTo(String value) {
            addCriterion("transTime <>", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThan(String value) {
            addCriterion("transTime >", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThanOrEqualTo(String value) {
            addCriterion("transTime >=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThan(String value) {
            addCriterion("transTime <", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThanOrEqualTo(String value) {
            addCriterion("transTime <=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLike(String value) {
            addCriterion("transTime like", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotLike(String value) {
            addCriterion("transTime not like", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeIn(List<String> values) {
            addCriterion("transTime in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotIn(List<String> values) {
            addCriterion("transTime not in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeBetween(String value1, String value2) {
            addCriterion("transTime between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotBetween(String value1, String value2) {
            addCriterion("transTime not between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNull() {
            addCriterion("transType is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("transType is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(String value) {
            addCriterion("transType =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(String value) {
            addCriterion("transType <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(String value) {
            addCriterion("transType >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(String value) {
            addCriterion("transType >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(String value) {
            addCriterion("transType <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(String value) {
            addCriterion("transType <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLike(String value) {
            addCriterion("transType like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotLike(String value) {
            addCriterion("transType not like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<String> values) {
            addCriterion("transType in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<String> values) {
            addCriterion("transType not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(String value1, String value2) {
            addCriterion("transType between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(String value1, String value2) {
            addCriterion("transType not between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNull() {
            addCriterion("transStatus is null");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNotNull() {
            addCriterion("transStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTransstatusEqualTo(String value) {
            addCriterion("transStatus =", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotEqualTo(String value) {
            addCriterion("transStatus <>", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThan(String value) {
            addCriterion("transStatus >", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThanOrEqualTo(String value) {
            addCriterion("transStatus >=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThan(String value) {
            addCriterion("transStatus <", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThanOrEqualTo(String value) {
            addCriterion("transStatus <=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLike(String value) {
            addCriterion("transStatus like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotLike(String value) {
            addCriterion("transStatus not like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusIn(List<String> values) {
            addCriterion("transStatus in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotIn(List<String> values) {
            addCriterion("transStatus not in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusBetween(String value1, String value2) {
            addCriterion("transStatus between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotBetween(String value1, String value2) {
            addCriterion("transStatus not between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openId =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openId <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openId >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openId <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openId like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openId not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openId in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openId not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("accountNo is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("accountNo is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("accountNo =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("accountNo <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("accountNo >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("accountNo >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("accountNo <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("accountNo <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("accountNo like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("accountNo not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("accountNo in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("accountNo not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("accountNo between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("accountNo not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andSerivceidIsNull() {
            addCriterion("serivceId is null");
            return (Criteria) this;
        }

        public Criteria andSerivceidIsNotNull() {
            addCriterion("serivceId is not null");
            return (Criteria) this;
        }

        public Criteria andSerivceidEqualTo(String value) {
            addCriterion("serivceId =", value, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidNotEqualTo(String value) {
            addCriterion("serivceId <>", value, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidGreaterThan(String value) {
            addCriterion("serivceId >", value, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidGreaterThanOrEqualTo(String value) {
            addCriterion("serivceId >=", value, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidLessThan(String value) {
            addCriterion("serivceId <", value, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidLessThanOrEqualTo(String value) {
            addCriterion("serivceId <=", value, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidLike(String value) {
            addCriterion("serivceId like", value, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidNotLike(String value) {
            addCriterion("serivceId not like", value, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidIn(List<String> values) {
            addCriterion("serivceId in", values, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidNotIn(List<String> values) {
            addCriterion("serivceId not in", values, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidBetween(String value1, String value2) {
            addCriterion("serivceId between", value1, value2, "serivceid");
            return (Criteria) this;
        }

        public Criteria andSerivceidNotBetween(String value1, String value2) {
            addCriterion("serivceId not between", value1, value2, "serivceid");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
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