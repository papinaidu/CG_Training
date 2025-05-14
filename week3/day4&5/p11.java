public class Main {
   public static  void main(String[] args){
       int[] arr = {6,5,2,-1,7,3,4,2,-3};
       boolean ans = true;
       for(int i=0; i<arr.length; i++){
           if(arr[i]<0){
               ans = false;
               System.out.println(arr[i]);
               break;
           }
       }
       if(ans){
           System.out.println("-ve Number is not present: -1");
       }
   }
}