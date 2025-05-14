import java.util.*;
public class Main {
   public static void main(String[] args)  {
       int[] arr = {1, 2, 3, 4, 5};
       int index = 3;
       try{
           System.out.printf("Value at index %d: %d",index, arr[index]);
       } catch (NullPointerException e) {
           System.out.println("Array is not initialized! " + e.getMessage());
       } catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Invalid index! " + e.getMessage());
       }
   }
}