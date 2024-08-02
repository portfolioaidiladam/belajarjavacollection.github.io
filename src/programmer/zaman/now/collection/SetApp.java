package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
// belajar set Interface
// Set adalah salah satu collection yang berisikan elemen-elemen yang unik, atau tidak boleh duplicate
public class SetApp {
  public static void main(String[] args) {
    // ini hasilnya tidak berurut
    // Set<String> names = new HashSet<>();
    // ini kalau mau hasilnya berurut karena didalemnya itu ada struktur data double linklist untuk memaintanance urutannya
    Set<String> names = new LinkedHashSet<>();

    names.add("Aidil");
    names.add("Adam");
    names.add("Baik Hati");
    names.add("Aidil");
    names.add("Adam");
    names.add("Baik Hati");

    for (var name : names) {
      System.out.println(name);
    }

  }
}
