import java.util.*;

public class Main {
   public static void main(String[] args) {
       List<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 20, 30, 30, 40, 50));
       List<Integer> res = new LinkedList<>();
       Set<Integer> set = new HashSet<>();
       for(int n : list){
           if(!set.contains(n)){
               set.add(n);
               res.add(n);
           }
       }
       System.out.println(res);
   }
}