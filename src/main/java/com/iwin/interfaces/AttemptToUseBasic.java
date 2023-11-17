package com.iwin.interfaces;

abstract class Basic {
    abstract void unimplemented();
}
public class AttemptToUseBasic {
    public static void main(String[] args) {
        // 不能实例化
        // Basic basic = new Basic();
    }
}
