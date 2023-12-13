package com.iwin.innerclasses.mui;
// 一个类可以以两种方式实现多个接口


interface A {}
interface B {}

class X implements A, B {}

class Y implements A {
    B makeB() {
        // 匿名内部类
        return new B() {
        };
    }
}
public class MultiInterface {
    static void takesA(A a) {}
    static void takesB(B b) {}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);

        takesB(x);
        takesB(y.makeB());
    }
}
