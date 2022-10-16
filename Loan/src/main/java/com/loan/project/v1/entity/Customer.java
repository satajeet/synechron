package com.loan.project.v1.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 576215622080347514L;
    @Id
    private String customerId;
    private String customerName;
    private String tifId;
    private String appRefNumber;
    private String mobileNumber;
    private String address;

    public Customer() {
	super();
    }

    public Customer(String customerId, String customerName, String tifId, String appRefNumber, String mobileNumber,
	    String address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.tifId = tifId;
	this.appRefNumber = appRefNumber;
	this.mobileNumber = mobileNumber;
	this.address = address;
    }

    public String getCustomerId() {
	return customerId;
    }

    public void setCustomerId(String customerId) {
	this.customerId = customerId;
    }

    public String getCustomerName() {
	return customerName;
    }

    public void setCustomerName(String customerName) {
	this.customerName = customerName;
    }

    public String getTifId() {
	return tifId;
    }

    public void setTifId(String tifId) {
	this.tifId = tifId;
    }

    public String getAppRefNumber() {
	return appRefNumber;
    }

    public void setAppRefNumber(String appRefNumber) {
	this.appRefNumber = appRefNumber;
    }

    public String getMobileNumber() {
	return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

}
