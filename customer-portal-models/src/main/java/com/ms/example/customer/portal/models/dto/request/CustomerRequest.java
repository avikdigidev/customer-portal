package com.ms.example.customer.portal.models.dto.request;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.time.*;
@Getter
@Setter
public class CustomerRequest {

    @JsonProperty("customerId")
    private String customerId;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phoneNumber")
    private Long phoneNumber;

    @JsonProperty("creationDate")
    private LocalDate creationDate;

}
