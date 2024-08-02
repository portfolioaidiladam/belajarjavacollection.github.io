package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Belajar Binary Search
// Secara default List di Java memiliki fitur search atau get data, namun implementasinya menggunakan sequential search,
// artinya data akan di cek satu per satu dari awal
// sSalah satu algoritma pencarian yang populer adalah binary search, namun binary search hanya bisa
// dilakukan jika datanya telah berurutan
//Untungnya di Java Collection sudah ada implementasi binary search, sehingga kita tidak perlu membuatnya secara manual

public class BinarySearchApp {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>(1000);
    for (int i = 1; i <= 1000; i++) {
      list.add(i);
    }

    int index = Collections.binarySearch(list, 333);
    System.out.println(index);

    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    };

    int index2 = Collections.binarySearch(list, 333);
    System.out.println(index2);

  }
}
