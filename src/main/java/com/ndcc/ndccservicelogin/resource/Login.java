package com.ndcc.ndccservicelogin.resource;



import com.ndcc.ndccservicelogin.model.UserLogin;
import com.ndcc.ndccservicelogin.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ndcc/login/v1")
public class Login {

    private static final Logger logger = LoggerFactory.getLogger(Login.class);

    @Autowired
    UserLogin user;

    @Autowired
    LoginService loginService;

    /**
     *
     * @param userName
     * @return
     */

    @GetMapping(value = "/verify" , produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean validateUserLogin(@RequestHeader(value = "username",required =true )String userName,
                                     @RequestHeader(value = "password",required =true )String password,
                                     @RequestHeader(value = "email",required =true )String email){

        logger.info("START:Verify login");
        logger.debug("Verify user details user:{} and email  :{}",userName,email);

        user.setUserId(userName);
        user.setPassword(password);
        user.setEmail(email);

        return loginService.isUserExists(user);
    }

   /* @PostMapping(name = "/postLogin" , produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean postLogin(@RequestBody User user){

        return false;
    }*/
}
