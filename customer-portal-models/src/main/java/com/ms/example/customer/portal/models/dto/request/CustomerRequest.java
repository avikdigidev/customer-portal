package com.ms.example.customer.portal.models.dto.request;

import com.fasterxml.jackson.annotation.*;
import com.ms.example.customer.portal.models.dto.response.*;
import com.ms.example.customer.portal.models.enums.*;

import java.time.*;
import java.util.*;

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

    @JsonProperty("customerStatus")
    private CustomerStatus customerStatus;

    @JsonProperty("customerCategory")
    private CustomerCategory customerCategory;

    @JsonProperty("addressDetails")
    private List<AddressDetailsResponse> addressDetails;

    @JsonProperty("creationDate")
    private LocalDate creationDate;

}
