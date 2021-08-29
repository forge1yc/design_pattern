package com.example.design_pattern.creational.factory.multi_method_simple;

/**
 * @description 实现类
 * @author      fuge houyichaochao@gmail.com
 * @version     1.0
 * @date        2021/8/28-3:15 下午
 */
public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}