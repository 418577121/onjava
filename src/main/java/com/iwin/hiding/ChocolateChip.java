package com.iwin.hiding;
// 无法在另一个包里调用包访问权限的成员
import com.iwin.hiding.dessert.*;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }
    public void chomp() {
        //- bite(); 无法访问bite
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}

/**
 * Cookie constructor
 * ChocolateChip constructor
 */