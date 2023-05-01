package com.containerizing.springbootcontainerizing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.containerizing"})
public class SpringBootContainerizingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootContainerizingApplication.class, args);
    }

}
