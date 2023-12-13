package com.iwin.innerclasses;

// Parcel7.java的扩充版本
public class Parcel7B {
    class MyContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7B p = new Parcel7B();
        Contents c = p.contents();
    }
}
