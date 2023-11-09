package com.iwin.reuse;
// 使用组合进行构造器初始化
class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}
public class Bath {
    private String // 在定义时初始化
    s1 = "Happy",
    s2 = "Happy",
    s3, s4;
    private Soap castile;
    private int i;
    private float toy;
    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castile = new Soap();
    }
    // 实例初始化
    { i = 47; }

    @Override
    public String toString() {
        if (s4 == null) { // 延迟 初始化
            s4 = "Joy";
        }
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castile=" + castile +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
