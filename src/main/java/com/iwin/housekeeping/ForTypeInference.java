package com.iwin.housekeeping;

public class ForTypeInference {
    public static void main(String[] args) {
        for (var s : Spiciness.values()) {
            System.out.println(s);
        }
    }
}

/**
 * NOT
 * MILD
 * MEDIUM
 * HOT
 * FLAMING
 */