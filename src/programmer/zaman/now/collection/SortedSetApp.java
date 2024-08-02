package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
// belajar sortedset interface
public class SortedSetApp {
  public static void main(String[] args) {

    SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

    people.add(new Person("Aidil"));
    people.add(new Person("Budi"));
    people.add(new Person("Joko"));

    for (var person : people){
      System.out.println(person.getName());
    }
    // Membuat Immutable SortedSet
    SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
    // sortedSet.add(new Person("Kurniawan"));

  }
}
