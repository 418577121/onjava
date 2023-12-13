package com.iwin.innerclasses;

// 调用基类构造器
public class Parcel8 {
    public Wrapping wrapping(int x) {
        // 基类构造器调用
        return new Wrapping(x) { // [1]

            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // [2]
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
