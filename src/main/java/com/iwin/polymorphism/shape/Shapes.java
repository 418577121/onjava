package com.iwin.polymorphism.shape;

public class Shapes {
    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        // 执行多态方法调用
        for (Shape shape : gen.array(9)) {
            shape.draw();
        }
    }
}

/**
 * Triangle.draw()
 * Triangle.draw()
 * Square.draw()
 * Triangle.draw()
 * Square.draw()
 * Triangle.draw()
 * Square.draw()
 * Triangle.draw()
 * Circle.draw()
 */