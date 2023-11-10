package com.iwin.reuse;

// 继承和向上转型
class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        // ...
        i.play();
    }
}
// Wind对象也是 instrument,因为他们有相同的接口
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // 向上转型
    }
}
