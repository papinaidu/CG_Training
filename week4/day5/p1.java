public class Main {
   public static void main(String[] args) {
       System.out.println(Pattern.matches("^[a-zA-Z][a-zA-Z0-9_]{5,15}$", "user123"));
   }
}