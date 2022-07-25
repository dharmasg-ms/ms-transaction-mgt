package com.sg.exp.service;

import java.util.List;

import com.sg.exp.model.Customer;

public interface CustomerService {

	public List<Customer> retrieve();
	public String insert(Customer customer);
	public String delete(Integer customerId);
}
