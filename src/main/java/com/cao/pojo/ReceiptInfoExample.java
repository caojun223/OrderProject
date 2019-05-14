package com.cao.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReceiptInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiptInfoExample() {
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

        public Criteria andReceiptNumberIsNull() {
            addCriterion("Receipt_Number is null");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberIsNotNull() {
            addCriterion("Receipt_Number is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberEqualTo(String value) {
            addCriterion("Receipt_Number =", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberNotEqualTo(String value) {
            addCriterion("Receipt_Number <>", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberGreaterThan(String value) {
            addCriterion("Receipt_Number >", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Receipt_Number >=", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberLessThan(String value) {
            addCriterion("Receipt_Number <", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberLessThanOrEqualTo(String value) {
            addCriterion("Receipt_Number <=", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberLike(String value) {
            addCriterion("Receipt_Number like", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberNotLike(String value) {
            addCriterion("Receipt_Number not like", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberIn(List<String> values) {
            addCriterion("Receipt_Number in", values, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberNotIn(List<String> values) {
            addCriterion("Receipt_Number not in", values, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberBetween(String value1, String value2) {
            addCriterion("Receipt_Number between", value1, value2, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberNotBetween(String value1, String value2) {
            addCriterion("Receipt_Number not between", value1, value2, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIsNull() {
            addCriterion("Receipt_Name is null");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIsNotNull() {
            addCriterion("Receipt_Name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptNameEqualTo(String value) {
            addCriterion("Receipt_Name =", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotEqualTo(String value) {
            addCriterion("Receipt_Name <>", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameGreaterThan(String value) {
            addCriterion("Receipt_Name >", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameGreaterThanOrEqualTo(String value) {
            addCriterion("Receipt_Name >=", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLessThan(String value) {
            addCriterion("Receipt_Name <", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLessThanOrEqualTo(String value) {
            addCriterion("Receipt_Name <=", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLike(String value) {
            addCriterion("Receipt_Name like", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotLike(String value) {
            addCriterion("Receipt_Name not like", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIn(List<String> values) {
            addCriterion("Receipt_Name in", values, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotIn(List<String> values) {
            addCriterion("Receipt_Name not in", values, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameBetween(String value1, String value2) {
            addCriterion("Receipt_Name between", value1, value2, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotBetween(String value1, String value2) {
            addCriterion("Receipt_Name not between", value1, value2, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceIsNull() {
            addCriterion("Receipt_Province is null");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceIsNotNull() {
            addCriterion("Receipt_Province is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceEqualTo(String value) {
            addCriterion("Receipt_Province =", value, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceNotEqualTo(String value) {
            addCriterion("Receipt_Province <>", value, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceGreaterThan(String value) {
            addCriterion("Receipt_Province >", value, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("Receipt_Province >=", value, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceLessThan(String value) {
            addCriterion("Receipt_Province <", value, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceLessThanOrEqualTo(String value) {
            addCriterion("Receipt_Province <=", value, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceLike(String value) {
            addCriterion("Receipt_Province like", value, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceNotLike(String value) {
            addCriterion("Receipt_Province not like", value, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceIn(List<String> values) {
            addCriterion("Receipt_Province in", values, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceNotIn(List<String> values) {
            addCriterion("Receipt_Province not in", values, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceBetween(String value1, String value2) {
            addCriterion("Receipt_Province between", value1, value2, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptProvinceNotBetween(String value1, String value2) {
            addCriterion("Receipt_Province not between", value1, value2, "receiptProvince");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressIsNull() {
            addCriterion("Receipt_Address is null");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressIsNotNull() {
            addCriterion("Receipt_Address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressEqualTo(String value) {
            addCriterion("Receipt_Address =", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotEqualTo(String value) {
            addCriterion("Receipt_Address <>", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressGreaterThan(String value) {
            addCriterion("Receipt_Address >", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Receipt_Address >=", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressLessThan(String value) {
            addCriterion("Receipt_Address <", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressLessThanOrEqualTo(String value) {
            addCriterion("Receipt_Address <=", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressLike(String value) {
            addCriterion("Receipt_Address like", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotLike(String value) {
            addCriterion("Receipt_Address not like", value, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressIn(List<String> values) {
            addCriterion("Receipt_Address in", values, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotIn(List<String> values) {
            addCriterion("Receipt_Address not in", values, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressBetween(String value1, String value2) {
            addCriterion("Receipt_Address between", value1, value2, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptAddressNotBetween(String value1, String value2) {
            addCriterion("Receipt_Address not between", value1, value2, "receiptAddress");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIsNull() {
            addCriterion("Receipt_Tel is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIsNotNull() {
            addCriterion("Receipt_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTelEqualTo(String value) {
            addCriterion("Receipt_Tel =", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotEqualTo(String value) {
            addCriterion("Receipt_Tel <>", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelGreaterThan(String value) {
            addCriterion("Receipt_Tel >", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelGreaterThanOrEqualTo(String value) {
            addCriterion("Receipt_Tel >=", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLessThan(String value) {
            addCriterion("Receipt_Tel <", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLessThanOrEqualTo(String value) {
            addCriterion("Receipt_Tel <=", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLike(String value) {
            addCriterion("Receipt_Tel like", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotLike(String value) {
            addCriterion("Receipt_Tel not like", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIn(List<String> values) {
            addCriterion("Receipt_Tel in", values, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotIn(List<String> values) {
            addCriterion("Receipt_Tel not in", values, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelBetween(String value1, String value2) {
            addCriterion("Receipt_Tel between", value1, value2, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotBetween(String value1, String value2) {
            addCriterion("Receipt_Tel not between", value1, value2, "receiptTel");
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