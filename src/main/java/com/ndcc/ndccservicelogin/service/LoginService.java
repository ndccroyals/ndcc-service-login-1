package com.ndcc.ndccservicelogin.service;

import com.ndcc.ndccservicelogin.model.UserLogin;

public interface LoginService {
     boolean isUserExists(UserLogin userLogin);
}
