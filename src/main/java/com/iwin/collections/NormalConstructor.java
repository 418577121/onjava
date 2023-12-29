package com.iwin.collections;

record Value(int x) {
  Value(int x) { // 带有参数列表
    this.x = x;  // 必须显式初始化
  }
}
