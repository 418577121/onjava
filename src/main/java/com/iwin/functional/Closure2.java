package com.iwin.functional;
import java.util.function.*;

public class Closure2 {
  IntSupplier makeFun(int x) {
    int i = 0;
    return () -> x + i;
  }
}
