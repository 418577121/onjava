package com.iwin.polymorphism;

// Wind对象是一种Instrument
// 因为他们有相同的接口
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
