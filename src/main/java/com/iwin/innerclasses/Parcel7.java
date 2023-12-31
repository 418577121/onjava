package com.iwin.innerclasses;

// 返回匿名内部类的一个实例
public class Parcel7 {
    public Contents contents() {
        return new Contents() { // 插入类定义
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        }; // 分号是必须的
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
