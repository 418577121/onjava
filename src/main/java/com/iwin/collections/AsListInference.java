package com.iwin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {}
class Power extends Snow {}
class Light extends Power {}
class Heavy extends Power {}
class Crusty extends Snow {}
class Slush extends Snow {}


public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(),
                new Slush(),
                new Power()
        );
        // snow1.add(new Heavy()); // 异常


        List<Snow> snow2 = Arrays.asList(
                new Light(), new Heavy()
        );
        // snow2.add(new Slush()); // 异常

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy(), new Power());
        snow3.add(new Crusty());

        // 以显式类型参数说明作为提示
        List<Snow> snow4 = Arrays.<Snow>asList(
                new Light(), new Heavy(), new Slush()
        );
        snow4.add(new Power()); // 异常
    }
}
