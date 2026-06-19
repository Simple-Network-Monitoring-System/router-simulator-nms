package com.nms.routersimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RouterSimulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RouterSimulatorApplication.class, args);
    }

}
