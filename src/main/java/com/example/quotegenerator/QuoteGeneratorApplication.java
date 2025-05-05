package com.example.quotegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class QuoteGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuoteGeneratorApplication.class, args);
    }
}
