package com.basic.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author hyc
 */
public class TestLocalTime {

    public static void main(String[] args) {
        //获取当前时区的日期
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);
        //时间
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: " + localTime);
        //根据上面两个对象，获取日期时间
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println("localDateTime: " + localDateTime);
        //使用静态方法生成此对象
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println("localDateTime2: " + localDateTime2);
        //格式化时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        System.out.println("格式化之后的时间: " + localDateTime2.format(formatter));

        //转化为时间戳(秒)
        long epochSecond = localDateTime2.toEpochSecond(ZoneOffset.of("+8"));
//        long utcEpochSecond = localDateTime2.toEpochSecond(ZoneOffset.UTC);
//        long originEpochSecond2 = localDateTime2.toEpochSecond(ZoneOffset.of("+9"));
        //转化为毫秒
        long epochMilli = localDateTime2.atZone(ZoneOffset.systemDefault()).toInstant().toEpochMilli();
        System.out.println("时间戳为:(秒) " + epochSecond + "; (毫秒): " + epochMilli);
//        System.out.println("UTC时间戳为:(秒) " + utcEpochSecond + ";");
//        System.out.println("UTC时间戳为:(秒) " + originEpochSecond2 + ";");

        //时间戳(毫秒)转化成LocalDateTime
        Instant instant = Instant.ofEpochMilli(epochMilli);
//        Instant instantUTC = Instant.ofEpochSecond(utcEpochSecond);
        LocalDateTime localDateTime3 = LocalDateTime.ofInstant(instant, ZoneOffset.systemDefault());
//        LocalDateTime localDateTime5 = LocalDateTime.ofInstant(instantUTC, ZoneOffset.systemDefault());
        System.out.println("时间戳(毫秒)转化成LocalDateTime: " + localDateTime3.format(formatter));
//        System.out.println("UTC时间戳(毫秒)转化成LocalDateTime: " + localDateTime5.format(formatter));
        //时间戳(秒)转化成LocalDateTime
        Instant instant2 = Instant.ofEpochSecond(epochSecond);
        LocalDateTime localDateTime4 = LocalDateTime.ofInstant(instant2, ZoneOffset.systemDefault());
        System.out.println("时间戳(秒)转化成LocalDateTime: " + localDateTime4.format(formatter));
    }
}