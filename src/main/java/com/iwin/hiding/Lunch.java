package com.iwin.hiding;
// 演示类的访问权限修饰符，通过私有构造器
// 让类的对象创建保持私有
class Soup1 {
    private Soup1() {}
    public static Soup1 makeSoup() { // [1]
        return new Soup1();
    }
}
class Soup2 {
    private Soup2() {}
    private static Soup2 ps1 = new Soup2(); // [2]
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}
// 每个文件只能有一个public类
public class Lunch {
    void testPrivate() {
        // 不能这么做，构造器是私有的
        //- Soup1 soup = new Soup1();
    }
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton() {
        Soup2.access();
    }
}
