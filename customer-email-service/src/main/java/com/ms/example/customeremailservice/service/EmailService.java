package com.ms.example.customeremailservice.service;


import com.ms.example.customer.portal.models.*;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);

}