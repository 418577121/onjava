package com.iwin.functional;
import java.util.function.*;

public class AnonymousClosure {
  IntSupplier makeFun(int x) {
    int i = 0;
    // Same rules apply:
    // i++; // 并非 “实际上的最终变量”
    // x++; // 同上
    return new IntSupplier() {
      public int getAsInt() { return x + i; }
    };
  }
}
