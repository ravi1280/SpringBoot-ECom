package com.development.ecom.upscale.api;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @PostMapping("/create")
    public String createCustomer() {
        return "Create Customer";
    }

    @PutMapping("/update")
    public String updateCustomer() {
        return "Update Customer";
    } 

    @DeleteMapping("/delete")
    public String deleteCustomer() {
        return "Delete Customer";
    }

    @GetMapping("/all")
    public String finaAll() {
        return "Get All Customers";
    }

    @GetMapping("/by-id")
    public String findById() {
        return "Get Customer by ID";
    }
}
