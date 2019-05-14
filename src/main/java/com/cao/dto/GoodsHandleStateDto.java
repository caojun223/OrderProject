package com.cao.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class GoodsHandleStateDto {

    private Integer goods_id;
    private String goods_desc;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp ship_date;

    public GoodsHandleStateDto(Integer goods_id, String goods_desc, Timestamp ship_date) {
        this.goods_id = goods_id;
        this.goods_desc = goods_desc;
        this.ship_date = ship_date;
    }

    public Timestamp getShip_date() {
        return ship_date;
    }

    public void setShip_date(Timestamp ship_date) {
        this.ship_date = ship_date;
    }

    public GoodsHandleStateDto() {
    }

    public GoodsHandleStateDto(Integer goods_id, String goods_desc) {
        this.goods_id = goods_id;
        this.goods_desc = goods_desc;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_desc() {
        return goods_desc;
    }

    public void setGoods_desc(String goods_desc) {
        this.goods_desc = goods_desc;
    }

    @Override
    public String toString() {
        return "GoodsHandleStateDto{" +
                "goods_id=" + goods_id +
                ", goods_desc='" + goods_desc + '\'' +
                ", ship_date=" + ship_date +
                '}';
    }
}
