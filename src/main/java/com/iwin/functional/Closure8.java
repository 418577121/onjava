package com.iwin.functional;
import java.util.*;
import java.util.function.*;

public class Closure8 {
  Supplier<List<Integer>> makeFun() {
    final List<Integer> ai = new ArrayList<>();
    ai.add(1);
    return () -> ai;
  }
  public static void main(String[] args) {
    Closure8 c7 = new Closure8();
    List<Integer>
      l1 = c7.makeFun().get(),
      l2 = c7.makeFun().get();
    System.out.println(l1);
    System.out.println(l2);
    l1.add(42);
    l2.add(96);
    System.out.println(l1);
    System.out.println(l2);
  }
}
/* Output:
[1]
[1]
[1, 42]
[1, 96]
*/
