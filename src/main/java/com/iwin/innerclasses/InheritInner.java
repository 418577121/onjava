package com.iwin.innerclasses;

class WithInner {
    class Inner {}
}
public class InheritInner extends WithInner.Inner {
    //. InheritInner() {}

    InheritInner(WithInner wi) {
        wi.super(); // 必须
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner inheritInner = new InheritInner(wi);
    }
}
