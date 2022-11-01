package com.ms.example.customer.portal.models.dto.request;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Getter
@Setter
public class CustomerCreateRequest {
    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phoneNumber")
    private Long phoneNumber;
}
