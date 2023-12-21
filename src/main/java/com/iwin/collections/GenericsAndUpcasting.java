package com.iwin.collections;

import java.util.ArrayList;

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}
/**
 * com.iwin.collections.GrannySmith@6d311334
 * com.iwin.collections.Gala@682a0b20
 * com.iwin.collections.Fuji@3d075dc0
 * com.iwin.collections.Braeburn@214c265e
 */