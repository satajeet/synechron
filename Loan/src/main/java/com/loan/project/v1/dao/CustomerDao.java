package com.loan.project.v1.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.loan.project.v1.entity.Customer;

public interface CustomerDao extends MongoRepository<Customer, String> {

    @Query("{tifId:'?0'}")
    public Customer findCustomerByTifId(String tifId);

}
