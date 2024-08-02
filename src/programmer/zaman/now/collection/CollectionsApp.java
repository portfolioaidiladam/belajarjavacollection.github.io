package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// belajar collections class
// Collections adalah class yang berisikan utility static method untuk membantu kita menggunakan Java Collection
// Di materi-materi sebelumnya kita sudah bahas beberapa, seperti membuat immutable collection misalnya
// Namun sebenarnya masih ada banyak static method yang bisa kita gunakan di class Collections

public class CollectionsApp {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.addAll(List.of("Aidil", "Adam", "Baik Hati", "Programmer", "Zaman", "Now"));

    System.out.println(list);

    Collections.reverse(list);
    System.out.println(list);

    Collections.shuffle(list);
    System.out.println(list);

  }
}
