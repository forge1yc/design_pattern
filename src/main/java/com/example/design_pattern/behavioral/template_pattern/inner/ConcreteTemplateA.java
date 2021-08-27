package com.example.design_pattern.behavioral.template_pattern.inner;

import com.example.design_pattern.behavioral.template_pattern.AbstractTemplate;

/**
 * 具体模板 A 类
 */
class ConcreteTemplateA extends AbstractTemplate {
    @Override
    public void abstractMethod() {
        System.out.println("A 子类中重写的抽象方法");
    }
}