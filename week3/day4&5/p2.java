public class Main {
   public static void main(String[] args) {
       StringBuilder obj = new StringBuilder();
       HashSet<Character> hashSet = new HashSet();
       String str = "defeehkg";
       for (int i = 0; i < str.length(); i++) {
           if(!hashSet.contains(str.charAt(i))){
               hashSet.add(str.charAt(i));
           }
       }
       for (char out : hashSet){
           System.out.print(out);
       }
   }
}