package com.loan.project.v1.dao;

import org.springframework.data.repository.CrudRepository;

import com.loan.project.v1.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, String> {

}
