package com.iwin.polymorphism;

// 继承与向上转型
public class Music {
    // 接受一个Instrument，但也可以接受任何继承了Instrument的类
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        tune(wind);  // 向上转型，不用强制类型转换
    }
}
/**
 * Wind.play() MIDDLE_C
 */
