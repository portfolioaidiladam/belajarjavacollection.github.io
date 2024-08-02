package programmer.zaman.now.collection;

import java.util.EnumSet;
import java.util.Set;
// belajar set Interface (enum set)
public class EnumSetApp {

  public static enum Gender {
    MALE, FEMALE, NOT_MENTION
  }

  public static void main(String[] args) {

    // kalau pengen semuanya
    Set<Gender> genders = EnumSet.allOf(Gender.class);

    // kalau pengen satu satu saja
    // Set<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE, Gender.FEMALE);

    for (var gender: genders){
      System.out.println(gender);
    }

    // sebenernya bisa seperti ini, ini udah dapet semuanya
    // Gender[] values = Gender.values();
  }
}
