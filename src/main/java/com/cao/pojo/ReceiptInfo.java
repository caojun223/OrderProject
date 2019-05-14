package com.cao.pojo;

import java.io.Serializable;

public class ReceiptInfo implements Serializable {
    private Integer receiptId;

    private String receiptNumber;

    private String receiptName;

    private String receiptProvince;

    private String receiptAddress;

    private String receiptTel;

    private static final long serialVersionUID = 1L;

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber == null ? null : receiptNumber.trim();
    }

    public String getReceiptName() {
        return receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName == null ? null : receiptName.trim();
    }

    public String getReceiptProvince() {
        return receiptProvince;
    }

    public void setReceiptProvince(String receiptProvince) {
        this.receiptProvince = receiptProvince == null ? null : receiptProvince.trim();
    }

    public String getReceiptAddress() {
        return receiptAddress;
    }

    public void setReceiptAddress(String receiptAddress) {
        this.receiptAddress = receiptAddress == null ? null : receiptAddress.trim();
    }

    public String getReceiptTel() {
        return receiptTel;
    }

    public void setReceiptTel(String receiptTel) {
        this.receiptTel = receiptTel == null ? null : receiptTel.trim();
    }

    @Override
    public String toString() {
        return "ReceiptInfo{" +
                "receiptId=" + receiptId +
                ", receiptNumber='" + receiptNumber + '\'' +
                ", receiptName='" + receiptName + '\'' +
                ", receiptProvince='" + receiptProvince + '\'' +
                ", receiptAddress='" + receiptAddress + '\'' +
                ", receiptTel='" + receiptTel + '\'' +
                '}';
    }
}