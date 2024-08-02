package programmer.zaman.now.collection;

import java.util.List;
import java.util.Vector;
// belajar Vector class
// Vector class adalah implementasi dari interface List
//Cara kerja Vector mirip dengan ArrayList, yang membedakan adalah semua method di Vector
// menggunakan kata kunci  synchronized yang artinya dia thread safe
//Namun problemnya adalah, karena semua method menggunakan kata kunci synchronized,
// secara otomatis impact nya ke-performance yang menjadi lambat dibandingkan menggunakan ArrayList
public class VectorApp {
  public static void main(String[] args) {

    List<String> list = new Vector<>();

    list.add("Aidil");
    list.add("Adam");
    list.add("Baik Hati");

    for (var value : list){
      System.out.println(value);
    }

  }
}
