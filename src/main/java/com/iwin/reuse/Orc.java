package com.iwin.reuse;
class Villain {
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}
public class Orc extends Villain {
    private int orcNumber;
    Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name); // 方法可用，因为是protected的
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
/**
 * Orc 12: I'm a Villain and my name is Limburger
 * Orc 19: I'm a Villain and my name is Bob
 */