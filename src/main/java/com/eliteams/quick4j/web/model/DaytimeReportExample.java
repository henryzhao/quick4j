package com.eliteams.quick4j.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DaytimeReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DaytimeReportExample() {
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

        public Criteria andReportidIsNull() {
            addCriterion("reportId is null");
            return (Criteria) this;
        }

        public Criteria andReportidIsNotNull() {
            addCriterion("reportId is not null");
            return (Criteria) this;
        }

        public Criteria andReportidEqualTo(String value) {
            addCriterion("reportId =", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotEqualTo(String value) {
            addCriterion("reportId <>", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThan(String value) {
            addCriterion("reportId >", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThanOrEqualTo(String value) {
            addCriterion("reportId >=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThan(String value) {
            addCriterion("reportId <", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThanOrEqualTo(String value) {
            addCriterion("reportId <=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLike(String value) {
            addCriterion("reportId like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotLike(String value) {
            addCriterion("reportId not like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidIn(List<String> values) {
            addCriterion("reportId in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotIn(List<String> values) {
            addCriterion("reportId not in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidBetween(String value1, String value2) {
            addCriterion("reportId between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotBetween(String value1, String value2) {
            addCriterion("reportId not between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNull() {
            addCriterion("serviceName is null");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNotNull() {
            addCriterion("serviceName is not null");
            return (Criteria) this;
        }

        public Criteria andServicenameEqualTo(String value) {
            addCriterion("serviceName =", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotEqualTo(String value) {
            addCriterion("serviceName <>", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThan(String value) {
            addCriterion("serviceName >", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThanOrEqualTo(String value) {
            addCriterion("serviceName >=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThan(String value) {
            addCriterion("serviceName <", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThanOrEqualTo(String value) {
            addCriterion("serviceName <=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLike(String value) {
            addCriterion("serviceName like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotLike(String value) {
            addCriterion("serviceName not like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameIn(List<String> values) {
            addCriterion("serviceName in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotIn(List<String> values) {
            addCriterion("serviceName not in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameBetween(String value1, String value2) {
            addCriterion("serviceName between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotBetween(String value1, String value2) {
            addCriterion("serviceName not between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNull() {
            addCriterion("serviceId is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("serviceId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(String value) {
            addCriterion("serviceId =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(String value) {
            addCriterion("serviceId <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(String value) {
            addCriterion("serviceId >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(String value) {
            addCriterion("serviceId >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(String value) {
            addCriterion("serviceId <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(String value) {
            addCriterion("serviceId <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLike(String value) {
            addCriterion("serviceId like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotLike(String value) {
            addCriterion("serviceId not like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<String> values) {
            addCriterion("serviceId in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<String> values) {
            addCriterion("serviceId not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(String value1, String value2) {
            addCriterion("serviceId between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(String value1, String value2) {
            addCriterion("serviceId not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andSepamountIsNull() {
            addCriterion("sepAmount is null");
            return (Criteria) this;
        }

        public Criteria andSepamountIsNotNull() {
            addCriterion("sepAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSepamountEqualTo(Integer value) {
            addCriterion("sepAmount =", value, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepamountNotEqualTo(Integer value) {
            addCriterion("sepAmount <>", value, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepamountGreaterThan(Integer value) {
            addCriterion("sepAmount >", value, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sepAmount >=", value, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepamountLessThan(Integer value) {
            addCriterion("sepAmount <", value, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepamountLessThanOrEqualTo(Integer value) {
            addCriterion("sepAmount <=", value, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepamountIn(List<Integer> values) {
            addCriterion("sepAmount in", values, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepamountNotIn(List<Integer> values) {
            addCriterion("sepAmount not in", values, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepamountBetween(Integer value1, Integer value2) {
            addCriterion("sepAmount between", value1, value2, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepamountNotBetween(Integer value1, Integer value2) {
            addCriterion("sepAmount not between", value1, value2, "sepamount");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceIsNull() {
            addCriterion("sepSinglePrice is null");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceIsNotNull() {
            addCriterion("sepSinglePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceEqualTo(BigDecimal value) {
            addCriterion("sepSinglePrice =", value, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceNotEqualTo(BigDecimal value) {
            addCriterion("sepSinglePrice <>", value, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceGreaterThan(BigDecimal value) {
            addCriterion("sepSinglePrice >", value, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sepSinglePrice >=", value, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceLessThan(BigDecimal value) {
            addCriterion("sepSinglePrice <", value, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sepSinglePrice <=", value, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceIn(List<BigDecimal> values) {
            addCriterion("sepSinglePrice in", values, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceNotIn(List<BigDecimal> values) {
            addCriterion("sepSinglePrice not in", values, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sepSinglePrice between", value1, value2, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSepsinglepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sepSinglePrice not between", value1, value2, "sepsingleprice");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtIsNull() {
            addCriterion("sepTotalAmt is null");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtIsNotNull() {
            addCriterion("sepTotalAmt is not null");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtEqualTo(BigDecimal value) {
            addCriterion("sepTotalAmt =", value, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtNotEqualTo(BigDecimal value) {
            addCriterion("sepTotalAmt <>", value, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtGreaterThan(BigDecimal value) {
            addCriterion("sepTotalAmt >", value, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sepTotalAmt >=", value, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtLessThan(BigDecimal value) {
            addCriterion("sepTotalAmt <", value, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sepTotalAmt <=", value, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtIn(List<BigDecimal> values) {
            addCriterion("sepTotalAmt in", values, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtNotIn(List<BigDecimal> values) {
            addCriterion("sepTotalAmt not in", values, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sepTotalAmt between", value1, value2, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andSeptotalamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sepTotalAmt not between", value1, value2, "septotalamt");
            return (Criteria) this;
        }

        public Criteria andVipamountIsNull() {
            addCriterion("vipAmount is null");
            return (Criteria) this;
        }

        public Criteria andVipamountIsNotNull() {
            addCriterion("vipAmount is not null");
            return (Criteria) this;
        }

        public Criteria andVipamountEqualTo(Integer value) {
            addCriterion("vipAmount =", value, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipamountNotEqualTo(Integer value) {
            addCriterion("vipAmount <>", value, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipamountGreaterThan(Integer value) {
            addCriterion("vipAmount >", value, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipAmount >=", value, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipamountLessThan(Integer value) {
            addCriterion("vipAmount <", value, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipamountLessThanOrEqualTo(Integer value) {
            addCriterion("vipAmount <=", value, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipamountIn(List<Integer> values) {
            addCriterion("vipAmount in", values, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipamountNotIn(List<Integer> values) {
            addCriterion("vipAmount not in", values, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipamountBetween(Integer value1, Integer value2) {
            addCriterion("vipAmount between", value1, value2, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipamountNotBetween(Integer value1, Integer value2) {
            addCriterion("vipAmount not between", value1, value2, "vipamount");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceIsNull() {
            addCriterion("vipSinglePrice is null");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceIsNotNull() {
            addCriterion("vipSinglePrice is not null");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceEqualTo(BigDecimal value) {
            addCriterion("vipSinglePrice =", value, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceNotEqualTo(BigDecimal value) {
            addCriterion("vipSinglePrice <>", value, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceGreaterThan(BigDecimal value) {
            addCriterion("vipSinglePrice >", value, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vipSinglePrice >=", value, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceLessThan(BigDecimal value) {
            addCriterion("vipSinglePrice <", value, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vipSinglePrice <=", value, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceIn(List<BigDecimal> values) {
            addCriterion("vipSinglePrice in", values, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceNotIn(List<BigDecimal> values) {
            addCriterion("vipSinglePrice not in", values, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipSinglePrice between", value1, value2, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andVipsinglepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipSinglePrice not between", value1, value2, "vipsingleprice");
            return (Criteria) this;
        }

        public Criteria andViptotalamtIsNull() {
            addCriterion("vipTotalAmt is null");
            return (Criteria) this;
        }

        public Criteria andViptotalamtIsNotNull() {
            addCriterion("vipTotalAmt is not null");
            return (Criteria) this;
        }

        public Criteria andViptotalamtEqualTo(BigDecimal value) {
            addCriterion("vipTotalAmt =", value, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andViptotalamtNotEqualTo(BigDecimal value) {
            addCriterion("vipTotalAmt <>", value, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andViptotalamtGreaterThan(BigDecimal value) {
            addCriterion("vipTotalAmt >", value, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andViptotalamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vipTotalAmt >=", value, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andViptotalamtLessThan(BigDecimal value) {
            addCriterion("vipTotalAmt <", value, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andViptotalamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vipTotalAmt <=", value, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andViptotalamtIn(List<BigDecimal> values) {
            addCriterion("vipTotalAmt in", values, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andViptotalamtNotIn(List<BigDecimal> values) {
            addCriterion("vipTotalAmt not in", values, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andViptotalamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipTotalAmt between", value1, value2, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andViptotalamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipTotalAmt not between", value1, value2, "viptotalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtIsNull() {
            addCriterion("totalAmt is null");
            return (Criteria) this;
        }

        public Criteria andTotalamtIsNotNull() {
            addCriterion("totalAmt is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamtEqualTo(BigDecimal value) {
            addCriterion("totalAmt =", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtNotEqualTo(BigDecimal value) {
            addCriterion("totalAmt <>", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtGreaterThan(BigDecimal value) {
            addCriterion("totalAmt >", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalAmt >=", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtLessThan(BigDecimal value) {
            addCriterion("totalAmt <", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalAmt <=", value, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtIn(List<BigDecimal> values) {
            addCriterion("totalAmt in", values, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtNotIn(List<BigDecimal> values) {
            addCriterion("totalAmt not in", values, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalAmt between", value1, value2, "totalamt");
            return (Criteria) this;
        }

        public Criteria andTotalamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalAmt not between", value1, value2, "totalamt");
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