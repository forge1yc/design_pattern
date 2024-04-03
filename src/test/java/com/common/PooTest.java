package com.common;

import com.example.design_pattern.DesignPatternApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest(classes = DesignPatternApplication.class)
class PooTest {

    @Resource
    Poo poo;

    @Test
    void foo() {
        poo.foo();
    }

}