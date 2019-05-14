package com.cao.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OrderHandleDtoAll {

    private Integer Order_Id;
    private String Delivery_Id;
    private String Customer_Name;
    private String Customer_Tel;
    private String Receipt_People;
    private String Goods_Weight;
    private String Goods_Volume;
    private String Order_Desc;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date Order_Date;
    private String Order_Status;
    private Integer Ship_Id;
    private String Ship_Number;
    private String Ship_Name;
    private String Ship_Province;
    private String Ship_Address;
    private String Ship_Tel;
    private Integer Receipt_Id;
    private String Receipt_Number;
    private String Receipt_Name;
    private String Receipt_Province;
    private String Receipt_Address;
    private String Receipt_Tel;

    public Integer getOrder_Id() {
        return Order_Id;
    }

    public void setOrder_Id(Integer order_Id) {
        Order_Id = order_Id;
    }

    public String getDelivery_Id() {
        return Delivery_Id;
    }

    public void setDelivery_Id(String delivery_Id) {
        Delivery_Id = delivery_Id;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getCustomer_Tel() {
        return Customer_Tel;
    }

    public void setCustomer_Tel(String customer_Tel) {
        Customer_Tel = customer_Tel;
    }

    public String getReceipt_People() {
        return Receipt_People;
    }

    public void setReceipt_People(String receipt_People) {
        Receipt_People = receipt_People;
    }

    public String getGoods_Weight() {
        return Goods_Weight;
    }

    public void setGoods_Weight(String goods_Weight) {
        Goods_Weight = goods_Weight;
    }

    public String getGoods_Volume() {
        return Goods_Volume;
    }

    public void setGoods_Volume(String goods_Volume) {
        Goods_Volume = goods_Volume;
    }

    public String getOrder_Desc() {
        return Order_Desc;
    }

    public void setOrder_Desc(String order_Desc) {
        Order_Desc = order_Desc;
    }

    public Date getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(Date order_Date) {
        Order_Date = order_Date;
    }

    public String getOrder_Status() {
        return Order_Status;
    }

    public void setOrder_Status(String order_Status) {
        Order_Status = order_Status;
    }

    public Integer getShip_Id() {
        return Ship_Id;
    }

    public void setShip_Id(Integer ship_Id) {
        Ship_Id = ship_Id;
    }

    public String getShip_Number() {
        return Ship_Number;
    }

    public void setShip_Number(String ship_Number) {
        Ship_Number = ship_Number;
    }

    public String getShip_Name() {
        return Ship_Name;
    }

    public void setShip_Name(String ship_Name) {
        Ship_Name = ship_Name;
    }

    public String getShip_Province() {
        return Ship_Province;
    }

    public void setShip_Province(String ship_Province) {
        Ship_Province = ship_Province;
    }

    public String getShip_Address() {
        return Ship_Address;
    }

    public void setShip_Address(String ship_Address) {
        Ship_Address = ship_Address;
    }

    public String getShip_Tel() {
        return Ship_Tel;
    }

    public void setShip_Tel(String ship_Tel) {
        Ship_Tel = ship_Tel;
    }

    public Integer getReceipt_Id() {
        return Receipt_Id;
    }

    public void setReceipt_Id(Integer receipt_Id) {
        Receipt_Id = receipt_Id;
    }

    public String getReceipt_Number() {
        return Receipt_Number;
    }

    public void setReceipt_Number(String receipt_Number) {
        Receipt_Number = receipt_Number;
    }

    public String getReceipt_Name() {
        return Receipt_Name;
    }

    public void setReceipt_Name(String receipt_Name) {
        Receipt_Name = receipt_Name;
    }

    public String getReceipt_Province() {
        return Receipt_Province;
    }

    public void setReceipt_Province(String receipt_Province) {
        Receipt_Province = receipt_Province;
    }

    public String getReceipt_Address() {
        return Receipt_Address;
    }

    public void setReceipt_Address(String receipt_Address) {
        Receipt_Address = receipt_Address;
    }

    public String getReceipt_Tel() {
        return Receipt_Tel;
    }

    public void setReceipt_Tel(String receipt_Tel) {
        Receipt_Tel = receipt_Tel;
    }
}
