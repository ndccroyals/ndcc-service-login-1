package com.ndcc.ndccservicelogin.entity;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;


@Data
@Entity
@Table(name = "USER_LOGIN")
public class UserLogin {

    @Id
    @Column(name = "USER_ID")
    private String userId;
    private String password;
    @Column(name = "EMAIL_ID")
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", eMail='" + email + '\'' +
                '}';
    }
}
