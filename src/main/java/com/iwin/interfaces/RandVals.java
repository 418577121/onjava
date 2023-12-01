package com.iwin.interfaces;

import java.util.Random;

// 用非常量初始化表达式来初始化接口
public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    // float RANDOM_FLOAT
}
