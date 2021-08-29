package com.example.design_pattern.creational.factory.multi_method_simple;

/**
 * @description 实现方法
 * @author      fuge houyichaochao@gmail.com
 * @version     1.0
 * @date        2021/8/28-3:17 下午
 */
public class ExpressSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送快递");
    }
}