package com.ndcc.ndccservicelogin.service.impl;


import com.ndcc.ndccservicelogin.model.UserLogin;
import com.ndcc.ndccservicelogin.repository.LoginRepo;
import com.ndcc.ndccservicelogin.resource.Login;
import com.ndcc.ndccservicelogin.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private static final Logger log = LoggerFactory.getLogger(Login.class);

    @Autowired
    LoginRepo loginRepo;


    /**
     *
     * @param user
     * @return
     */
    @Override
    public boolean isUserExists(UserLogin user) {

        log.debug("Verify if user exists");

        UserLogin userLogin= loginRepo.findByUserIdAndPasswordAndEmail(user.getUserId(),user.getPassword(),user.getEmail());

        log.debug("User details retrieved from DB - user id :{}, email:{}",userLogin.getUserId(),userLogin.getEmail());

        if(userLogin!=null){
            log.info("User :{} login successful ",userLogin.getUserId());
            return true;
        }
        log.info("User :{} login failed",user.getUserId());
        return false;
    }
}
