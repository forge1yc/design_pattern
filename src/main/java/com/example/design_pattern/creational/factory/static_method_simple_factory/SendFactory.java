package com.example.design_pattern.creational.factory.static_method_simple_factory;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class SendFactory {

    public static Sender produceSms(){
        return new SmsSender();
    }

    public static Sender produceEmail(){
        return new EmailSender();
    }

    public static Sender produceExpress() {
        return new ExpressSender();
    }
}
