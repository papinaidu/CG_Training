import java.util.*;
class InvalidAgeException extends Exception{
   InvalidAgeException(String message){
       super(message);
   }
}
public class Main {
   public static void printAge (int age) throws InvalidAgeException{
       if(age<18){
           throw new InvalidAgeException("Age must be 18 or above");
       }
   }
   public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       try{
           int age = sc.nextInt();
           printAge(age);
           System.out.println("Access Granted!");

       }
       catch (InvalidAgeException e){
           System.out.println("InvalidAgeException " + e.getMessage());
       }


   }
}