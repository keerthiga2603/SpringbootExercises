package com.example.idempotent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IdempotentEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdempotentEventApplication.class, args);
    }
}