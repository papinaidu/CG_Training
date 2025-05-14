public class Main {
   public static void main(String[] args) {
       int[] id = {89,45,99,30,67,78,59,61};
       int key,j;
       for (int i = 1; i < id.length; i++) {
           key = id[i];
           j=i-1;
           while (j>=0 && id[j]<key){
                   id[j+1] = id[j];
                   j--;
           }
           id[j+1] = key;
       }
       for(int n : id){
           System.out.print(n + " ");
       }
   }
}