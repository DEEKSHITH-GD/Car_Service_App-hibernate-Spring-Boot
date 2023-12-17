package com.destination.carServiceProject.Service;

import org.springframework.stereotype.Service;

import com.destination.carServiceProject.Model.Customer;

@Service
public interface CustomerService {
	void saveCustomer(Customer customer);
}
