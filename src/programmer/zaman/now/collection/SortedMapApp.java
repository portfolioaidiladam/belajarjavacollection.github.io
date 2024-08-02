package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

// belajar SortedMap
// SortedMap adalah implementasi Map dengan data key diurutkan sesuai dengan Comparable key atau bisa menggunakan Comparator
// SortedMap cocok untuk kasus yang posisi key pada Map harus berurut

public class SortedMapApp {
  public static void main(String[] args) {

    Comparator<String> stringComparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    };

    SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

    sortedMap.put("Eko", "Aidil");
    sortedMap.put("Joko", "Adam");
    sortedMap.put("Budi", "Baik Hati");

    for (var key : sortedMap.keySet()) {
      System.out.println(key);
    }
    // immutable SortedMap
    SortedMap<String, String> empty = Collections.emptySortedMap();
    SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

    // immutable.put("Nugraha", "Nugraha"); // error

  }
}
