package com.iwin.functional;

public class RecursiveFactorial {
  static IntCall fact;
  // static IntCall fact1 = n -> n == 0 ? 1 : n * fact1.call(n - 1);
  public static void main(String[] args) {
    fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
    for(int i = 0; i <= 10; i++)
      System.out.println(fact.call(i));
  }
}
/* Output:
1
1
2
6
24
120
720
5040
40320
362880
3628800
*/
