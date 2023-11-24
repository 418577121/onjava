package com.iwin.interfaces;

class Heat implements Operation {
    @Override
    public void execute() {
        Operation.show("Heat");
    }
}
public class MetaWork {
    public static void main(String[] args) {
        // 必须在静态上下文中定义才能使方法引用
        Operation twist = new Operation() {
            @Override
            public void execute() {
                Operation.show("Twist");
            }
        };

        Operation.runOps(
                new Heat(), // 常规类Heat
                new Operation() { // 匿名类
                    @Override
                    public void execute() {
                        Operation.show("Hammer");
                    }
                },
                twist::execute, // 方法引用
                () -> Operation.show("Anneal") // Lambda表达式---需要最少的代码
        );
    }
}
