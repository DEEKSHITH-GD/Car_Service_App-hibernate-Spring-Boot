package com.destination.carServiceProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.destination.carServiceProject.Model.Customer;
import com.destination.carServiceProject.Service.CustomerService;

@Controller
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/CustomerRegister")
    public String registerCustomer(@ModelAttribute Customer customer, Model model) {
        if (isCustomerDataIncomplete(customer)) {
            // If data is incomplete, redirect to RegisterFailed page
            return "redirect:/RegisterFailed";
        }

        // If data is complete, save the customer and redirect to RegisterSuccessful
        customerService.saveCustomer(customer);
        return "redirect:/RegisterSuccessful";
    }

    private boolean isCustomerDataIncomplete(Customer customer) {
        // Add your logic to check if customer data is incomplete
        // For example, you can check if required fields are empty
        return customer.getOwnerName() == null || customer.getOwnerName().isEmpty()
                || customer.getPassword() == null || customer.getPassword().isEmpty()
                || customer.getVehicleRegNo() == null || customer.getVehicleRegNo().isEmpty();
    }
}
