package programmer.zaman.now.collection;

import com.sun.tools.javac.Main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
// belajar map (LinkedHashMap)
// LinkedHashMap adalah implementasi Map dengan menggunakan double linked list
// Data di LinkedHashMap akan lebih terprediksi karena datanya akan disimpan berurutan
// dalam linked list sesuai urutan kita menyimpan data

public class LinkedHashMapApp {
  public static void main(String[] args) {

    Map<String, String> map = new LinkedHashMap<>();
    //Map<String, String> map = new HashMap<>();

    map.put("first", "Aidil");
    map.put("last", "Baik Hati");
    map.put("middle", "Adam");

    Set<String> keys = map.keySet();
    for (var key : keys) {
      System.out.println(key);
    }

  }
}
