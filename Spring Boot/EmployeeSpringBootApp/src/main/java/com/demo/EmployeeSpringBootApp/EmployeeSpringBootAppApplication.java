package com.demo.EmployeeSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.controller",
        "com.businessService"
})
@EnableJpaRepositories(basePackages = "com.repository")
@EntityScan(basePackages = "com.bean")
public class EmployeeSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeSpringBootAppApplication.class, args);
    }

}