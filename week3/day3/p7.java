public class Main {
   public static void main(String[] args) {
       int[] arr = {5,2,6,4,1,3};
       int count[]=new int[7] ;
       int max,temp;
       max = arr[0];
       for(int i = 0; i < arr.length; i++){
           max = Math.max(max, arr[i]);
       }
       for(int i = 0; i < arr.length; i++){
           count[arr[i]]++;
       }
       temp = count[0];
       for(int i = 1; i < count.length; i++){
           temp = temp + count[i];
           count[i] = temp;
       }
       int p,tmp;
       for(int i = 0; i < arr.length; i++){
           p = count[arr[i]];
           p = p-1;
           tmp = arr[p];
           arr[p] = arr[i];
           arr[i] = tmp;
       }
       for(int i : arr){
           System.out.print(i + " ");
       }
   }
}