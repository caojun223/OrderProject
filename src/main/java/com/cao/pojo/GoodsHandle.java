package com.cao.pojo;

import java.io.Serializable;
import java.util.Date;

public class GoodsHandle implements Serializable {
    private Integer goodsId;

    private String deliveryId;

    private Integer shipId;

    private Integer receiptId;

    private String goodsDesc;

    private Date shipDate;

    private Date receiptDate;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    @Override
    public String toString() {
        return "GoodsHandle{" +
                "goodsId=" + goodsId +
                ", deliveryId='" + deliveryId + '\'' +
                ", shipId=" + shipId +
                ", receiptId=" + receiptId +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", shipDate=" + shipDate +
                ", receiptDate=" + receiptDate +
                '}';
    }
}