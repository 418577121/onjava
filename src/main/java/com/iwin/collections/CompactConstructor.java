package com.iwin.collections;

record Point(int x, int y) {
  void assertPositive(int val) {
    if(val < 0)
      throw new IllegalArgumentException("negative");
  }
  Point { // Compact: No parameter list
    assertPositive(x);
    assertPositive(y);
  }
}
