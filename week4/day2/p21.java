import java.util.*;

public class Main {
   public static void main(String[] args) {
       Map<String, Integer> original = new HashMap<>();
       original.put("A", 1);
       original.put("B", 2);
       original.put("C", 1);
       String key = null;
       int max = Integer.MIN_VALUE;
       for (Map.Entry<String, Integer> entry : original.entrySet()) {
           Integer value = entry.getValue();
           if(value>max){
               max = value;
               key = entry.getKey();
           }
       }

       System.out.println(key);
   }
}