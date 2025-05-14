public class Main {
   static int roationSort(int[] arr, int left, int right){
       while(left < right){
           int mid = left + (right - left) / 2;
           if(arr[mid] > arr[right]){
               left = mid + 1;
           }
           else{
               right = mid;
           }
       }
       return left;
   }
   public static void main(String[] args) {
       int[] arr = {15, 18, 19, 3, 6, 12};
       int left = 0;
       int right = arr.length-1;
       int roationres = roationSort(arr, left, right);
       System.out.println("roation Index: " + roationres);
       System.out.println("roation element : " + arr[roationres]);

   }
}