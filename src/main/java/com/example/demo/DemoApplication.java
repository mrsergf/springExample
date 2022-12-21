package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
              System.out.println("This is my Microservice api log.....");
        return "Hello My dear Family from Java 17 IPN!. It almost Done Api";
        
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
