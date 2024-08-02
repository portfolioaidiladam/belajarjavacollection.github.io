package programmer.zaman.now.collection;

import java.util.Iterator;
import java.util.List;

// belajar Iterable Interface

public class IterableApp {
  public static void main(String[] args) {

    Iterable<String> names = List.of("Aidil", "Adam", "Baik");
    for (var name : names){
      System.out.println(name);
    }

    System.out.println("ITERATOR");
    Iterator<String> iterator = names.iterator();

    while(iterator.hasNext()){
      String name = iterator.next();
      System.out.println(name);
    }

  }
}
