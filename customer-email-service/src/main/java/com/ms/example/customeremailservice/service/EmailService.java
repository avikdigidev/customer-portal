package com.ms.example.customeremailservice.service;


import com.example.customerportalmodels.pojo.*;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);

}