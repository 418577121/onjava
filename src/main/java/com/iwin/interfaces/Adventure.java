package com.iwin.interfaces;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}
class ActionCharacter {
    public void fight() {

    }
}
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}
public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }
    public static void u(CanSwim x) {
        x.swim();
    }
    public static void v(CanFly x) {
        x.fly();
    }
    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);  // 当作一个 CanFight 类型
        u(h);  // 当作一个 CanSwim 类型
        v(h);  // 当作一个 CanFly 类型
        w(h);  // 当作一个 ActionCharacter 类型
    }
}
