package com.bean;

public class Customer {
    private String id;
    private String customerName;//乘机人姓名
    private String customerNumber;//乘机人电话
    private String customerCardId;//乘机人生份证
    private String birthday;//生日

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerCardId() {
        return customerCardId;
    }

    public void setCustomerCardId(String customerCardId) {
        this.customerCardId = customerCardId;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFlightId() {
        return null;
    }

    public String getPlaneType() {
        return null;
    }

    public Object getCurrentSeatsNum() {
        return null;
    }
    public Object getDapartureAirPort() {
        return null;
    }

    public String getDestinationAirPort() {
        return null;
    }

    public String getDepartureTime() {
        return null;
    }

    public String getDepartureAirPort() {
        return null;
    }
}
