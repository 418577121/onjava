package com.iwin.interfaces;

public class Implementations implements InterfaceWithDefault {
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefault i = new Implementations();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }
}
/**
 * firstMethod
 * secondMethod
 * newMethod
 */