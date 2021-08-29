package com.example.design_pattern.creational.abstract_factory.basic;

public class TCLRefrigerator implements Refrigerator {
    @Override
    public void dosomething() {
        System.out.println("我是TCL冰箱，我可以洗衣服");
    }
}