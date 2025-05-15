package com.sample.containerscourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContainersCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContainersCourseApplication.class, args);
    }

    private boolean find(String s, Boolean completeMatch) {
        if (completeMatch) {
            return text.equals(s);
        }
        return text.contains(s);
    }

}
