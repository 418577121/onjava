package com.iwin.innerclasses;

// 为匿名内部类创建一个构造器
abstract class Base {
    Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println(
                        "Inside instance initialize"
                );
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
/**
 * Base constructor, i = 47
 * Inside instance initialize
 * In anonymous f()
 */