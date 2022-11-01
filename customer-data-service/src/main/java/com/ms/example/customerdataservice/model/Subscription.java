package com.ms.example.customerdataservice.model;

import lombok.*;

import javax.persistence.*;
import java.math.*;
import java.time.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @Column(name = "subscription_id")
    private String subscriptionId;
    @Column(name = "subscription_on_date")
    private LocalDate subscriptionOnDate;
    @Column(name = "subscription_off_date")
    private LocalDate subscriptionOffDate;
    @Column(name = "balance_pending")
    private BigDecimal balancePending;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
