package com.example.bug;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.example.bug.dao")
@EnableSwagger2
public class BugApplication {

    public static void main(String[] args) {
        SpringApplication.run(BugApplication.class, args);
    }

}
