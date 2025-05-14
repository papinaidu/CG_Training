public class Main {
   public static void main(String[] args) {
       int[] marks = {89,45,99,30,67,78,59,61};
       int temp;
       for(int i = 0; i < marks.length; i++){
           for(int j = 0; j < marks.length; j++){
               if(marks[i] >= marks[j]){
                   temp = marks[i];
                   marks[i] = marks[j];
                   marks[j] = temp;
               }
           }
       }
       for(int n : marks){
           System.out.print(n + " ");
       }
   }
}