package com.iwin.interfaces;

interface Old {
    default void fd() {
        System.out.println("Old::fd()");
    }
    static void fs() {
        System.out.println("Old::fs()");
    }
    default void f() {
        fd();
    }
    static void g() {
        fs();
    }
}


class ImplOld implements Old {}

interface JDK9 {
    private void fd() { // 自动是default的
        System.out.println("JDK9：:fd()");
    }
    private static void fs() {
        System.out.println("JDK9::fs()");
    }
    default void f() {
        fd();
    }
    static void g() {
        fs();
    }
}

class ImplJDK9 implements JDK9 {

}
public class PrivateInterfaceMethods {
    public static void main(String[] args) {
        new ImplOld().f();
        Old.g();
        new ImplJDK9().f();
        JDK9.g();
    }
}
/**
 * Old::fd()
 * Old::fs()
 * JDK9：:fd()
 * JDK9::fs()
 */