package com.iwin.innerclasses;
// 被嵌套的类可以访问外部类中所有成成员

import com.iwin.Main;

class NAN {
    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        NAN nan = new NAN();
        NAN.A a = nan.new A();
    }
}
