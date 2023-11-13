package com.iwin.polymorphism;
// 使用重载而不是向上转型
class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
}

class Brass extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
}
public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass brass = new Brass();
        tune(flute); // 没有向上转型
        tune(violin);
        tune(brass);
    }
}
/**
 * Wind.play() MIDDLE_C
 * Stringed.play() MIDDLE_C
 * Brass.play() MIDDLE_C
 */