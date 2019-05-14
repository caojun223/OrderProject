package com.cao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsHandleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsHandleExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("Goods_Id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("Goods_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("Goods_Id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("Goods_Id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("Goods_Id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_Id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("Goods_Id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_Id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("Goods_Id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("Goods_Id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNull() {
            addCriterion("Delivery_Id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNotNull() {
            addCriterion("Delivery_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdEqualTo(String value) {
            addCriterion("Delivery_Id =", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotEqualTo(String value) {
            addCriterion("Delivery_Id <>", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThan(String value) {
            addCriterion("Delivery_Id >", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThanOrEqualTo(String value) {
            addCriterion("Delivery_Id >=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThan(String value) {
            addCriterion("Delivery_Id <", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThanOrEqualTo(String value) {
            addCriterion("Delivery_Id <=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLike(String value) {
            addCriterion("Delivery_Id like", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotLike(String value) {
            addCriterion("Delivery_Id not like", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIn(List<String> values) {
            addCriterion("Delivery_Id in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotIn(List<String> values) {
            addCriterion("Delivery_Id not in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdBetween(String value1, String value2) {
            addCriterion("Delivery_Id between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotBetween(String value1, String value2) {
            addCriterion("Delivery_Id not between", value1, value2, "deliveryId");
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

        public Criteria andGoodsDescIsNull() {
            addCriterion("Goods_Desc is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNotNull() {
            addCriterion("Goods_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescEqualTo(String value) {
            addCriterion("Goods_Desc =", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotEqualTo(String value) {
            addCriterion("Goods_Desc <>", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThan(String value) {
            addCriterion("Goods_Desc >", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Desc >=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThan(String value) {
            addCriterion("Goods_Desc <", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThanOrEqualTo(String value) {
            addCriterion("Goods_Desc <=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLike(String value) {
            addCriterion("Goods_Desc like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotLike(String value) {
            addCriterion("Goods_Desc not like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIn(List<String> values) {
            addCriterion("Goods_Desc in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotIn(List<String> values) {
            addCriterion("Goods_Desc not in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescBetween(String value1, String value2) {
            addCriterion("Goods_Desc between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotBetween(String value1, String value2) {
            addCriterion("Goods_Desc not between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andShipDateIsNull() {
            addCriterion("Ship_Date is null");
            return (Criteria) this;
        }

        public Criteria andShipDateIsNotNull() {
            addCriterion("Ship_Date is not null");
            return (Criteria) this;
        }

        public Criteria andShipDateEqualTo(Date value) {
            addCriterion("Ship_Date =", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateNotEqualTo(Date value) {
            addCriterion("Ship_Date <>", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateGreaterThan(Date value) {
            addCriterion("Ship_Date >", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Ship_Date >=", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateLessThan(Date value) {
            addCriterion("Ship_Date <", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateLessThanOrEqualTo(Date value) {
            addCriterion("Ship_Date <=", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateIn(List<Date> values) {
            addCriterion("Ship_Date in", values, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateNotIn(List<Date> values) {
            addCriterion("Ship_Date not in", values, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateBetween(Date value1, Date value2) {
            addCriterion("Ship_Date between", value1, value2, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateNotBetween(Date value1, Date value2) {
            addCriterion("Ship_Date not between", value1, value2, "shipDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateIsNull() {
            addCriterion("Receipt_Date is null");
            return (Criteria) this;
        }

        public Criteria andReceiptDateIsNotNull() {
            addCriterion("Receipt_Date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptDateEqualTo(Date value) {
            addCriterion("Receipt_Date =", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateNotEqualTo(Date value) {
            addCriterion("Receipt_Date <>", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateGreaterThan(Date value) {
            addCriterion("Receipt_Date >", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Receipt_Date >=", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateLessThan(Date value) {
            addCriterion("Receipt_Date <", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateLessThanOrEqualTo(Date value) {
            addCriterion("Receipt_Date <=", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateIn(List<Date> values) {
            addCriterion("Receipt_Date in", values, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateNotIn(List<Date> values) {
            addCriterion("Receipt_Date not in", values, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateBetween(Date value1, Date value2) {
            addCriterion("Receipt_Date between", value1, value2, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateNotBetween(Date value1, Date value2) {
            addCriterion("Receipt_Date not between", value1, value2, "receiptDate");
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