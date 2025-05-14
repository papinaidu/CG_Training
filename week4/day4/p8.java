import java.util.*;

public class Main {
   public static void sum(int a, int b) throws ArithmeticException{
       int res =  a/b;
       System.out.println(res);
   }
   public static void method(int a, int b) {
       sum(a, b);
   }
   public static void main(String[] args)  {
       int a = 10;
       int b = 0;
       try{
           method(a,b);
       }
       catch (ArithmeticException e){
           System.out.println("ArithmeticException " + e.getMessage());
       }
       finally {
           System.out.println("Handled exception in main");
       }
   }
}