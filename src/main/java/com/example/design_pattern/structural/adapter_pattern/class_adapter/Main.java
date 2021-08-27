package com.example.design_pattern.structural.adapter_pattern.class_adapter;

/**
 * @description client
 * @author      fuge houyichao.hyc@alibaba-inc.com
 * @version     1.0
 * @date        2021/8/27-10:52 上午
 */
public class Main {

    public static void main(String[] args) {

        // 通过Adapter继承Adaptee实现了Adaptee角色的调用
        // 这里只要接口保持一致就可以，面向接口编程
        Target target = new Adapter();
        target.targetMethod1();
        target.targetMethod2();
    }
}
