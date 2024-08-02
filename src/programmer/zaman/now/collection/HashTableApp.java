package programmer.zaman.now.collection;

import java.util.Hashtable;
import java.util.Map;
// belajar Hashtable
// HashTable adalah implementasi dari Map yang mirip dengan HashMap
//Sama seperti Vector, semua method di HashTable memiliki kata kunci synchronized,
// sehingga performanya lebih lambat dibandingkan HashMap
//Dan karena di versi Java baru sudah ada juga ConcurrentHashMap,
// sehingga penggunaan HashTable sudah jarang sekali ditemui

public class HashTableApp {
  public static void main(String[] args) {

    Map<String, String> map = new Hashtable<>();

    map.put("Eko", "Aidil");
    map.put("Budi", "Adam");
    map.put("Joko", "Baik Hati");

    for (var key : map.keySet()) {
      System.out.println(key);
    }

  }
}
