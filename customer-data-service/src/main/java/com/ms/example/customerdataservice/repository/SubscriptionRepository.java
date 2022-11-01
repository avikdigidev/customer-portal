package com.ms.example.customerdataservice.repository;


import com.ms.example.customerdataservice.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;


@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, String> {

}
