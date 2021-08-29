package com.example.design_pattern.behavioral.template_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AbstractTemplate tp = new ConcreteTemplateA();
        // 调用子类 A 的模板方法
        tp.templateMethod();
        tp = new ConcreteTemplateB();
        // 调用子类 B 的模板方法
        tp.templateMethod();
        hello("asdf1","asdf2");
    }

    private static void hello(String... args) {
        System.out.println(args.length);
        System.out.println(args.getClass().getName());

        // 可见都是数组
        String[] s = new String[]{"1","2","3","4"};
        System.out.println(s.getClass().getName());

        System.out.println(args[0]);
        System.out.println(args[1]);

        // runtimeException 也是可以捕获的，这里就是一个练习，平常防止程序崩溃，可以试着添加try catch
        try {
            System.out.println(args[2]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
