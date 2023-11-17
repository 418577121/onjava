package com.iwin.interfaces;

abstract class Basic3 {
    int f() {
        return 111;
    }
}
public class AbstractWithoutAbstracts {
    public static void main(String[] args) {
        // Basic3 basic3 = new Basic3();
        // 错误，不能实例化
    }
}
