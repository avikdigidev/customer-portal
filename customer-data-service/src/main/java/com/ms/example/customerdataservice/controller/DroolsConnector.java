package com.ms.example.customerdataservice.controller;

import com.ms.example.customer.portal.models.dto.request.*;
import com.ms.example.customer.portal.models.dto.response.*;
import org.kie.api.runtime.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Component
public class DroolsConnector {
    @Autowired
    private KieSession session;

    public CustomerResponse orderNow(CustomerRequest customerRequest) {

        session.insert(customerRequest);
        session.fireAllRules();
        //TODO
        return new CustomerResponse();
    }
}
