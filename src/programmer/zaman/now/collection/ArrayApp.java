package programmer.zaman.now.collection;

import java.util.Arrays;
import java.util.List;
// Konversi ke Array
// Interface Collection memiliki method toArray() untuk melakukan konversi collection ke Array
// Ini sangat cocok jika kita ingin mengubah collection ke Array, misal saja karena mau memanggil
// method yang memang parameternya tipenya array, bukan collection
public class ArrayApp {
  public static void main(String[] args) {

    List<String> names = List.of("Aidil", "Adam", "Baik Hati");

    Object[] objects = names.toArray();
    String[] strings = names.toArray(new String[]{});

    System.out.println(Arrays.toString(objects));
    System.out.println(Arrays.toString(strings));

  }
}
