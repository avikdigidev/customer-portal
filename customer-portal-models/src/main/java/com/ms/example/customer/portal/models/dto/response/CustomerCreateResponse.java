package com.ms.example.customer.portal.models.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
public class CustomerCreateResponse {

    @JsonProperty("customerId")
    private String customerId;

}