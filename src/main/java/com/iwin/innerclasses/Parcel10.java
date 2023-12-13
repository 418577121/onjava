package com.iwin.innerclasses;

// 使用 "示例初始化"来执行匿名内部类的构造
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {

            private int cost;
            // 为每个对象执行示例初始化：
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        p.destination("内部类", 101.395F);
    }
}
/**
 * Over budget!
 */