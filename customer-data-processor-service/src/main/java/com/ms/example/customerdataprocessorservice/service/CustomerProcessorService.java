package com.ms.example.customerdataprocessorservice.service;

import com.ms.example.customer.portal.models.dto.request.*;
import com.ms.example.customer.portal.models.dto.response.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public interface CustomerProcessorService {
    CustomerResponse getCustomer(String customerId);

    List<CustomerResponse> getFirstNCustomers(Integer limit);

    CustomerCreateResponse createCustomer(CustomerCreateRequest customerCreateRequest);
}
