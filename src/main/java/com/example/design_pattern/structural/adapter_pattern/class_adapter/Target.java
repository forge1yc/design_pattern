package com.example.design_pattern.structural.adapter_pattern.class_adapter;

/**
 * @description 需要适配的目标接口
 * @author      fuge houyichao.hyc@alibaba-inc.com
 * @version     1.0
 * @date        2021/8/27-10:42 上午
 */
public interface Target {

    /**
     * 目标透出的接口1
     * 也就是我的笔记本只能使用这个接口来充电，不能使用adaptee的method1
     *
     * 这里选择返回一个client需要的字符串更有说服力，也就是client要从target里面得到一些东西才行
     */
    public abstract void targetMethod1();

    /**
     * 目标透出的接口2
     */
    public abstract void targetMethod2();

}
