package com.example.springbootcachejdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCacheJdkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCacheJdkApplication.class, args);
    }

}
