package com.iwin.reuse;
// 继承的语法与属性
class Cleanser {
    private String s = "Cleanser";
    public void append(String a) {
        s += a;
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply() {
        append(" apply()");
    }
    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();x.apply();x.scrub();
        System.out.println(x);
    }
}

public class Detergent extends Cleanser {
    // 修改方法

    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // 调用基类版本
    }
    // 向接口里添加方法
    public void foam() {
        append(" foam()");
    }
    // 测试新类
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class: ");
        Cleanser.main(args);
    }
}

/**
 * Cleanser dilute() apply() Detergent.scrub() scrub() foam()
 * Testing base class:
 * Cleanser dilute() apply() scrub()
 */