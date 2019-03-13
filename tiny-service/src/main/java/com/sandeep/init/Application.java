package com.sandeep.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sandeep.*")
public class Application{

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
