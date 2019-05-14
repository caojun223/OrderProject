package com.cao.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class GoodsHandleDto {
    private int goods_id;
    private String delivery_id;
    private int ship_id;
    private int receipt_id;
    private String goods_desc;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp ship_date;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp receipt_date;
    private String ship_number;
    private String ship_name;
    private String ship_province;
    private String ship_address;
    private String ship_tel;
    private String receipt_number;
    private String receipt_name;
    private String receipt_province;
    private String receipt_address;
    private String receipt_tel;

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(String delivery_id) {
        this.delivery_id = delivery_id;
    }

    public int getShip_id() {
        return ship_id;
    }

    public void setShip_id(int ship_id) {
        this.ship_id = ship_id;
    }

    public int getReceipt_id() {
        return receipt_id;
    }

    public void setReceipt_id(int receipt_id) {
        this.receipt_id = receipt_id;
    }

    public String getGoods_desc() {
        return goods_desc;
    }

    public void setGoods_desc(String goods_desc) {
        this.goods_desc = goods_desc;
    }

    public Timestamp getShip_date() {
        return ship_date;
    }

    public void setShip_date(Timestamp ship_date) {
        this.ship_date = ship_date;
    }

    public Timestamp getReceipt_date() {
        return receipt_date;
    }

    public void setReceipt_date(Timestamp receipt_date) {
        this.receipt_date = receipt_date;
    }

    public String getShip_number() {
        return ship_number;
    }

    public void setShip_number(String ship_number) {
        this.ship_number = ship_number;
    }

    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getShip_province() {
        return ship_province;
    }

    public void setShip_province(String ship_province) {
        this.ship_province = ship_province;
    }

    public String getShip_address() {
        return ship_address;
    }

    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }

    public String getShip_tel() {
        return ship_tel;
    }

    public void setShip_tel(String ship_tel) {
        this.ship_tel = ship_tel;
    }

    public String getReceipt_number() {
        return receipt_number;
    }

    public void setReceipt_number(String receipt_number) {
        this.receipt_number = receipt_number;
    }

    public String getReceipt_name() {
        return receipt_name;
    }

    public void setReceipt_name(String receipt_name) {
        this.receipt_name = receipt_name;
    }

    public String getReceipt_province() {
        return receipt_province;
    }

    public void setReceipt_province(String receipt_province) {
        this.receipt_province = receipt_province;
    }

    public String getReceipt_address() {
        return receipt_address;
    }

    public void setReceipt_address(String receipt_address) {
        this.receipt_address = receipt_address;
    }

    public String getReceipt_tel() {
        return receipt_tel;
    }

    public void setReceipt_tel(String receipt_tel) {
        this.receipt_tel = receipt_tel;
    }

    @Override
    public String toString() {
        return "GoodsHandleDto{" +
                "goods_id=" + goods_id +
                ", delivery_id='" + delivery_id + '\'' +
                ", ship_id=" + ship_id +
                ", receipt_id=" + receipt_id +
                ", goods_desc='" + goods_desc + '\'' +
                ", ship_date=" + ship_date +
                ", receipt_date=" + receipt_date +
                ", ship_number='" + ship_number + '\'' +
                ", ship_name='" + ship_name + '\'' +
                ", ship_province='" + ship_province + '\'' +
                ", ship_address='" + ship_address + '\'' +
                ", ship_tel='" + ship_tel + '\'' +
                ", receipt_number='" + receipt_number + '\'' +
                ", receipt_name='" + receipt_name + '\'' +
                ", receipt_province='" + receipt_province + '\'' +
                ", receipt_address='" + receipt_address + '\'' +
                ", receipt_tel='" + receipt_tel + '\'' +
                '}';
    }
}
