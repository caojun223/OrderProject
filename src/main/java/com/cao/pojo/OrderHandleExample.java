package com.cao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderHandleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderHandleExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("Order_Id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("Order_Id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("Order_Id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order_Id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("Order_Id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("Order_Id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("Order_Id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("Order_Id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("Order_Id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Order_Id not between", value1, value2, "orderId");
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("Customer_Name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("Customer_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("Customer_Name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("Customer_Name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("Customer_Name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_Name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("Customer_Name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("Customer_Name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("Customer_Name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("Customer_Name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("Customer_Name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("Customer_Name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("Customer_Name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("Customer_Name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNull() {
            addCriterion("Customer_Tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNotNull() {
            addCriterion("Customer_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelEqualTo(String value) {
            addCriterion("Customer_Tel =", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotEqualTo(String value) {
            addCriterion("Customer_Tel <>", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThan(String value) {
            addCriterion("Customer_Tel >", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_Tel >=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThan(String value) {
            addCriterion("Customer_Tel <", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("Customer_Tel <=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLike(String value) {
            addCriterion("Customer_Tel like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotLike(String value) {
            addCriterion("Customer_Tel not like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIn(List<String> values) {
            addCriterion("Customer_Tel in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotIn(List<String> values) {
            addCriterion("Customer_Tel not in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelBetween(String value1, String value2) {
            addCriterion("Customer_Tel between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotBetween(String value1, String value2) {
            addCriterion("Customer_Tel not between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleIsNull() {
            addCriterion("Receipt_People is null");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleIsNotNull() {
            addCriterion("Receipt_People is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleEqualTo(String value) {
            addCriterion("Receipt_People =", value, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleNotEqualTo(String value) {
            addCriterion("Receipt_People <>", value, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleGreaterThan(String value) {
            addCriterion("Receipt_People >", value, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("Receipt_People >=", value, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleLessThan(String value) {
            addCriterion("Receipt_People <", value, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleLessThanOrEqualTo(String value) {
            addCriterion("Receipt_People <=", value, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleLike(String value) {
            addCriterion("Receipt_People like", value, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleNotLike(String value) {
            addCriterion("Receipt_People not like", value, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleIn(List<String> values) {
            addCriterion("Receipt_People in", values, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleNotIn(List<String> values) {
            addCriterion("Receipt_People not in", values, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleBetween(String value1, String value2) {
            addCriterion("Receipt_People between", value1, value2, "receiptPeople");
            return (Criteria) this;
        }

        public Criteria andReceiptPeopleNotBetween(String value1, String value2) {
            addCriterion("Receipt_People not between", value1, value2, "receiptPeople");
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

        public Criteria andGoodsWeightIsNull() {
            addCriterion("Goods_Weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("Goods_Weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(Double value) {
            addCriterion("Goods_Weight =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(Double value) {
            addCriterion("Goods_Weight <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(Double value) {
            addCriterion("Goods_Weight >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("Goods_Weight >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(Double value) {
            addCriterion("Goods_Weight <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(Double value) {
            addCriterion("Goods_Weight <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<Double> values) {
            addCriterion("Goods_Weight in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<Double> values) {
            addCriterion("Goods_Weight not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(Double value1, Double value2) {
            addCriterion("Goods_Weight between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(Double value1, Double value2) {
            addCriterion("Goods_Weight not between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeIsNull() {
            addCriterion("Goods_Volume is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeIsNotNull() {
            addCriterion("Goods_Volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeEqualTo(String value) {
            addCriterion("Goods_Volume =", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotEqualTo(String value) {
            addCriterion("Goods_Volume <>", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeGreaterThan(String value) {
            addCriterion("Goods_Volume >", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Volume >=", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeLessThan(String value) {
            addCriterion("Goods_Volume <", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeLessThanOrEqualTo(String value) {
            addCriterion("Goods_Volume <=", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeLike(String value) {
            addCriterion("Goods_Volume like", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotLike(String value) {
            addCriterion("Goods_Volume not like", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeIn(List<String> values) {
            addCriterion("Goods_Volume in", values, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotIn(List<String> values) {
            addCriterion("Goods_Volume not in", values, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeBetween(String value1, String value2) {
            addCriterion("Goods_Volume between", value1, value2, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotBetween(String value1, String value2) {
            addCriterion("Goods_Volume not between", value1, value2, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNull() {
            addCriterion("Order_Desc is null");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNotNull() {
            addCriterion("Order_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDescEqualTo(String value) {
            addCriterion("Order_Desc =", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotEqualTo(String value) {
            addCriterion("Order_Desc <>", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThan(String value) {
            addCriterion("Order_Desc >", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThanOrEqualTo(String value) {
            addCriterion("Order_Desc >=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThan(String value) {
            addCriterion("Order_Desc <", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThanOrEqualTo(String value) {
            addCriterion("Order_Desc <=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLike(String value) {
            addCriterion("Order_Desc like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotLike(String value) {
            addCriterion("Order_Desc not like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescIn(List<String> values) {
            addCriterion("Order_Desc in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotIn(List<String> values) {
            addCriterion("Order_Desc not in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescBetween(String value1, String value2) {
            addCriterion("Order_Desc between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotBetween(String value1, String value2) {
            addCriterion("Order_Desc not between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("Order_Date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("Order_Date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("Order_Date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("Order_Date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("Order_Date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Order_Date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("Order_Date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("Order_Date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("Order_Date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("Order_Date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("Order_Date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("Order_Date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("Order_Status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("Order_Status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("Order_Status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("Order_Status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("Order_Status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Order_Status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("Order_Status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("Order_Status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("Order_Status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("Order_Status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("Order_Status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("Order_Status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("Order_Status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("Order_Status not between", value1, value2, "orderStatus");
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