package com.example.design_pattern.template_pattern;

public class Main {

    public static void main(String[] args) {
        AbstractTemplate tp = new ConcreteTemplateA();
        // 调用子类 A 的模板方法
        tp.templateMethod();
        tp = new ConcreteTemplateB();
        // 调用子类 B 的模板方法
        tp.templateMethod();
    }
}
