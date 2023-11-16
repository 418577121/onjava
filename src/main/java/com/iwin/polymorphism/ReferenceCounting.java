package com.iwin.polymorphism;
// 清理共享对象
class Shared {
    private int refconut = 0;
    private static long counter = 0;
    private final long id = counter++;
    Shared() {
        System.out.println("Creating " + this);
    }
    public void addRef() {
        refconut++;
    }
    protected void dispose() {
        if (--refconut == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shard " + id;
    }
}
class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "composing " + id;
    }
}
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };
        for (Composing c : composing) {
            c.dispose();
        }
    }
}
/**
 * Creating Shard 0
 * Creating composing 0
 * Creating composing 1
 * Creating composing 2
 * Creating composing 3
 * Creating composing 4
 * disposing composing 0
 * disposing composing 1
 * disposing composing 2
 * disposing composing 3
 * disposing composing 4
 * Disposing Shard 0
 */