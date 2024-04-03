package com.common;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Poo {

    @Resource
    PersonAbcImpl personAbc;

    public void foo() {
        personAbc.hello();
    }
}
