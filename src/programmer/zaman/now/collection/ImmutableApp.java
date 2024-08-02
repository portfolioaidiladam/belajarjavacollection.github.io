package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
  public static void main(String[] args) {
    // belajar Immutable list
    //Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi.
    //Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.

    List<String> one = Collections.singletonList("Satu");
    List<String> empty = Collections.emptyList();

    List<String> mutable = new ArrayList<>();
    mutable.add("Aidil");
    mutable.add("Adam");
    List<String> immutable = Collections.unmodifiableList(mutable);
    // mau masukan datanya satu persatu
    List<String> elements = List.of("Aidil", "Adam", "Baik Hati");

    // bakalan error karena sudah di proteksi
   // elements.add("Budi");

  }
}
