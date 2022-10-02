package com.example.empoloypayrollday4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Empoloypayrollday4Application {

    public static void main(String[] args) {
        log.info("hello empolye");
        SpringApplication.run(Empoloypayrollday4Application.class, args);
    }
}
