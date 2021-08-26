package com.example.design_pattern.template_pattern;

/**
 * 抽象模板
 */
public abstract class AbstractTemplate {
    // 模板方法
    public void templateMethod() {
        //（所有）基本方法
        abstractMethod();
        hookMethod();
        // 这个方法是怎么调用的啊，我还真是有疑问，这不对劲
        concreteMethod();
    }
    // 抽象方法，必须有子类实现
    public abstract void abstractMethod();
    // 钩子方法，子类可以选择重写或不重写
    protected void hookMethod() {
        System.out.println("原生自带的钩子方法");

    }
    // 具体方法，子类不可修改，子类也不可以调用，private只有当前类能够使用，在当前类调用就可以
//    private final void concreteMethod() {
//        System.out.println("抽象类中的具体方法");
//    }

    public final void concreteMethod() {
        System.out.println("抽象类中的具体方法");
    }

}