package com.iwin.reuse;
// 使用组合来复用代码
class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource(");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}
public class SprinkleSystem {
    private String value1, value2, value3,values4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinkleSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", values4='" + values4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinkleSystem sprinkleSystem = new SprinkleSystem();
        System.out.println(sprinkleSystem);
    }
}

/**
 * SprinkleSystem{value1='null', value2='null', value3='null', values4='null', source=Constructed, i=0, f=0.0}
 */