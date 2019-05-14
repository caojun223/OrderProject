package com.cao.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.regex.Pattern;

public class OrderHandle implements Serializable {
    private Integer orderId;

    private String deliveryId;

    private Integer shipId;

    private Integer receiptId;

    private String customerName;

    private String customerTel;

    private String receiptPeople;

    private String receiptTel;

    private String receiptAddress;

    private Double goodsWeight;

    private String goodsVolume;

    private String orderDesc;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date orderDate;

    private String orderStatus;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId == null ? null : deliveryId.trim();
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel == null ? null : customerTel.trim();
    }

    public String getReceiptPeople() {
        return receiptPeople;
    }

    public void setReceiptPeople(String receiptPeople) {
        this.receiptPeople = receiptPeople == null ? null : receiptPeople.trim();
    }

    public String getReceiptTel() {
        return receiptTel;
    }

    public void setReceiptTel(String receiptTel) {
        this.receiptTel = receiptTel == null ? null : receiptTel.trim();
    }

    public String getReceiptAddress() {
        return receiptAddress;
    }

    public void setReceiptAddress(String receiptAddress) {
        this.receiptAddress = receiptAddress == null ? null : receiptAddress.trim();
    }

    public Double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getGoodsVolume() {
        return goodsVolume;
    }

    public void setGoodsVolume(String goodsVolume) {
        this.goodsVolume = goodsVolume == null ? null : goodsVolume.trim();
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    @Override
    public String toString() {
        return "OrderHandle{" +
                "orderId=" + orderId +
                ", deliveryId='" + deliveryId + '\'' +
                ", shipId=" + shipId +
                ", receiptId=" + receiptId +
                ", customerName='" + customerName + '\'' +
                ", customerTel='" + customerTel + '\'' +
                ", receiptPeople='" + receiptPeople + '\'' +
                ", receiptTel='" + receiptTel + '\'' +
                ", receiptAddress='" + receiptAddress + '\'' +
                ", goodsWeight=" + goodsWeight +
                ", goodsVolume='" + goodsVolume + '\'' +
                ", orderDesc='" + orderDesc + '\'' +
                ", orderDate=" + orderDate +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}