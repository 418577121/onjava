package com.iwin.polymorphism;
// 构造器和多态
// 不会生成你所期望的结果
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println(
                "RoundGlyph.RoundGlyph(), radius = " + radius
        );
    }

    @Override
    void draw() {
        System.out.println(
                "RoundGlyph.draw(), radius = " + radius
        );
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

/**
 * Glyph() before draw()
 * RoundGlyph.draw(), radius = 0
 * Glyph() after draw()
 * RoundGlyph.RoundGlyph(), radius = 5
 */