public class Main {
   public static void main(String[] args)  {
       int arr[] = {2,4,6,8};
       int divisor = 2;
       int index = 6;
       try{
           try {
               int res = arr[index]/divisor;
               System.out.println(res);
           } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Invalid array index! " + e.getMessage());
           }

       }
       catch (ArithmeticException e){
           System.out.println("Cannot divide by zero! " + e.getMessage());
       }

       finally {
           System.out.println("Operation Completed");
       }
   }
}