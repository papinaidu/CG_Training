public class Main {
   public static void mergesort(int[] arr, int left, int right ){
       int mid = left + (right - left) / 2;
       if(left>=right) return;
       mergesort(arr, left, mid);
       mergesort(arr, mid+1, right);
       merge(arr, left, mid, right);

   }
   public static void merge(int[] arr, int left, int mid, int right){
       int[] mergearr = new int[right - left + 1];
       int n1 = left;
       int n2 = mid + 1;
       int k=0;


       while(n1<=mid && n2<=right){
           if(arr[n1] <= arr[n2]){
               mergearr[k++] = arr[n1++];
           }
           else{
               mergearr[k++] = arr[n2++];
           }
       }
       while(n1<=mid){
           mergearr[k++] = arr[n1++];
       }
       while(n2<=right){
           mergearr[k++] = arr[n2++];
       }

       for(int x = 0; x < mergearr.length; x++){
           arr[left + x] = mergearr[x];
       }




   }
   public static void main(String[] args) {
       int[] arr = {10,12,3,49,54,68,99,60,43,100};
       int n = arr.length;
       mergesort(arr, 0, n-1);
       for(int i : arr){
           System.out.print(i + " ");
       }
   }
}