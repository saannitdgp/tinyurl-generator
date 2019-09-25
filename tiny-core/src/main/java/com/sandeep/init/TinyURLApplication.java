package com.sandeep.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sandeep.*")
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class TinyURLApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinyURLApplication.class);
    }
}
