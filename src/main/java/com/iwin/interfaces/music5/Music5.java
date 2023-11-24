package com.iwin.interfaces.music5;

import com.iwin.polymorphism.Note;

interface Instrument {
    // 编译时常量
    int VALUE = 5; // static & final
    default void play(Note n) { // 自动就是publicde
        System.out.println(this + ".play() " + n);
    }
    default void adjust(Note n) {
        System.out.println("Adjusting " + this);
    }
}

class Wind implements Instrument {
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }
}
class Stringed implements Instrument {
    @Override
    public String toString() {
        return "Stringed";
    }
}
class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}
class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    // 不关心类型，因此添加到系统的新类型可以正常工作
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // 填充数组时会自动向上转型。
        Instrument[] instruments = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(instruments);
    }
}
/**
 * Wind.play() MIDDLE_C
 * Percussion.play() MIDDLE_C
 * Stringed.play() MIDDLE_C
 * Brass.play() MIDDLE_C
 * Woodwind.play() MIDDLE_C
 */