package com.ms.example.customerdataprocessorservice.service;

import com.ms.example.customerportalmodels.pojo.dto.response.*;
import org.springframework.stereotype.*;

@Service
public interface CustomerProcessorService {
    CustomerResponse getCustomer(String customerId);

    CustomerResponse getFirstNCustomers(Integer limit);
}
