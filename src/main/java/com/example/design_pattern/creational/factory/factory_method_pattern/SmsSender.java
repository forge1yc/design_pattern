package com.example.design_pattern.creational.factory.factory_method_pattern;

public class SmsSender implements Sender{
    @Override
    public void Send() {
        System.out.println("发送短信");
    }
}