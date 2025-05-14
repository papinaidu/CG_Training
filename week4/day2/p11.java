public class Main {
   public static void main(String[] args) {
       Set<Integer> set = new HashSet<>(Arrays.asList(1, 3, 5, 9, 1, 2));
       List<Integer> list = new ArrayList<>(set);
       Collections.sort(list);
       System.out.println(list);
   }
}