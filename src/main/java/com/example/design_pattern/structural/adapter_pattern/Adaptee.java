package com.example.design_pattern.structural.adapter_pattern;

/**
 * @description 需要被适配的接口 Adaptee
 * @author      fuge houyichao.hyc@alibaba-inc.com
 * @version     1.0
 * @date        2021/8/27-10:46 上午
 */
public class Adaptee {

    public void methodA() {
        System.out.println("Adapter methodA invoked");
    }

    public void methodB() {
        System.out.println("Adapter methodB invoked");
    }
}
