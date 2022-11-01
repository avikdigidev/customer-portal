package com.ms.example.customerdataprocessorservice.controller;

import com.ms.example.customer.portal.models.dto.request.*;
import com.ms.example.customer.portal.models.dto.response.*;
import com.ms.example.customerdataprocessorservice.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController

public class CustomerProcessorController {
    @Autowired
    private CustomerProcessorService customerProcessorService;

    @GetMapping("/v1/customers/{customerId}")
    public CustomerResponse getCustomer(@PathVariable String customerId) {

        return customerProcessorService.getCustomer(customerId);
    }

    @GetMapping("/v1/customers/")
    public List<CustomerResponse> getCustomers(@RequestParam Integer limit) {

        return customerProcessorService.getFirstNCustomers(limit);
    }

    @PostMapping("/customers/")
    public CustomerCreateResponse createCustomer(@RequestBody CustomerCreateRequest customerCreateRequest) {

        return customerProcessorService.createCustomer(customerCreateRequest);
    }
}
