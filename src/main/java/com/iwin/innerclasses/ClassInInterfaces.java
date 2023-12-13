package com.iwin.innerclasses;

public interface ClassInInterfaces {
    void howdy();
    class Test implements ClassInInterfaces {

        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }
    }

    public static void main(String[] args) {
        new Test().howdy();
    }
}

/**
 * Howdy!
 */
