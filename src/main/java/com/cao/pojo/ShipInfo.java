package com.cao.pojo;

import java.io.Serializable;

public class ShipInfo implements Serializable {
    private Integer shipId;

    private String shipNumber;

    private String shipName;

    private String shipProvince;

    private String shipAddress;

    private String shipTel;

    private static final long serialVersionUID = 1L;

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(String shipNumber) {
        this.shipNumber = shipNumber == null ? null : shipNumber.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getShipProvince() {
        return shipProvince;
    }

    public void setShipProvince(String shipProvince) {
        this.shipProvince = shipProvince == null ? null : shipProvince.trim();
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress == null ? null : shipAddress.trim();
    }

    public String getShipTel() {
        return shipTel;
    }

    public void setShipTel(String shipTel) {
        this.shipTel = shipTel == null ? null : shipTel.trim();
    }

    @Override
    public String toString() {
        return "ShipInfo{" +
                "shipId=" + shipId +
                ", shipNumber='" + shipNumber + '\'' +
                ", shipName='" + shipName + '\'' +
                ", shipProvince='" + shipProvince + '\'' +
                ", shipAddress='" + shipAddress + '\'' +
                ", shipTel='" + shipTel + '\'' +
                '}';
    }
}