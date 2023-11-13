package com.iwin.polymorphism.shape.music3;

import com.iwin.polymorphism.Note;

// 一个可扩展的程序
class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }
    String what() {
        return "Instrument";
    }
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
class Brass extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
class Woodwind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    String what() {
        return "Woodwind";
    }
}
public class Music3 {
    // 并不关心类型，所以添加到系统的新类型仍能正常工作.
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // 在数组填充时会向上转型：
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
/**
 * Wind.play() MIDDLE_C
 * Percussion.play() MIDDLE_C
 * Stringed.play() MIDDLE_C
 * Brass.play() MIDDLE_C
 * Woodwind.play() MIDDLE_C
 */
