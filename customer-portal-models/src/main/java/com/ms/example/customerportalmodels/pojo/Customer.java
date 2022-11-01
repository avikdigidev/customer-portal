package com.ms.example.customerportalmodels.pojo;

import lombok.*;

import java.time.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String customerId;
    private String firstName;
    private String lastName;
    private String emailId;
    private Long phoneNumber;
    private LocalDate creationDate;
}
