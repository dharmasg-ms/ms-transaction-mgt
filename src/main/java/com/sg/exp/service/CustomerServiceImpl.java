package com.sg.exp.service;

import java.util.List;

import com.sg.exp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sg.exp.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	@Transactional
	// A Proxy is Created that wraps the function retrieve
	// BeginTransaction
	public List<Customer> retrieve() {
		List<Customer> customerList = (List<Customer>) customerRepository.findAll();
		return customerList;
	}
	// Commit Transaction

	@Override
	@Transactional
	// A Proxy is Created that wraps the function insert
	// BeginTransaction
	public String insert(Customer customer) {
		Customer save = customerRepository.save(customer); // Call to the Repository
		if (save.getCustomerId() == 2) {
			int a = 1 / 0;
			System.out.println("The value of A is : " + a);
		}
		if (save != null) {
			return "The Customer is successfully inserted within the database";
		}
		return "Failed to insert Customer within the database";
	}
	// Commit Transaction

	@Override
	@Transactional
	// A Proxy is Created that wraps the function delete
	// BeginTransaction
	public String delete(int customerId) {
		customerRepository.deleteById(customerId);
		return "The CUstomer is successfully deleted from the database";
	}
	// Commit Transaction

}
