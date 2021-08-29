package com.example.design_pattern.creational.factory.multi_method_simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        SendFactory sendFactory = new SendFactory();
        Sender senderEmail = sendFactory.produceEmail();
        senderEmail.send(); // 发送邮件

        Sender senderSms = sendFactory.produceSms();
        senderSms.send(); // 发送短信

        Sender senderExpress = sendFactory.produceExpress();
        senderExpress.send(); // 发送快递

    }
}
