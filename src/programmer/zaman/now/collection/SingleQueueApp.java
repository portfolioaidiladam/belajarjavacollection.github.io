package programmer.zaman.now.collection;

import programmer.zaman.now.collection.collection.SingleQueue;

import java.util.Queue;
// belajar Abstract Collection (Single Queue)
// Struktur data collection di Java selalu berkembang, namun biasanya algoritma dasarnya selamu sama antar jenis collection
//Hampir semua interface collection di Java sudah disediakan abstract class nya sebagai dasar algoritma nya,
// dan hampir semua implementasi class konkrit nya selalu extends abstract class collection
//Hal ini mempermudah kita, jika ingin membuat collection manual, kita tidak perlu membuat dari awal,
// kita bisa menggunakan abstract class yang sudah disediakan

public class SingleQueueApp {
  public static void main(String[] args) {

    Queue<String> queue = new SingleQueue<>();
    System.out.println(queue.size());

    System.out.println(queue.offer("Aidil"));
    System.out.println(queue.offer("Adam"));
    System.out.println(queue.offer("Baik Hati"));

    System.out.println(queue.size());

    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());

    System.out.println(queue.size());

  }
}
