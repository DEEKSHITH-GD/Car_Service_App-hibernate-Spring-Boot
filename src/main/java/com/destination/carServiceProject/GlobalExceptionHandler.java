package com.destination.carServiceProject;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = "com.destination.carServiceProject")
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        // You can customize this method to log the exception or perform other actions
        // For now, let's add the exception message to the model and return the error view
        model.addAttribute("error", e.getMessage());
        return "error"; // Assuming you have an "error" view
    }
}
