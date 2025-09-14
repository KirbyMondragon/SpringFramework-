package org.devpractice.springcore;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

@SpringBootApplication
public class SpringCoreApplication {

    //private static final Logger log = LoggerFactory.getLogger(SpringCoreApplication);

    public static void main(String[] args) {

        SpringApplication.run(SpringCoreApplication.class, args);
    }

}
