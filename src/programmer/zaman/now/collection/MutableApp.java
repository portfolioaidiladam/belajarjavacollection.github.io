package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

import java.util.List;
// belajar Immutable list
//Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi.
//Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.

public class MutableApp {
  public static void main(String[] args) {

    Person person = new Person("Eko");

    person.addHobby("Game");
    person.addHobby("Coding");
    // ada yang manggil
    doSomethingWithHobbies(person.getHobbies());

    for(var hobby : person.getHobbies()){
      System.out.println(hobby);
    }

  }

//
  public static void doSomethingWithHobbies(List<String> hobbies){
    hobbies.add("Bukan Hobby");
  }
}
