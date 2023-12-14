package com.iwin.innerclasses;
// 保存一个对象序列

interface Counter {
    int next();
}


public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        // 一个局部内部类
        class LocalCounter implements Counter {
            LocalCounter() {
                // 局部内部类可以有一个构造器
                System.out.println("LocalCounter");
            }
            @Override
            public int next() {
                System.out.print(name); // 访问局部的final变量
                return count++;
            }
        }
        return new LocalCounter();
    }

    // 使用匿名内部类实现同样的功能
    Counter getCounter2(final String name) {
        return new Counter() {
            // 匿名内部类不能有具名的构造器
            // 只有一个实例初始化部分
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("Loacl inner"),
                c2 = lic.getCounter2("Anonmous inner");

        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}
/**
 * LocalCounter
 * Counter()
 * Loacl inner0
 * Loacl inner1
 * Loacl inner2
 * Loacl inner3
 * Loacl inner4
 * Anonmous inner5
 * Anonmous inner6
 * Anonmous inner7
 * Anonmous inner8
 */