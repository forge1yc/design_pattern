package com.common;

import org.springframework.stereotype.Component;

public class PersonAbcImpl implements Person{

    private static final String helloworld = "hssss";

    public String hello() {
        System.out.println("hello world");
        return null;
    }
}
