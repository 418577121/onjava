package com.iwin.collections;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i); // 自动装箱
        }
        for (Integer integer : c) {
            System.out.print(integer + ", ");
        }
    }
}
/**
 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
 */