package com.iwin.interfaces;

sealed interface I11 permits JJ {}
final class JJ implements I11 {}
class Something {}
public class CheckedDowncast {
    public void f() {
        I11 i = new JJ();
        JJ j = (JJ) i;
       // Something something = (Something) i;
    }
}
