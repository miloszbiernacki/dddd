package com.biernacki.myspringexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringExampleApplication {


    // this method runs spring container
    public static void main(String[] args) {
        SpringApplication.run(MySpringExampleApplication.class, args);
    }

}
