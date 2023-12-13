package com.iwin.innerclasses;

// 返回一个指向内部类的引用

public class Parcel2 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
        public static void f() {

        }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }
    public Contents contents() {
        return new Contents();
    }
    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("内部类");
        Parcel2 q = new Parcel2();
        // 定义指向外部类的引用；
        Contents contents = q.contents();
        Destination destination = q.to("内部类");
    }
}
/**
 * 内部类
 */