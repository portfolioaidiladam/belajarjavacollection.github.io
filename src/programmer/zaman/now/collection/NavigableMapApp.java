package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

// belajar NavigableMap
// NavigableMap adalah turunan dari SortedMap
// Namun NagivableMap memiliki kemampuan navigasi berdasarkan operasi kurang dari, lebih dari dan sejenisnya

public class NavigableMapApp {
  public static void main(String[] args) {

    NavigableMap<String, String> map = new TreeMap<>();

    map.put("Eko", "Aidil");
    map.put("Budi", "Adam");
    map.put("Joko", "Baik Hati");

    for (var key : map.keySet()){
      System.out.println(key);
    }

    System.out.println(map.lowerKey("Eko"));
    System.out.println(map.higherKey("Eko"));

    NavigableMap<String, String> mapDesc = map.descendingMap();
    for (var key : mapDesc.keySet()){
      System.out.println(key);
    }
    // Membuat immutable navigable map kosong
    NavigableMap<String, String> empty = Collections.emptyNavigableMap();
    //Mengubah mutable navigable map menjadi immutable
    NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

    // immutable.put("Eko", "Eko"); error

  }
}
