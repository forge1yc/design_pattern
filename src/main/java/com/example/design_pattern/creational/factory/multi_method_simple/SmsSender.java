package com.example.design_pattern.creational.factory.multi_method_simple;

/**
 * @description 真实的消息接口实现
 * @author      fuge houyichaochao@gmail.com
 * @version     1.0
 * @date        2021/8/28-3:17 下午
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送短信");
    }
}