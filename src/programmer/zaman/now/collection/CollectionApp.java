package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
// belajar Collection Interface
// Collection merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus
// dan mengecek isi data collection

public class CollectionApp {
  public static void main(String[] args) {
    // menambah data di collection
    Collection<String> collection = new ArrayList<>();

    collection.add("Aidil");
    collection.add("Adam");
    collection.add("Baik Hati");
    collection.addAll(List.of("Programmer", "Zaman", "Now"));

    for (var value : collection) {
      System.out.println(value);
    }
    // menghapus data di collection
    System.out.println("REMOVE");

    collection.remove("Aidil");
    collection.remove("Budi");
    collection.removeAll(List.of("Zaman", "Now"));

    for (var value : collection) {
      System.out.println(value);
    }
    // mengecek data di collection
    System.out.println(
        collection.contains("Adam")
    );

    System.out.println(
        collection.containsAll(List.of("Baik Hati", "Programmer"))
    );
    // mendapatkan jumlah datanya ada berapa
    System.out.println(collection.size());

  }
}
