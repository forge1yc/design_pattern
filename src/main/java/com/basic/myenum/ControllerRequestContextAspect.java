package com.basic.myenum;

import org.assertj.core.util.Maps;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * contorller层切面类， 负责生成requestId
 */

public class ControllerRequestContextAspect {

    /**
     * 通过方法名 获取对应属性的值
     */
    public static Object getFieldValue(Object object, String methodName) {
        try {
            Method method = object.getClass().getMethod(methodName, null);
            return method.invoke(object);
        } catch (NoSuchMethodException | SecurityException | InvocationTargetException | IllegalAccessException e) {
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        String cc = "hello world";
        getFieldValue(cc, "length");

        System.out.println(4 > 3 | 3 > 2);

        int a = 4;
        int b = 2;
        a |= b;
        System.out.println("a: "+a);
//        System.out.println(NoSuchMethodException | SecurityException | InvocationTargetException | IllegalAccessException);

        // 生成的代理类的权限
//        int accessFlags = Modifier.PUBLIC | Modifier.FINAL;
//        // 生成的代理类类名
//        String className = "HelloProxy2";
//        // 被代理类的接口
//        Class[] proxyInterfaces = {Hello.class};
//        // go!
//        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(className, proxyInterfaces, accessFlags);
//        // 写到文件方便反编译阅读
////        new FileOutputStream(new File("src/main/java/com/basic/myenum/HelloProxy.class")).write(proxyClassFile);
//        new FileOutputStream(new File("src/out/HelloProxy.class")).write(proxyClassFile);

        Map<String, String> m = new HashMap<>();
        m.put("a","b");
        System.out.println(m.get("c"));
        System.out.println(m.get(null));

    }
}