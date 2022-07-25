package com.sg.exp;

import com.sg.exp.controller.CustomerController;
import com.sg.exp.model.Customer;
import com.sg.exp.repository.CustomerRepository;
import com.sg.exp.service.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    private CustomerController customerController;
    private Customer cust;

    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private CustomerService customerService;

    @BeforeEach
    public void setup(){
        customerController=new CustomerController();

    }
    @Test
    void insertCustomer(){
        cust=new Customer(1,"dharma",14);
        String result= customerService.insert(cust);
        System.out.println(result);

    }
}
