package com.example.design_pattern.behavioral.template_pattern;

/**
 * 具体模板 A 类
 */
public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    public void abstractMethod() {
        System.out.println("A 子类中重写的抽象方法");
    }

    @Override
    protected void hookMethod() {
        System.out.println("A 类实现了钩子方法");
    }
}