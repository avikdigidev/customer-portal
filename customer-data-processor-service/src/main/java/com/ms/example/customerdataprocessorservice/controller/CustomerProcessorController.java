package com.ms.example.customerdataprocessorservice.controller;

import com.example.customerportalmodels.pojo.dto.response.*;
import com.ms.example.customerdataprocessorservice.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class CustomerProcessorController {
    @Autowired
    private CustomerProcessorService customerProcessorService;

    @GetMapping("/customers/{customerId}")
    public CustomerResponse getCustomer(@PathVariable String customerId) {

        return customerProcessorService.getCustomer(customerId);
    }

    @GetMapping("/customers/")
    public CustomerResponse getCustomers(@RequestParam Integer limit) {

        return customerProcessorService.getFirstNCustomers(limit);
    }
}
