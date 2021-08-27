package com.example.design_pattern.structural.adapter_pattern.instance_adapter;

public class Adapter extends Target{

    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public String targetMethod1() {
        System.out.println("Adapter targetMethod1 inkoked.");
        return adaptee.methodA();
    }

    @Override
    public String targetMethod2() {
        System.out.println("Adapter targetMethod2 inkoked.");
        return adaptee.methodB();
    }
}