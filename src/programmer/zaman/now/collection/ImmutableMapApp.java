package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
// belajar Immutable Map
// Sama seperti List dan Set, Map pun punya tipe data Immutable
// Map.of(...) Membuat immutable map dari key-value
public class ImmutableMapApp {
  public static void main(String[] args) {

    Map<String, String> empty = Collections.emptyMap();
    // pengen yang singleton datanya cuma satu
    Map<String, String> singleton = Collections.singletonMap("name", "Aidil");

    Map<String, String> mutable = new HashMap<>();
    mutable.put("name", "Aidil");
    Map<String, String> immutable = Collections.unmodifiableMap(mutable);

    Map<String, String> map = Map.of(
        "first", "Aidil",
        "middle", "Adam",
        "last", "Baik Hati"
    );

    // map.put("a", "A"); error

  }
}
