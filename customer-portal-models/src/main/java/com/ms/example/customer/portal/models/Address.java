package com.ms.example.customer.portal.models;

import lombok.*;

import java.time.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String addressId;
    private String customerId;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postalCode;
    private LocalDate lastUpdateDate;
}
