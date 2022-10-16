package com.loan.project.v1.manager;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.loan.project.v1.entity.Customer;

public interface CustomerManager {

    public List<Customer> getAllCustomers();

    public Customer createCustomer(Customer customer);

    public Customer replaceCustomer(Customer customer, String customerId);

    public Customer getCustomer(String customerId);

    public JsonNode deleteCustomer(String customerId);

}
