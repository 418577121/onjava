package com.iwin.collections;
import java.util.*;

public class ArrayIsNotIterable {
  static <T> void test(Iterable<T> ib) {
    for(T t : ib)
      System.out.print(t + " ");
  }
  public static void main(String[] args) {
    test(Arrays.asList(1, 2, 3));
    String[] strings = { "A", "B", "C" };
    // 数组可以配合for-in使用，但是并没有实现Iterable接口
    //- test(strings);
    // 必须显式的将其转换weiIterable
    test(Arrays.asList(strings));
  }
}
/* Output:
1 2 3 A B C
*/
