package com.ndcc.ndccservicelogin.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {
    private String userId;
    private String password;
    private String email;
}