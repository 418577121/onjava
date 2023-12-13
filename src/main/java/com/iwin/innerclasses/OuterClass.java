package com.iwin.innerclasses;

public class OuterClass {
    private int outerField;

    // 普通内部类
    public class InnerClass {
        private static int staticInnerField = 10;
        public void doSomething() {
            System.out.println(outerField);
            staticInnerField++;
        }
    }

    // 静态嵌套类
    public static class StaticNestedClass {
        private static final int staticInnerField = 10;
        public static void staticNestedMethod() {
            System.out.println("Static Nested Method");
        }
        public void doSomething() {
            // System.out.println(outer);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.doSomething();
        System.out.println(innerClass.staticInnerField);
    }
    }
