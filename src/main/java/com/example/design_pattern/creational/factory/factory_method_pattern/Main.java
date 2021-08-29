package com.example.design_pattern.creational.factory.factory_method_pattern;

public class Main {

    public static void main(String[] args) {
        Provider providerSms = new SmsSendFactory();
        Sender senderSms = providerSms.produce();
        senderSms.Send(); // 发送短信

        Provider providerEmail = new EmailSendFactory();
        Sender senderEmail = providerEmail.produce();
        senderEmail.Send(); // 发送邮件

        Provider providerExpress = new ExpressSendFactory();
        Sender senderExpress = providerExpress.produce();
        senderExpress.Send(); // 发送快递
    }
}