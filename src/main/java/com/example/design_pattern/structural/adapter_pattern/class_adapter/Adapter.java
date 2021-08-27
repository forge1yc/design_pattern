package com.example.design_pattern.structural.adapter_pattern.class_adapter;

/**
 * @description 目前这是继承的适配，还有一种组合的适配
 * @author      fuge houyichao.hyc@alibaba-inc.com
 * @version     1.0
 * @date        2021/8/27-10:54 上午
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void targetMethod1() {
        System.out.println("Adapter targetMethod1 inkoked");
        // 调用被适配的接口方法
        methodA();
    }

    @Override
    public void targetMethod2() {
        System.out.println("Adapter targetMethod2 inkoked");
        // 调用被适配的接口方法
        methodB();
    }
}
