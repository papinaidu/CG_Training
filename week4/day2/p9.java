public class Main {
   public static void main(String[] args) {
       Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
       Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
       Set<Integer> uni = new HashSet<>(set1);
       uni.addAll(set2);
       System.out.println("Union " + uni);
      
       Set<Integer> inter = new HashSet<>(set1);
       inter.retainAll(set2);
       System.out.println("Inter " + inter);
   }
}