package com.ms.example.customer.portal.models;

import lombok.*;

import java.math.*;
import java.time.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subscription {

    private String subscriptionId;
    private String customerId;
    private LocalDate subscriptionOnDate;
    private LocalDate subscriptionOffDate;
    private BigDecimal balancePending;
}
