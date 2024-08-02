package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// belajar Entry Map
// Saat kita menyimpan data di Map, data disimpan dalam pair (key-value)
// Di Java collection, implementasi Pair di Map bernama Entry
// Entry adalah interface sederhana yang berisikan method untuk mengambil key dan value

public class EntryApp {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();

    map.put("Eko", "Aidil Value");
    map.put("Budi", "Adam Value");
    map.put("Joko", "Baik Hati Value");

    Set<Map.Entry<String, String>> entries = map.entrySet();

    for (var entry : entries) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

  }
}
