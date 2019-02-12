package com.lexsav.dao;

import com.lexsav.entity.Customer;

import java.util.List;

public interface CustomerDAO {
	List<Customer> getCustomers();
	
	Customer getCustomer(Integer id);
	
	void saveCustomer(Customer customer);
	
	void updateCustomer(Customer customer);

	void deleteCustomer(Customer customer);
}
