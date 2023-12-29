package com.iwin.collections;
import java.util.*;

record FinalFields(int i) {
  int timesTen() { return i * 10; }
  // void tryToChange() { i++; } // Error:
  // 不能给最终变量赋值
}
