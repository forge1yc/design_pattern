package com.example.design_pattern.structural.adapter_pattern.instance_adapter;

public class Main {

    public static void main(String[] args) {

        Target target = new Adapter();

        // 有返回值的适配器更适合解释这个概念，可以想象返回的是笔记本的电源电力，只有这个接口能够给我电力,method不行
        String electricA = target.targetMethod1();
        String electricB = target.targetMethod1();

        System.out.printf("get electric from Target %s,%s\n",electricA,electricB);

    }
}
