import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Main {
   public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
       if(amount<0 || rate<0){
           throw new IllegalArgumentException("Amount or rate must be non-negative");
       }
       return (amount*rate*years)/100;
   }
   public static void main(String[] args)  {
       double amount = 4000;
       double rate = -1;
       int years = 3;
       try{
           double res = calculateInterest(amount,rate,years);
           System.out.println(res);
       }catch (IllegalArgumentException e){
           System.out.println("Invalid input: " + e.getMessage() );
           e.printStackTrace();
       }
   }
}