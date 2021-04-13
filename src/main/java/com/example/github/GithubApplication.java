package com.example.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubApplication {

    public static void main(String[] args) {
        Integer x = 0, y = 3;
        Integer xy = x+y;
        SpringApplication.run(GithubApplication.class, args);
        x = 3;
        y = 0;
    }

}
