package com.ms.example.customeremailservice.service;

import com.ms.example.customeremailservice.pojo.*;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);

}