package com.cao.pojo;

import java.util.ArrayList;
import java.util.List;

public class StationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StationInfoExample() {
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

        public Criteria andStationIdIsNull() {
            addCriterion("Station_Id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("Station_Id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("Station_Id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("Station_Id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("Station_Id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Station_Id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("Station_Id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("Station_Id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("Station_Id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("Station_Id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("Station_Id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Station_Id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationNumberIsNull() {
            addCriterion("Station_Number is null");
            return (Criteria) this;
        }

        public Criteria andStationNumberIsNotNull() {
            addCriterion("Station_Number is not null");
            return (Criteria) this;
        }

        public Criteria andStationNumberEqualTo(String value) {
            addCriterion("Station_Number =", value, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberNotEqualTo(String value) {
            addCriterion("Station_Number <>", value, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberGreaterThan(String value) {
            addCriterion("Station_Number >", value, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Station_Number >=", value, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberLessThan(String value) {
            addCriterion("Station_Number <", value, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberLessThanOrEqualTo(String value) {
            addCriterion("Station_Number <=", value, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberLike(String value) {
            addCriterion("Station_Number like", value, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberNotLike(String value) {
            addCriterion("Station_Number not like", value, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberIn(List<String> values) {
            addCriterion("Station_Number in", values, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberNotIn(List<String> values) {
            addCriterion("Station_Number not in", values, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberBetween(String value1, String value2) {
            addCriterion("Station_Number between", value1, value2, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNumberNotBetween(String value1, String value2) {
            addCriterion("Station_Number not between", value1, value2, "stationNumber");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNull() {
            addCriterion("Station_Name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("Station_Name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("Station_Name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("Station_Name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("Station_Name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("Station_Name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("Station_Name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("Station_Name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("Station_Name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("Station_Name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("Station_Name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("Station_Name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("Station_Name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("Station_Name not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNull() {
            addCriterion("Station_Type is null");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNotNull() {
            addCriterion("Station_Type is not null");
            return (Criteria) this;
        }

        public Criteria andStationTypeEqualTo(String value) {
            addCriterion("Station_Type =", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotEqualTo(String value) {
            addCriterion("Station_Type <>", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThan(String value) {
            addCriterion("Station_Type >", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Station_Type >=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThan(String value) {
            addCriterion("Station_Type <", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThanOrEqualTo(String value) {
            addCriterion("Station_Type <=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLike(String value) {
            addCriterion("Station_Type like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotLike(String value) {
            addCriterion("Station_Type not like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeIn(List<String> values) {
            addCriterion("Station_Type in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotIn(List<String> values) {
            addCriterion("Station_Type not in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeBetween(String value1, String value2) {
            addCriterion("Station_Type between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotBetween(String value1, String value2) {
            addCriterion("Station_Type not between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNull() {
            addCriterion("Ship_Id is null");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNotNull() {
            addCriterion("Ship_Id is not null");
            return (Criteria) this;
        }

        public Criteria andShipIdEqualTo(Integer value) {
            addCriterion("Ship_Id =", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotEqualTo(Integer value) {
            addCriterion("Ship_Id <>", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThan(Integer value) {
            addCriterion("Ship_Id >", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ship_Id >=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThan(Integer value) {
            addCriterion("Ship_Id <", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThanOrEqualTo(Integer value) {
            addCriterion("Ship_Id <=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdIn(List<Integer> values) {
            addCriterion("Ship_Id in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotIn(List<Integer> values) {
            addCriterion("Ship_Id not in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdBetween(Integer value1, Integer value2) {
            addCriterion("Ship_Id between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Ship_Id not between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIsNull() {
            addCriterion("Receipt_Id is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIsNotNull() {
            addCriterion("Receipt_Id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdEqualTo(Integer value) {
            addCriterion("Receipt_Id =", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotEqualTo(Integer value) {
            addCriterion("Receipt_Id <>", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThan(Integer value) {
            addCriterion("Receipt_Id >", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Receipt_Id >=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThan(Integer value) {
            addCriterion("Receipt_Id <", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThanOrEqualTo(Integer value) {
            addCriterion("Receipt_Id <=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIn(List<Integer> values) {
            addCriterion("Receipt_Id in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotIn(List<Integer> values) {
            addCriterion("Receipt_Id not in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdBetween(Integer value1, Integer value2) {
            addCriterion("Receipt_Id between", value1, value2, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Receipt_Id not between", value1, value2, "receiptId");
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