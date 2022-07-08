package com.basic.myenum;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author hyc
 */
public class TestMyStarter {

    public static void main(String[] args) {
        System.out.println(ProtocolType.HTTPS);

        String name = null;
        System.out.println("orElse");
        String name2 = Optional.ofNullable(name).orElse(getDefaultValue());
        System.out.println(name2);

        System.out.println("orElseGet");
        String name3 = Optional.ofNullable(name).orElseGet(TestMyStarter::getDefaultValue);
        System.out.println(name3);




        for (RdValidationDiffTypeEnum typeEnum : RdValidationDiffTypeEnum.values()) {
            System.out.println(typeEnum.name());
        }

        String a = "aa-aaaaaa/absh/asdfasd";
        System.out.println(a.substring(a.indexOf("/")+1, a.lastIndexOf("/")));
    }

    private static String getDefaultValue() {
        return "ttt";
    }

    static void hello() {
        System.out.println("hello world");
    }
}
