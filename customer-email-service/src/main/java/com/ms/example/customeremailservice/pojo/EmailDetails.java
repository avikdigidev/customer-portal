package com.ms.example.customeremailservice.pojo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class EmailDetails {
    private String recipient;
    private String msgBody;
    private String subject;
}
