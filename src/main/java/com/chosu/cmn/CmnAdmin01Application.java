package com.chosu.cmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CmnAdmin01Application {

    public static void main(String[] args) {
        SpringApplication.run(CmnAdmin01Application.class, args);
    }

}
