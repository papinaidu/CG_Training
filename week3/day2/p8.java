class CustomHashMap<K, V> {

   private static class Node<K, V> {
       K key;
       V value;
       Node<K, V> next;

       Node(K key, V value) {
           this.key = key;
           this.value = value;
       }
   }

   private final int SIZE = 16;
   private Node<K, V>[] buckets;

   public CustomHashMap() {
       buckets = new Node[SIZE];
   }

   private int getBucketIndex(K key) {
       return Math.abs(key.hashCode()) % SIZE;
   }

   public void put(K key, V value) {
       int index = getBucketIndex(key);
       Node<K, V> head = buckets[index];

       Node<K, V> current = head;
       while (current != null) {
           if (current.key.equals(key)) {
               current.value = value;
               return;
           }
           current = current.next;
       }

       Node<K, V> newNode = new Node<>(key, value);
       newNode.next = head;
       buckets[index] = newNode;
   }

   public V get(K key) {
       int index = getBucketIndex(key);
       Node<K, V> current = buckets[index];

       while (current != null) {
           if (current.key.equals(key)) {
               return current.value;
           }
           current = current.next;
       }

       return null;
   }

   public void remove(K key) {
       int index = getBucketIndex(key);
       Node<K, V> current = buckets[index];
       Node<K, V> prev = null;

       while (current != null) {
           if (current.key.equals(key)) {
               if (prev == null) {
                   buckets[index] = current.next;
               } else {
                   prev.next = current.next;
               }
               return;
           }

           prev = current;
           current = current.next;
       }
   }

   public void printMap() {
       for (int i = 0; i < SIZE; i++) {
           Node<K, V> node = buckets[i];
           System.out.print("Bucket " + i + ": ");
           while (node != null) {
               System.out.print("[" + node.key + "=" + node.value + "] -> ");
               node = node.next;
           }
           System.out.println("null");
       }
   }
}

public class Main {
   public static void main(String[] args) {
       CustomHashMap<String, Integer> map = new CustomHashMap<>();
       map.put("apple", 10);
       map.put("banana", 20);
       map.put("orange", 30);
       map.put("apple", 15);

       System.out.println("Get apple: " + map.get("apple"));
       System.out.println("Get banana: " + map.get("banana"));

       map.remove("banana");
       System.out.println("Get banana after removal: " + map.get("banana"));

       map.printMap();
   }
}