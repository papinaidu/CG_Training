public class Main {

   static void bubbleSort(int[] arr) {
       int n = arr.length;
       for(int i = 0; i < n-1; i++) {
           for(int j = 0; j < n-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   // swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
   }


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


   public static void quickSort(int[] arr, int start, int end){
       if(start >= end) return;
       int pivot = partiton(arr, start, end);
       quickSort(arr, start, pivot - 1);
       quickSort(arr, pivot + 1, end);
   }
   public static int partiton(int[] arr, int start, int end){
       int temp, idx = start-1;
       int pivot = arr[end];
       for(int i=start; i<end; i++){
           if(arr[i] < pivot){
               idx++;
               temp= arr[idx];
               arr[idx]=arr[i];
               arr[i]=temp;
           }
       }
       idx++;
       arr[end] =arr[idx];
       arr[idx]=pivot;
       return idx;
   }

   public static void main(String[] args) {
       Random rand = new Random();
       int[] sizes = {1000, 10000};
       //int target = -1;

       for (int n : sizes) {
           int[] data = rand.ints(n, 0, n * 2).toArray();
           int[] sortedData = Arrays.copyOf(data, data.length);
           Arrays.sort(sortedData);

           long start, end;


           start = System.nanoTime();
           bubbleSort(data);
           end = System.nanoTime();
           System.out.printf("Bubble Sort (%d): %.3f ms\n", n, (end - start) / 1e6);


           start = System.nanoTime();
           mergesort(data, 0, data.length - 1);
           end = System.nanoTime();
           System.out.printf("Merge Sort (%d): %.3f ms\n", n, (end - start) / 1e6);

           start = System.nanoTime();
           quickSort(data, 0,data.length - 1);
           end = System.nanoTime();
           System.out.printf("Quick Sort (%d): %.3f ms\n", n, (end - start) / 1e6);

           System.out.println();
       }
   }
}