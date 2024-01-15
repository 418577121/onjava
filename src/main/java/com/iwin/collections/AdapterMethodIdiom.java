package com.iwin.collections;

import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
  ReversibleArrayList(Collection<T> c) {
    super(c);
  }
  public Iterable<T> reversed() {
    return new Iterable<T>() {
      public Iterator<T> iterator() {
        return new Iterator<T>() {
          int current = size() - 1;
          @Override public boolean hasNext() {
            return current > -1;
          }
          @Override
          public T next() { return get(current--); }
          @Override
          public void remove() { // Not implemented
            throw new UnsupportedOperationException();
          }
        };
      }
    };
  }
}

public class AdapterMethodIdiom {
  public static void main(String[] args) {
    ReversibleArrayList<String> ral =
      new ReversibleArrayList<>(
        Arrays.asList("To be or not to be".split(" ")));
    // 通过iterator() 获得原始的迭代器
    for(String s : ral)
      System.out.print(s + " ");
    System.out.println();
    // 使用我们选择的迭代方式
    for(String s : ral.reversed())
      System.out.print(s + " ");
  }
}
/* Output:
To be or not to be
be to not or be To
*/
