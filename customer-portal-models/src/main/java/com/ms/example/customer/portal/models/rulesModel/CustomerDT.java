package com.ms.example.customer.portal.models.rulesModel;

import com.fasterxml.jackson.annotation.*;
import com.ms.example.customer.portal.models.enums.*;

import lombok.*;

import java.io.*;
import java.time.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDT implements Serializable {
    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("creationDate")
    @JsonFormat(pattern="MM-dd-yyyy")
    private LocalDate creationDate;
    @JsonProperty("customerStatus")
    private CustomerStatus customerStatus;
    @JsonProperty("customerCategory")
    private CustomerCategory customerCategory;
}
