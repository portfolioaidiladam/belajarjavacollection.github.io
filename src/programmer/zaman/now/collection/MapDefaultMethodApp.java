package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
// belajar Default Method (di map)
// Di Java 8 ada fitur bernama Default Method, dimana kita bisa menambahkan konkrit method di interface
// Fitur ini banyak sekali digunakan di Java Collection, karena kita tahu semua collection di Java memiliki kontrak
// interface, sehingga dengan mudah di Java bisa meng-improve kemampuan semua collection hanya dengan menambahkan
// default method di interface collection nya

public class MapDefaultMethodApp {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    map.put("Eko", "Aidil Value");
    map.put("Budi", "Adam Value");
    map.put("Joko", "Baik Hati Value");

    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String key, String value) {
        System.out.println(key + ":" + value);
      }
    });

  }
}
