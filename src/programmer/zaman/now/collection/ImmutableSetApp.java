package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
// belajar Immutable Set

public class ImmutableSetApp {
  public static void main(String[] args) {

    Set<String> empty = Collections.emptySet();
    Set<String> one = Collections.singleton("Eko");

    Set<String> mutable = new HashSet<>();
    mutable.add("Aidil");
    mutable.add("Adam");
    Set<String> immutable = Collections.unmodifiableSet(mutable);

    // membuat set manual satu persatu
    Set<String> set = Set.of("Aidil", "Adam");

    // set.add("Eko"); error
    // set.remove("Eko"); error

  }
}
