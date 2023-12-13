package com.iwin.innerclasses;

// 访问外部类对象
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // 如果直接写 "this",引用的会是Inner的 'this'
        }
    }
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        Inner dt1 = dt.inner();
        dt1.outer().f();
    }
}
/**
 * DotThis.f()
 */