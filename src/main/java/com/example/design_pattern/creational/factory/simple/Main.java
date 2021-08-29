package com.example.design_pattern.creational.factory.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        SendFactory sendFactory = new SendFactory();
        sendFactory.produce("sms").send();
        sendFactory.produce("email").send();
        sendFactory.produce("express").send();
        try {
            sendFactory.produce("random");
        } catch(NullPointerException e) {
            log.info(e.getMessage());
            e.printStackTrace();
        }
    }
}
