package com.iwin.functional;
// 未绑定对象的方法引用

class X {
  String f() { return "X::f()"; }
}
interface MakeString2 {
    String make(X x);
}

interface MakeString {
  String make();
}

interface TransformX {
  String transform(X x);
}

public class UnboundMethodReference {
  public static void main(String[] args) {
    // MakeString ms = X::f;                // [1]
    TransformX sp = X::f;
    MakeString2 sp1 = X::f;
    X x = new X();
    System.out.println(sp.transform(x));    // [2]
    System.out.println(sp1.make(x));
    System.out.println(x.f()); // Same effect
  }
}
/* Output:
X::f()
X::f()
*/
