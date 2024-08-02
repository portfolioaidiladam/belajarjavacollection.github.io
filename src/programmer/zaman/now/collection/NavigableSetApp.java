package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
// belajar NavigableSet Interface
// NavigableSet adalah turunan dari SortedSet
// NavigableSet menambah method-method untuk melakukan navigasi pencarian element,
// seperti mencari elemen yang lebih besar dari, kurang dari, membalikkan urutan set, dan lain-lain

public class NavigableSetApp {
  public static void main(String[] args) {

    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("Aidil", "Adam", "Baik Hati", "Programmer", "Zaman", "Now"));

    NavigableSet<String> namesReverse = names.descendingSet();
    NavigableSet<String> aidil = names.tailSet("Adam", true);

    for (var name : aidil) {
      System.out.println(name);
    }
    // immuttable navigableset
    NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
    //immutable.add("Ups");

  }
}
