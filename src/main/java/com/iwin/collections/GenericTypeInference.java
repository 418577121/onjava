package com.iwin.collections;
// 从jdk11开始

import java.util.ArrayList;

public class GenericTypeInference {
    void old() {
        ArrayList<Apple> apples = new ArrayList<>();
    }
    void modern() {
        var apples = new ArrayList<Apple>();
    }
    void pitFall() {
        var apples = new ArrayList<>();
        apples.add(new Apple());
        apples.get(0);// 作为普通的Object类型返回
    }
}
