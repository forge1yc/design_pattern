package com.example.design_pattern;

import com.common.Person;
import com.common.PersonAbcImpl;
import com.common.Poo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan("com")
public class DesignPatternApplication {

    @Resource
    Poo poo;

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
    }

}
