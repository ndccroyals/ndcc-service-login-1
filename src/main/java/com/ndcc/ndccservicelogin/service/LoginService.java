package com.ndcc.ndccservicelogin.service;

import com.ndcc.ndccservicelogin.model.User;

public interface LoginService {
    boolean isUserExists(User user);
}
