public class Main {
   public static int fibonacciRecursive(int n) {
       if (n <= 1) return n;
       return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
   }
   public static int fibonacciIterative(int n) {
       int a = 0, b = 1, sum;
       for (int i = 2; i <= n; i++) {
           sum = a + b;
           a = b;
           b = sum;
       }
       return b;
   }
   public static void main(String[] args) {
       long startTime = System.currentTimeMillis();
       fibonacciRecursive(10);
       long endTime = System.currentTimeMillis();
       System.out.println("fibonacciRecursive (n=10): " + (endTime - startTime));

       startTime = System.currentTimeMillis();
       fibonacciIterative(10);
       endTime = System.currentTimeMillis();
       System.out.println("fibonacciIterative (n=10): " + (endTime - startTime));

       System.out.println();

       startTime = System.currentTimeMillis();
       fibonacciRecursive(30);
       endTime = System.currentTimeMillis();
       System.out.println("fibonacciRecursive (n=30): " + (endTime - startTime));

       startTime = System.currentTimeMillis();
       fibonacciIterative(30);
       endTime = System.currentTimeMillis();
       System.out.println("fibonacciIterative (n=30): " + (endTime - startTime));

       System.out.println();

       startTime = System.currentTimeMillis();
       fibonacciRecursive(40);
       endTime = System.currentTimeMillis();
       System.out.println("fibonacciRecursive (n=40): " + (endTime - startTime));

       startTime = System.currentTimeMillis();
       fibonacciIterative(40);
       endTime = System.currentTimeMillis();
       System.out.println("fibonacciIterative (n=40): " + (endTime - startTime));
   }
}