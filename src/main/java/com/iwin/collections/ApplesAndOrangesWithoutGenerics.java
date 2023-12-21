package com.iwin.collections;
// 简单集合类的使用

import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange {}


public class ApplesAndOrangesWithoutGenerics {

    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // 向apples中加入一个Orange也不会出问题
        apples.add(new Orange());
        for (Object apple : apples) {
            ((Apple) apple).id();
        }
    }
}

/**
 * Exception in thread "main" java.lang.ClassCastException:
 * class com.iwin.collections.Orange cannot be cast to class com.iwin.collections.Apple (com.iwin.collections.Orange and com.iwin.collections.Apple are in unnamed module of loader 'app')
 * 	at com.iwin.collections.ApplesAndOrangesWithoutGenerics.main(ApplesAndOrangesWithoutGenerics.java:27)
 */