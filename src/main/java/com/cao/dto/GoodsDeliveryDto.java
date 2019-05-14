package com.cao.dto;

public class GoodsDeliveryDto {
    private Integer goods_id;
    private Integer order_id;
    private String receipt_people;
    private String receipt_tel;
    private String goods_weight;
    private String goods_volume;
    private String receipt_address;

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getReceipt_people() {
        return receipt_people;
    }

    public void setReceipt_people(String receipt_people) {
        this.receipt_people = receipt_people;
    }

    public String getReceipt_tel() {
        return receipt_tel;
    }

    public void setReceipt_tel(String receipt_tel) {
        this.receipt_tel = receipt_tel;
    }

    public String getGoods_weight() {
        return goods_weight;
    }

    public void setGoods_weight(String goods_weight) {
        this.goods_weight = goods_weight;
    }

    public String getGoods_volume() {
        return goods_volume;
    }

    public void setGoods_volume(String goods_volume) {
        this.goods_volume = goods_volume;
    }

    public String getReceipt_address() {
        return receipt_address;
    }

    public void setReceipt_address(String receipt_address) {
        this.receipt_address = receipt_address;
    }

    @Override
    public String toString() {
        return "GoodsDeliveryDto{" +
                "goods_id=" + goods_id +
                ", order_id=" + order_id +
                ", receipt_people='" + receipt_people + '\'' +
                ", receipt_tel='" + receipt_tel + '\'' +
                ", goods_weight='" + goods_weight + '\'' +
                ", goods_volume='" + goods_volume + '\'' +
                ", receipt_address='" + receipt_address + '\'' +
                '}';
    }
}
