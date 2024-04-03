package com.common;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * JVM Options
 * -Xms128m -Xmx128m -Xmn64m -XX:MetaspaceSize=64m -XX:MaxMetaspaceSize=64m -XX:MaxDirectMemorySize=64m -XX:SurvivorRatio=10 -XX:+UseConcMarkSweepGC -XX:CMSMaxAbortablePrecleanTime=5000 -XX:+CMSClassUnloadingEnabled -XX:+ScavengeBeforeFullGC -XX:+CMSParallelRemarkEnabled -XX:+CMSScavengeBeforeRemark -XX:CMSInitiatingOccupancyFraction=70 -XX:+UseCMSInitiatingOccupancyOnly -XX:+ExplicitGCInvokesConcurrent -Dsun.rmi.dgc.server.gcInterval=2592000000 -Dsun.rmi.dgc.client.gcInterval=2592000000 -XX:ParallelGCThreads=4 -Xloggc:./gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./java.hprof -verbose:gc
 *
 */
public class GuavaCacheTestApp {

    private Cache<String, String> guavaCache;
    private Map<String, String> fixCache;
    private int valueLength = 2048;
    private int guavaSize = 5000;
    private int fixSize = 4000;


    public static void main(String[] args) {
        GuavaCacheTestApp app = new GuavaCacheTestApp();
        app.init();
        app.benchMark();
    }

    private void init() {
        guavaCache = CacheBuilder
                .newBuilder()
                .maximumSize(guavaSize)
                .expireAfterWrite(1, TimeUnit.SECONDS)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String s) throws Exception {
                        if (StringUtils.isNumeric(s)) {
                            return fixCache.get(s);
                        } else {
                            return getRandomString(valueLength);
                        }
                    }
                });
        fixCache = new HashMap<>(fixSize);
        updateFixCache(fixSize);
    }

    private void updateFixCache(int fixSize) {
        for (int i = 0; i < fixSize; ++i) {
            fixCache.put(String.valueOf(i), getRandomString(valueLength));
        }
    }

    private void benchMark() {
        long i = 0;
        while (true) {
            if (++i % 5 == 0) {
                int index = getRandomInt(fixCache.size());
                guavaCache.getIfPresent(String.valueOf(index));
            } else {
                guavaCache.getIfPresent(getRandomString(10));
            }
            if (i % 10000000 == 0) {
                updateFixCache(fixSize);
            }
            if (i % 1000 == 0) {
                System.out.println(i);
            }
        }
    }

    private String getRandomString(long cnt) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        while (salt.length() < cnt) {
            int index = getRandomInt(SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    private int getRandomInt(int max) {
        Random rnd = new Random();
        return (int) (rnd.nextFloat() * max);
    }
}