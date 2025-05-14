import java.util.*;

public class Main {
   public static void main(String[] args)  {
       try{
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           int b = sc.nextInt();
           int res =  a/b;
           System.out.println(res);
       }
       catch (ArithmeticException e){
           System.out.println("ArithmeticException " + e.getMessage());
       }
       catch (InputMismatchException e){
           System.out.println("InputMismatchException " + e.getMessage());
       }
       finally {
           System.out.println("Operation completed");
       }

   }
}