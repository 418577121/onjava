package com.iwin.hiding;

import com.iwin.hiding.cookie2.*;

public class ChocolateChip2 extends Cookie {
    public ChocolateChip2() {
        System.out.println("ChocolateChip2 constructor");
    }
    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}

/**
 * Cookie constructor
 * ChocolateChip2 constructor
 * bite
 */