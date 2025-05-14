import java.util.*;

public class Main {
   public static void main(String[] args) {
       Map<String, Integer> original = new HashMap<>();
       original.put("A", 1);
       original.put("B", 2);
       original.put("C", 1);

       Map<Integer, List<String>> inverted = new HashMap<>();
       for (Map.Entry<String, Integer> entry : original.entrySet()) {
           String key = entry.getKey();
           Integer value = entry.getValue();

           inverted.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
       }

       System.out.println(inverted);
   }
}