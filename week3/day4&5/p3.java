public class Main {
   public static void main(String[] args) {
       StringBuilder obj = new StringBuilder();
       String[] arr = {"Hello"," World"," My", " Name", " Is", " Naidu"};
       for(String s : arr){
           obj.append(s);
       }
       System.out.println(obj.toString());
   }
}