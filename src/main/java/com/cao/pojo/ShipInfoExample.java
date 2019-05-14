package com.cao.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShipInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShipInfoExample() {
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

        public Criteria andShipNumberIsNull() {
            addCriterion("Ship_Number is null");
            return (Criteria) this;
        }

        public Criteria andShipNumberIsNotNull() {
            addCriterion("Ship_Number is not null");
            return (Criteria) this;
        }

        public Criteria andShipNumberEqualTo(String value) {
            addCriterion("Ship_Number =", value, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberNotEqualTo(String value) {
            addCriterion("Ship_Number <>", value, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberGreaterThan(String value) {
            addCriterion("Ship_Number >", value, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Ship_Number >=", value, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberLessThan(String value) {
            addCriterion("Ship_Number <", value, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberLessThanOrEqualTo(String value) {
            addCriterion("Ship_Number <=", value, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberLike(String value) {
            addCriterion("Ship_Number like", value, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberNotLike(String value) {
            addCriterion("Ship_Number not like", value, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberIn(List<String> values) {
            addCriterion("Ship_Number in", values, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberNotIn(List<String> values) {
            addCriterion("Ship_Number not in", values, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberBetween(String value1, String value2) {
            addCriterion("Ship_Number between", value1, value2, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNumberNotBetween(String value1, String value2) {
            addCriterion("Ship_Number not between", value1, value2, "shipNumber");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("Ship_Name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("Ship_Name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("Ship_Name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("Ship_Name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("Ship_Name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("Ship_Name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("Ship_Name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("Ship_Name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("Ship_Name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("Ship_Name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("Ship_Name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("Ship_Name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("Ship_Name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("Ship_Name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipProvinceIsNull() {
            addCriterion("Ship_Province is null");
            return (Criteria) this;
        }

        public Criteria andShipProvinceIsNotNull() {
            addCriterion("Ship_Province is not null");
            return (Criteria) this;
        }

        public Criteria andShipProvinceEqualTo(String value) {
            addCriterion("Ship_Province =", value, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceNotEqualTo(String value) {
            addCriterion("Ship_Province <>", value, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceGreaterThan(String value) {
            addCriterion("Ship_Province >", value, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("Ship_Province >=", value, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceLessThan(String value) {
            addCriterion("Ship_Province <", value, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceLessThanOrEqualTo(String value) {
            addCriterion("Ship_Province <=", value, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceLike(String value) {
            addCriterion("Ship_Province like", value, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceNotLike(String value) {
            addCriterion("Ship_Province not like", value, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceIn(List<String> values) {
            addCriterion("Ship_Province in", values, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceNotIn(List<String> values) {
            addCriterion("Ship_Province not in", values, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceBetween(String value1, String value2) {
            addCriterion("Ship_Province between", value1, value2, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipProvinceNotBetween(String value1, String value2) {
            addCriterion("Ship_Province not between", value1, value2, "shipProvince");
            return (Criteria) this;
        }

        public Criteria andShipAddressIsNull() {
            addCriterion("Ship_Address is null");
            return (Criteria) this;
        }

        public Criteria andShipAddressIsNotNull() {
            addCriterion("Ship_Address is not null");
            return (Criteria) this;
        }

        public Criteria andShipAddressEqualTo(String value) {
            addCriterion("Ship_Address =", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotEqualTo(String value) {
            addCriterion("Ship_Address <>", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressGreaterThan(String value) {
            addCriterion("Ship_Address >", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Ship_Address >=", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressLessThan(String value) {
            addCriterion("Ship_Address <", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressLessThanOrEqualTo(String value) {
            addCriterion("Ship_Address <=", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressLike(String value) {
            addCriterion("Ship_Address like", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotLike(String value) {
            addCriterion("Ship_Address not like", value, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressIn(List<String> values) {
            addCriterion("Ship_Address in", values, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotIn(List<String> values) {
            addCriterion("Ship_Address not in", values, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressBetween(String value1, String value2) {
            addCriterion("Ship_Address between", value1, value2, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipAddressNotBetween(String value1, String value2) {
            addCriterion("Ship_Address not between", value1, value2, "shipAddress");
            return (Criteria) this;
        }

        public Criteria andShipTelIsNull() {
            addCriterion("Ship_Tel is null");
            return (Criteria) this;
        }

        public Criteria andShipTelIsNotNull() {
            addCriterion("Ship_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andShipTelEqualTo(String value) {
            addCriterion("Ship_Tel =", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelNotEqualTo(String value) {
            addCriterion("Ship_Tel <>", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelGreaterThan(String value) {
            addCriterion("Ship_Tel >", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelGreaterThanOrEqualTo(String value) {
            addCriterion("Ship_Tel >=", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelLessThan(String value) {
            addCriterion("Ship_Tel <", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelLessThanOrEqualTo(String value) {
            addCriterion("Ship_Tel <=", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelLike(String value) {
            addCriterion("Ship_Tel like", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelNotLike(String value) {
            addCriterion("Ship_Tel not like", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelIn(List<String> values) {
            addCriterion("Ship_Tel in", values, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelNotIn(List<String> values) {
            addCriterion("Ship_Tel not in", values, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelBetween(String value1, String value2) {
            addCriterion("Ship_Tel between", value1, value2, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelNotBetween(String value1, String value2) {
            addCriterion("Ship_Tel not between", value1, value2, "shipTel");
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