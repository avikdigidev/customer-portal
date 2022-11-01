package com.ms.example.customer.portal.models.rulesModel;

import com.ms.example.customer.portal.models.enums.*;

import lombok.*;

import java.time.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDT {

    private String customerId;
    private String firstName;
    private LocalDate creationDate;
    private CustomerStatus customerStatus;
    private CustomerCategory customerCategory;
}
