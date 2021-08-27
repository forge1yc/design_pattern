package com.example.design_pattern.structural.adapter_pattern;

/**
 * @description 需要适配的目标接口
 * @author      fuge houyichao.hyc@alibaba-inc.com
 * @version     1.0
 * @date        2021/8/27-10:42 上午
 */
public interface Target {

    /**
     * 目标透出的接口1
     */
    public abstract void targetMethod1();

    /**
     * 目标透出的接口2
     */
    public abstract void targetMethod2();

}
