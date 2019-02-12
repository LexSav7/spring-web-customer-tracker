package com.lexsav.service;

import com.lexsav.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
	List<Customer> getCustomers();
	
	void addCustomer(Customer customer);

	Customer getCustomer(Integer id);

	void updateCustomer(Customer customer);

	void deleteCustomer(Customer customer);
}
