package com.example.design_pattern.creational.factory.multi_method_simple;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Strings;

@Data
@Slf4j
public class SendFactory {

    public Sender produceSms(){
        return new SmsSender();
    }

    public Sender produceEmail(){
        return new EmailSender();
    }

    public Sender produceExpress() {
        return new ExpressSender();
    }
}
