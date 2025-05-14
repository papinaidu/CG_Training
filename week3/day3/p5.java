public class Main {
   public static void main(String[] args) {
       int[] arr = {5,2,6,4,1,3};
       int smallest,temp;
       for(int i = 0; i < arr.length; i++){
           smallest = i;
           for(int j = i+1; j < arr.length; j++){
               if(arr[j] < arr[smallest]){
                   smallest = j;
               }
           }
           temp = arr[smallest];
           arr[smallest]=arr[i];
           arr[i] = temp;
       }
       for(int i : arr){
           System.out.print(i + " ");
       }
   }
}