package com.lexsav.controller;

import com.lexsav.entity.Customer;
import com.lexsav.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO make number column for list
//TODO make header like a home link
//TODO if nothing in the field entity, make '-' instead of just empty space
//TODO apply some validation rules
//TODO make table round

@Controller()
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomers(Model model) {
		
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}
	
	@GetMapping("/add")
	public String addCustomer(Model model) {
		
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "add-student";
	}
	
	@PostMapping("/add")
	public String addCustomer(Model model, @ModelAttribute Customer customer) {
		
		customerService.addCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/update")
	public String updateCustomer(Model model, @RequestParam(value="id") Integer id) {
		
		Customer customer = customerService.getCustomer(id);
		model.addAttribute("customer", customer);
		return "update-customer";
	}
	
	@PostMapping("/update")
	public String updateCustomer(@ModelAttribute Customer customer) {
		customerService.updateCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@PostMapping("/delete")
	public String deleteCustomer(Model model, @RequestParam(value="id") Integer id) {
		Customer customer = customerService.getCustomer(id);
		customerService.deleteCustomer(customer);
		return "redirect:/customer/list";
	}
}
