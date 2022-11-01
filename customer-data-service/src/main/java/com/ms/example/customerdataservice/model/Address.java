package com.ms.example.customerdataservice.model;

import lombok.*;

import javax.persistence.*;
import java.time.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
    private String addressId;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "last_update_date")
    private LocalDate lastUpdateDate;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
