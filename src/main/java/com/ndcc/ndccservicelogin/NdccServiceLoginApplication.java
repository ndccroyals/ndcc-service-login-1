package com.ndcc.ndccservicelogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.ndcc.ndccservicelogin.*")
public class NdccServiceLoginApplication {

    public static void main(String[] args) {

        SpringApplication.run(NdccServiceLoginApplication.class, args);
    }

}
