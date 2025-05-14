public class Main {
   public static void main(String[] args) {
       String input = "This is an example with  multiple  spaces.";
       String res = input.replaceAll("\\s\\s", " ");
       System.out.println(res);
   }
}