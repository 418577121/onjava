package com.iwin.housekeeping;

class Plumbus {}
public class TypeInference {
    void method() {
        // 显式类型
        String hello1 = "Hello";
        // 类型推断
        var hello = "Hello!";
        // 自定义类型也起作用
        Plumbus pb1 = new Plumbus();
        var pb2 = new Plumbus();
    }
    // 静态方法里也可以启动：
    static void staticMethod() {
        var hello = "Hello!";
        var pb2 = new Plumbus();
    }
}

class NoInference {
    String field1 = "Field initialization";
    // var field2 = "can't do this";
//    void method() {
//        var noInitializer;
//        var aNull = null;
//    }
//
//    var inferReturnType() {
//        return "Can't infer return type";
//    }
}
