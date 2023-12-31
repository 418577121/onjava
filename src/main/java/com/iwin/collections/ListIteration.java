package com.iwin.collections;

import com.iwin.reflection.pets.Pet;
import com.iwin.reflection.pets.PetCreator;

import java.util.*;

public class ListIteration {
  public static void main(String[] args) {
    List<Pet> pets = new PetCreator().list(8);
    ListIterator<Pet> it = pets.listIterator();
    System.out.println(it.previousIndex());
    while(it.hasNext())
      System.out.print(it.next() +
        ", " + it.nextIndex() +
        ", " + it.previousIndex() + "; ");
    System.out.println();
    // 反转:
    while(it.hasPrevious())
      System.out.print(it.previous().id() + " ");
    System.out.println();
    System.out.println(pets);
    it = pets.listIterator(3);
    while(it.hasNext()) {
      it.next();
      it.set(new PetCreator().get());
    }
    System.out.println(pets);
  }
}
/* Output:
Rat, 1, 0; Manx, 2, 1; Cymric, 3, 2; Mutt, 4, 3; Pug,
5, 4; Cymric, 6, 5; Pug, 7, 6; Manx, 8, 7;
7 6 5 4 3 2 1 0
[Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Manx]
[Rat, Manx, Cymric, Rat, Rat, Rat, Rat, Rat]
*/
