package com.example.design_pattern.creational.factory.static_method_simple_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        Sender senderEmail = SendFactory.produceEmail();
        senderEmail.send(); // 发送邮件

        Sender senderSms = SendFactory.produceSms();
        senderSms.send(); // 发送短信

        Sender senderExpress = SendFactory.produceExpress();
        senderExpress.send(); // 发送快递

    }
}
