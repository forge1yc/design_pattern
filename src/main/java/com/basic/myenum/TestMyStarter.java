package com.basic.myenum;

import org.assertj.core.util.Lists;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hyc
 */
public class TestMyStarter {

    private static final String RD_INNER_SERVICE_ENDPOINT = "asdfasdf";

    public static void main(String[] args) throws ParseException {
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

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String tttt = "2019-01-17T07:57:08.737Z";
        Date date = format.parse(tttt);
        System.out.println(date);
        String rdInnerApiRegionId = "aaaaaa";
        String result = String.format(RD_INNER_SERVICE_ENDPOINT, rdInnerApiRegionId);
        System.out.println(result);

        System.out.println(String.format("调用者账号：%d，Master账号：%d", 111111111111111111L, 222L));
        System.out.println(String.format("当前修正标识符为：%s", true));

        System.out.println(Objects.equals(null , null));


        List<Integer> a2 = Lists.newArrayList(1,2,3);

        a2 = a2.stream().filter(it -> !Objects.equals(1, it) && !Objects.equals(2, it)).collect(Collectors.toList());

        System.out.println(a2);
    }

    private static String getDefaultValue() {
        return "ttt";
    }

    static void hello() {
        System.out.println("hello world");
    }
}
