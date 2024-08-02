package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// belajar List Interface
// ArrayList adalah implementasi dari List menggunakan array
// LinkedList adalah implementasi List dengan struktur data Double Linked List

public class ListApp {
  public static void main(String[] args) {

    List<String> strings = new ArrayList<>();
    // List<String> strings = new LinkedList<>();

    strings.add("Aidil");
    strings.add("Adam");

    strings.set(0, "Budi");

    strings.remove(1);

    System.out.println(strings.get(0));

    for (var value : strings){
      System.out.println(value);
    }

  }
}
