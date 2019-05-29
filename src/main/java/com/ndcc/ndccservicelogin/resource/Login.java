package com.ndcc.ndccservicelogin.resource;


import com.ndcc.ndccservicelogin.model.User;
import com.ndcc.ndccservicelogin.service.LoginService;
import com.ndcc.ndccservicelogin.util.NdccUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ndcc/login/v1")
public class Login {

    private static final Logger logger = LoggerFactory.getLogger(Login.class);

    @Autowired
    User user;

    @Autowired
    LoginService loginService;

    /**
     * @param userName
     * @param password
     * @param email
     * @return boolean
     */

    @GetMapping(value = "/verify", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> validateUserLogin(@RequestHeader(value = "username", required = true) String userName,
                                            @RequestHeader(value = "password", required = true) String password,
                                            @RequestHeader(value = "email", required = true) String email) {

        logger.info("START:Verify login");
        logger.debug("Verify user details user:{} and email  :{}", userName, email);

        user.setUserId(userName);
        user.setPassword(password);
        user.setEmail(email);
        return ResponseEntity.ok(loginService.isUserExists(user));
    }

    @PostMapping(name = "/postLogin", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> postLogin(@RequestBody User user) {

        if (!NdccUtil.validate(user)) {
            return ResponseEntity.ok(false);
        }
        return  ResponseEntity.ok(loginService.isUserExists(user));
    }
}
