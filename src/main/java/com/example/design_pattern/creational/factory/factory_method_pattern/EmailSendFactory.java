package com.example.design_pattern.creational.factory.factory_method_pattern;

public class EmailSendFactory implements Provider{
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}