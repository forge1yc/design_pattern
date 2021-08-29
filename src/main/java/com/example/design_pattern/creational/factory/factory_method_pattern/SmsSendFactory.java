package com.example.design_pattern.creational.factory.factory_method_pattern;

public class SmsSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}