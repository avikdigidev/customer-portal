package com.ms.example.customerdataservice.service;

import com.ms.example.customer.portal.models.dto.response.*;
import com.ms.example.customer.portal.models.rulesModel.*;
import org.kie.api.runtime.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class DroolsConnectorService {
//TODO: Refactor class properly
    @Autowired
    private KieSession session;
@PostMapping("/customers")
    public CustomerDT orderNow(@RequestBody CustomerDT customerDT) {
        session.insert(customerDT);
        session.fireAllRules();
        return customerDT;
    }
}
