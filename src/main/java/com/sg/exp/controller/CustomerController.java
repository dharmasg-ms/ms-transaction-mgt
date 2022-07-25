package com.sg.exp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sg.exp.model.Customer;
import com.sg.exp.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/retrieve")
	public List<Customer> retrieve() {
		List<Customer> customerList = customerService.retrieve();
		return customerList;
	}

	@PostMapping("/insert")
	public String insert(@RequestBody Customer customer) {
		if (customer == null) {
			return "Failed to insert customer within the database";
		} else {
			String result = customerService.insert(customer);
			return result;
		}
	}

	@DeleteMapping("/delete")
	public String delete(Integer customerId) {

		String result = customerService.delete(customerId);
		return result;
	}
}
