package com.iwin.interfaces.interfaceprocessor;

import java.util.Arrays;
class Upcase implements StringProcessor {

    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
class Downcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}
class Splitter implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
interface StringProcessor extends Processor {
    @Override
    Object process(Object input); // [1]
    String S = "If she weighs the same as a duck, " + // [2]
            " she's made of wood";
    static void main(String[] args) { // [3]
        Applicator.apply(new Upcase(), S);
        Applicator.apply(new Downcase(), S);
        Applicator.apply(new Splitter(), S);
    }
}
/**
 * Using Processor Upcase
 * IF SHE WEIGHS THE SAME AS A DUCK,  SHE'S MADE OF WOOD
 * Using Processor Downcase
 * if she weighs the same as a duck,  she's made of wood
 * Using Processor Splitter
 * [If, she, weighs, the, same, as, a, duck,, , she's, made, of, wood]
 */