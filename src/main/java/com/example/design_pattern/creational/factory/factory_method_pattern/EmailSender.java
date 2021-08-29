package com.example.design_pattern.creational.factory.factory_method_pattern;

public class EmailSender implements Sender{
    @Override
    public void Send() {
        System.out.println("发送邮件");
    }
}