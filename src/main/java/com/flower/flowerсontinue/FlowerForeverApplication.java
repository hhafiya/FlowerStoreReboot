package com.flower.flowerсontinue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class FlowerForeverApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlowerForeverApplication.class, args);
    }
}
