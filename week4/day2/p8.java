public class Main {
   public static void main(String[] args) {
     
       Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 4));
       Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 3, 1));
       if(set1.containsAll(set2)){
           System.out.println("Contains all elements");
       }
   }
}