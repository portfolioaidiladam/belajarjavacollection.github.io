package programmer.zaman.now.collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// belajar Immutable list
//Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi.
//Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.
public class Person {

  private String name;

  private List<String> hobbies;

  public Person(String name) {
    this.name = name;
    this.hobbies = new ArrayList<>();
  }

  public void addHobby(String hobby){
    hobbies.add(hobby);
  }

  // encapsulation melindungi data yang ada didalam objectnya
  public List<String> getHobbies(){
    return Collections.unmodifiableList(hobbies);
  }

  public String getName() {
    return name;
  }
}
