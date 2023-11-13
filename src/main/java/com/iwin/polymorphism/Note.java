package com.iwin.polymorphism;
// 用来再乐器中演奏的音符
public enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

// 管乐器（Wind）是一种乐器（Instrument）
class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}
// Wind可以继承Instrument:
