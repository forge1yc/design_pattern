package com.example.design_pattern.template_pattern.inner;

import com.example.design_pattern.template_pattern.AbstractTemplate;

public class Main {

    public static void main(String[] args) {
        AbstractTemplate tp = new ConcreteTemplateA();
        // 调用子类 A 的模板方法,今天我才对java的可见性有了一个新的认识，我是怎么进的ali
        tp.templateMethod();
        tp.concreteMethod(); // 所以具体的方法本来就不应透露出来
    }
}
