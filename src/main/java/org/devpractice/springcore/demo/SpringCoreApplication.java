package org.devpractice.springcore.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCoreApplication.class, args);
    }

}
