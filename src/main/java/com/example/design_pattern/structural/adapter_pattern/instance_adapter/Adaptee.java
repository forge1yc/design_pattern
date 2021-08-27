package com.example.design_pattern.structural.adapter_pattern.instance_adapter;

public class Adaptee {

    public String methodA() {
        System.out.println("Adaptee methodA invoked.");
        return "get Adaptee Value A";
    }

    public String methodB() {
        System.out.println("Adaptee methodB invoked.");
        return "get Adaptee Value B";
    }

}
