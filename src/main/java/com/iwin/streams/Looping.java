package com.iwin.streams;

import static com.iwin.onjava.Repeat.repeat;

public class Looping {
  static void hi() { System.out.println("Hi!"); }
  public static void main(String[] args) {
    repeat(3, () -> System.out.println("Looping!"));
    repeat(2, Looping::hi);
  }
}
/* Output:
Looping!
Looping!
Looping!
Hi!
Hi!
*/
