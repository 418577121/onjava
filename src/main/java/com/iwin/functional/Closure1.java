package com.iwin.functional;
import java.util.function.*;

public class Closure1 {
  int i;
  IntSupplier makeFun(int x) {
    return () -> x + i++;
  }
}
