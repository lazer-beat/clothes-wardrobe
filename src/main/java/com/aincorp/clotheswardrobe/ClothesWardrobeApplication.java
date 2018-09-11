package com.aincorp.clotheswardrobe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class ClothesWardrobeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClothesWardrobeApplication.class, args);
    }
}
