package com.destination.carServiceProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.destination.carServiceProject.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
