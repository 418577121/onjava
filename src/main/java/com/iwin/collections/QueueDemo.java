package com.iwin.collections;
import java.util.*;

public class QueueDemo {
  public static void printQ(Queue queue) {
    while(queue.peek() != null) {
      System.out.print(queue.remove() + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    Random rand = new Random(47);
    for(int i = 0; i < 10; i++) {
      queue.offer(rand.nextInt(i + 10)); // 自动装箱
    }
    printQ(queue);
    Queue<Character> qc = new LinkedList<>();
    for(char c : "Brontosaurus".toCharArray()){
      qc.offer(c);
    }
    printQ(qc);
  }
}
/* Output:
8 1 1 1 5 14 3 1 0 1
B r o n t o s a u r u s
*/
