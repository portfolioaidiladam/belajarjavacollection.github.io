package programmer.zaman.now.collection;

import java.util.Stack;
// belajar Stack Class
// Stack adalah implementasi struktur data tumpukan LIFO (Last In First Out)
// Namun fitur yang lebih komplit dan konsisten sudah disediakan di Deque,
// jadi tidak ada alasan lagi menggunakan class Stack
public class StackApp {
  public static void main(String[] args) {

    Stack<String> stack = new Stack<>();

    stack.push("Aidil");
    stack.push("Adam");
    stack.push("Baik Hati");

    // tinggal di try catch aja kalau keluar empty stack execption
    for(var value = stack.pop(); value != null; value = stack.pop()){
      System.out.println(value);
    }

  }
}
