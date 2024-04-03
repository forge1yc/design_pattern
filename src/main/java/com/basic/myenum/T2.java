package com.basic.myenum;

import com.google.common.base.Splitter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@Slf4j
public class T2 {

    private static final int PARAMS_COUNT = 1;

    public static void main(String[] args) {

        try {
            throw new NullPointerException("asdf");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        System.out.println(new Date());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        String param = "abcd";
        List<String> params = Splitter.on("#").splitToList(param);
        if (params.size() != PARAMS_COUNT) {
            return;
        }
        // single#correct#1106234177010393#3#all
        String action = params.get(0);

        log.info(action);

        AtomicLong a = new AtomicLong();
        a.incrementAndGet();
        System.out.println(new StringBuffer().append(a).append(a).append(a).toString());

        System.out.println(String.format("%.02f%%", 99.3));


    }
}

