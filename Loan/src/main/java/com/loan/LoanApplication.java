package com.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class LoanApplication {

    public static void main(String[] args) {
	SpringApplication.run(LoanApplication.class, args);
    }

}
