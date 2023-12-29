package com.iwin.collections;
import java.util.*;

record Employee(String name, int id) {}

public class BasicRecord {
  public static void main(String[] args) {
    var bob = new Employee("Bob Dobbs", 11);
    var dot = new Employee("Dorothy Gale", 9);
    // bob.id = 12; // Error:
    // id在Employee中的访问权限为privatge
    System.out.println(bob.name()); // 访问器
    System.out.println(bob.id()); // 访问器
    System.out.println(bob); // toString()
    // Employee可以用做 Map中的键
    var map = Map.of(bob, "A", dot, "B");
    System.out.println(map);
  }
}
/* Output:
Bob Dobbs
11
Employee[name=Bob Dobbs, id=11]
{Employee[name=Dorothy Gale, id=9]=B, Employee[name=Bob Dobbs, id=11]=A}
*/
