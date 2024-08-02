package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

// belajar deque interface

public class DequeApp {
  public static void main(String[] args) {

    Deque<String> stack = new LinkedList<>();

    stack.offerLast("Aidil");
    stack.offerLast("Adam");
    stack.offerLast("Baik Hati");

    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());

    Deque<String> queue = new LinkedList<>();
    queue.offerLast("Aidil");
    queue.offerLast("Adam");
    queue.offerLast("Baik Hati");

    System.out.println(queue.pollFirst());
    System.out.println(queue.pollFirst());
    System.out.println(queue.pollFirst());

  }
}
