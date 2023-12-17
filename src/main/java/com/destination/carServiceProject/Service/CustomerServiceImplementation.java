package com.destination.carServiceProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.destination.carServiceProject.Model.Customer;
import com.destination.carServiceProject.Repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {
	private final CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImplementation(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
}
