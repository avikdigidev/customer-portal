package com.ms.example.customerdataservice.model;

import lombok.*;

import javax.persistence.*;
import java.time.*;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @OneToMany(mappedBy = "address")
    private List<Address> addresses;
    @OneToMany(mappedBy = "subscription")
    private List<Subscription> subscriptions;


}
