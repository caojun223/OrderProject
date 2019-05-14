package com.cao.dto;

public class StationInfoDto {
    private int station_id;
    private String station_number;
    private String station_name;
    private String station_type;
    private int ship_id;
    private String ship_number;
    private String ship_name;
    private String ship_province;
    private int receipt_id;
    private String receipt_number;
    private String receipt_name;
    private String receipt_province;

    public String getShip_province() {
        return ship_province;
    }

    public void setShip_province(String ship_province) {
        this.ship_province = ship_province;
    }

    public String getReceipt_province() {
        return receipt_province;
    }

    public void setReceipt_province(String receipt_province) {
        this.receipt_province = receipt_province;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getStation_number() {
        return station_number;
    }

    public void setStation_number(String station_number) {
        this.station_number = station_number;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStation_type() {
        return station_type;
    }

    public void setStation_type(String station_type) {
        this.station_type = station_type;
    }

    public int getShip_id() {
        return ship_id;
    }

    public void setShip_id(int ship_id) {
        this.ship_id = ship_id;
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

    public int getReceipt_id() {
        return receipt_id;
    }

    public void setReceipt_id(int receipt_id) {
        this.receipt_id = receipt_id;
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

    @Override
    public String toString() {
        return "StationInfoDto{" +
                "station_id=" + station_id +
                ", station_number='" + station_number + '\'' +
                ", station_name='" + station_name + '\'' +
                ", station_type='" + station_type + '\'' +
                ", ship_id=" + ship_id +
                ", ship_number='" + ship_number + '\'' +
                ", ship_name='" + ship_name + '\'' +
                ", ship_province='" + ship_province + '\'' +
                ", receipt_id=" + receipt_id +
                ", receipt_number='" + receipt_number + '\'' +
                ", receipt_name='" + receipt_name + '\'' +
                ", receipt_province='" + receipt_province + '\'' +
                '}';
    }
}
