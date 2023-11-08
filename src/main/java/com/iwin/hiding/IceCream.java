package com.iwin.hiding;

public class IceCream {
    public static void main(String[] args) {
        // Sunde x = new Sunde();
        Sunde sunde = Sunde.makeSundae();
    }

}

class Sunde {
    private Sunde() {} // 阻止了该类的继承
    static Sunde makeSundae() {
        return new Sunde();
    }
}