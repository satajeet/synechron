package com.loan.project.v1.manager.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.loan.project.v1.constants.LoanConstants;
import com.loan.project.v1.dao.CustomerDao;
import com.loan.project.v1.entity.Customer;
import com.loan.project.v1.manager.CustomerManager;

@Service
public class CustomerManagerImpl implements CustomerManager {

    @Autowired
    CustomerDao customerDao;

    @Override
    public List<Customer> getAllCustomers() {
	Iterable<Customer> customers = customerDao.findAll();
	List<Customer> customersList = new ArrayList<>();
	customers.forEach(customersList::add);
	return customersList;
    }

    @Override
    public Customer createCustomer(Customer customer) {
	return customerDao.save(customer);
    }

    @Override
    public Customer replaceCustomer(Customer customer, String customerId) {
	customer.setCustomerId(customerId);
	return customerDao.save(customer);
    }

    @Override
    public Customer getCustomer(String customerId) {
	return customerDao.findById(customerId).get();
    }

    @Override
    public JsonNode deleteCustomer(String customerId) {
	customerDao.deleteById(customerId);
	return LoanConstants.OBJECTMAPPER.createObjectNode();
    }
}
