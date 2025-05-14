public class Main {
   public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<>();
       set.add(1);
       set.add(6);
       set.add(2);
       set.add(-8);
       set.add(12);
       set.add(16);
       set.add(3);
       int sum = 13, rem;
       boolean check = true;
       for(int i : set){
           rem = sum - i;
           if(set.contains(rem)){
               check = false;
               System.out.println("Pair was present with the given sum " + sum + " Pair " + rem + " " + i);
           }
       }
       if(check){
           System.out.println("Pair was not present with the given sum " + sum);
       }

   }
}