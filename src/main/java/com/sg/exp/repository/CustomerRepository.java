package com.sg.exp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sg.exp.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
