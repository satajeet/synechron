package com.loan.project.v1.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.loan.project.v1.entity.Customer;
import com.loan.project.v1.manager.CustomerManager;

@RestController
@RequestMapping(value = "/customer-api/v1")
public class CustomerController {

    @Autowired
    CustomerManager customerManager;

    @RequestMapping(value = "/customers", produces = { "application/json" })
    public List<Customer> getCustomers() {
	return customerManager.getAllCustomers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customer", produces = { "application/json" }, consumes = {
	    "application/json" })
    public Customer createCustomer(@RequestBody Customer customer) {
	return customerManager.createCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customer/{customerId}", produces = {
	    "application/json" }, consumes = { "application/json" })
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable("customerId") String customerId) {
	return customerManager.replaceCustomer(customer, customerId);
    }

    @RequestMapping(value = "/customer/{customerId}", produces = { "application/json" })
    public Customer getCustomer(@PathVariable("customerId") String customerId) {
	return customerManager.getCustomer(customerId);
    }

    @RequestMapping(value = "/customerAppId/{tifId}", produces = { "application/json" })
    public String getCustomerApplicationByTifId(@PathVariable("tifId") String tifId) {
	return customerManager.getCustomerApplicationByTifId(tifId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/customer/{customerId}", produces = { "application/json" })
    public JsonNode deleteCustomer(@PathVariable("customerId") String customerId) {
	return customerManager.deleteCustomer(customerId);
    }
}