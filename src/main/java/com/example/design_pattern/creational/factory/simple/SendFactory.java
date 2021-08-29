package com.example.design_pattern.creational.factory.simple;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Strings;

@Data
@Slf4j
public class SendFactory {

    public Sender produce(String type) throws NullPointerException {
        if (Strings.isNullOrEmpty(type)) {
            return null;
        } else if ("email".equalsIgnoreCase(type)) {
            return new EmailSender();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SmsSender();
        } else if ("express".equalsIgnoreCase(type)) {
            return new ExpressSender();
        } else {
            log.info("not right sender for type {}",type);
            throw new NullPointerException("null");
//            return null;
        }
    }
}
