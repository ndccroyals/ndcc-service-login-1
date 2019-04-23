package com.ndcc.ndccservicelogin.model;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Component
@Entity
@Table(name="USER_LOGIN")
public class UserLogin {

    @Id
    @Column(name = "USER_ID")
    private String userId;
    private String password;
    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", eMail='" + email + '\'' +
                '}';
    }
}
