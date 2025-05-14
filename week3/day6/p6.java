public class Main {
   public static void main(String[] args) {
       int[] sizes = {1000, 100_000, 1_000_000};
       Random rand = new Random();

       for (int n : sizes) {
           int target = -1;


           int[] data = rand.ints(n, 0, n * 2).toArray();


           List<Integer> arrayList = new ArrayList<>();
           Set<Integer> hashSet = new HashSet<>();
           Set<Integer> treeSet = new TreeSet<>();

           for (int num : data) {
               arrayList.add(num);
               hashSet.add(num);
               treeSet.add(num);
           }

           System.out.println("Dataset Size: " + n);

           long start = System.nanoTime();
           boolean foundInArray = arrayList.contains(target);
           long end = System.nanoTime();
           System.out.printf("Array Search: %.3f ms\n", (end - start) / 1_000_000.0);

          
           start = System.nanoTime();
           boolean foundInHashSet = hashSet.contains(target);
           end = System.nanoTime();
           System.out.printf("HashSet Search: %.3f ms\n", (end - start) / 1_000_000.0);


           start = System.nanoTime();
           boolean foundInTreeSet = treeSet.contains(target);
           end = System.nanoTime();
           System.out.printf("TreeSet Search: %.3f ms\n", (end - start) / 1_000_000.0);

           System.out.println();
       }
   }
}