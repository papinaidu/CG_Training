import java.util.*;

public class Main  {
   public static void main(String[] args) {
       String str = "Hello world, hello Java!";
       String[] arr = str.toLowerCase().replaceAll("[^a-z0-9 ]", "").split(" ");
       Map<String, Integer> map = new HashMap<>();
       int count =1;
       for(int i=0;i< arr.length;i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i],count);
           }
           else {
               map.put(arr[i], map.get(arr[i]) + 1);
           }
       }
       System.out.println(map);
   }
}