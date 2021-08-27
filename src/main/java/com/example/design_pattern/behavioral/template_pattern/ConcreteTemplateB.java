package com.example.design_pattern.behavioral.template_pattern;

/**
 * 具体模板 B 类
 */
public class ConcreteTemplateB extends AbstractTemplate {
    @Override
    public void abstractMethod() {
        System.out.println("B 子类中重写的抽象方法");
    }
}