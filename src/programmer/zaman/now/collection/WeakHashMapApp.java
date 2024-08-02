package programmer.zaman.now.collection;

import java.util.Map;
import java.util.WeakHashMap;

// belajar map (Weak map)
// WeakHashMap adalah implementasi Map mirip dengan HashMap
// Yang membedakan adalah WeakHashMap menggunakan weak key,
// dimana jika tidak digunakan lagi maka secara otomatis data di WeakHashMap akan dihapus

public class WeakHashMapApp {
  public static void main(String[] args) {

    Map<Integer, Integer> map = new WeakHashMap<>();

    for (int i = 0; i < 1_000_000; i++) {
      map.put(i, i);
    }

    System.gc();

    System.out.println(map.size());

  }
}
