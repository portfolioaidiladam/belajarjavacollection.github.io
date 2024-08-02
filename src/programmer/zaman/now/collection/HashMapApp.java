package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;

// belajar map (Has map)
// HashMap adalah implementasi Map yang melakukan distribusi key menggunakan hashCode() function
// Karena HashMap sangat bergantung dengan hashCode() function, jadi pastikan kita harus membuat
// function hashCode seunik mungkin, karena jika terlalu banyak nilai hashCode() yang sama,
// maka pendistribusian key nya tidak akan optimal sehingga proses get data di Map akan semakin lambat

public class HashMapApp {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    // insert or update put
    map.put("name.first", "Aidil");
    map.put("name.middle", "Adam");
    map.put("name.last", "Baik Hati");

    System.out.println(map.get("name.first"));
    System.out.println(map.get("name.middle"));
    System.out.println(map.get("name.last"));

  }
}
