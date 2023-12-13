package com.iwin.innerclasses;
// 对于具体类或抽象类，内部类可以产生 “多重实现继承” 的效果

class D {}
abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}
public class MultiImplementation {
    static void takeD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takeD(z);
        takesE(z.makeE());
    }
}
