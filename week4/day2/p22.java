import java.util.*;


public class Main {
   public static void main(String[] args) {
       Map<String, Integer> map1 = new HashMap<>();
       map1.put("A", 1);
       map1.put("B", 2);
       map1.put("C", 1);

       Map<String, Integer> map2 = new HashMap<>();
       map2.put("A", 1);
       map2.put("B", 2);
       map2.put("C", 1);


       for (Map.Entry<String, Integer> entry : map2.entrySet()) {
           String key = entry.getKey();
           Integer value = entry.getValue();

           map1.replace(key,map1.get(key),  map1.get(key)+value);
       }

       System.out.println(map1);
   }
}