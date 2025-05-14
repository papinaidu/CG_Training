public class Main  {
    public static List<String> firstNBinary(int n){
       List<String> list = new ArrayList<>();
       Queue<String> queue = new LinkedList<>();
       queue.add("1");
       for (int i =0; i<n;i++){
           String current = queue.remove();
           list.add(current);
           queue.add(current + "0");
           queue.add(current + "1");
       }
       return list;
   }
   public static void main(String[] args) {
        List<String>  obj= firstNBinary(5);
       System.out.println(obj);
   }
}