package com.cagin.SpringBootWebAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.cagin.SpringBootWebAPI.*")
@EnableJpaRepositories(basePackages = { "com.cagin.SpringBootWebAPI" })
@EnableAutoConfiguration
@SpringBootApplication
@EnableScheduling
public class APIApplication {

    public static void main(String[] args) {
        SpringApplication.run(APIApplication.class, args);
    }
}
