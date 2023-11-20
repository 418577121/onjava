package com.iwin.interfaces;

interface Jim1 {
    default void jim() {
        System.out.println("Jim1::ji,");
    }
}
interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}
public class Jim implements Jim1, Jim2 {
    @Override
    public void jim() {
        Jim2.super.jim();
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}
/**
 * Jim2::jim
 */