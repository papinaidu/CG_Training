import java.util.Scanner;
public class NumberChecker{
	public static int Count(int num){
		int count=0;
		for(int temp = num; temp != 0; temp /= 10){
			count++;
		}
		return count;
	}
	public static int[] digitArr(int num){
		int count=0;
		for(int temp = num; temp != 0; temp /= 10){
			count++;
		}
		int[] arr = new int[count];
		int i =0;
		for(int temp = num; temp != 0; temp /= 10){
			arr[i] = (int) temp%10;
			i++;
		}
		return arr;
	}
	public static int DuckNum(int[] arr){
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0){
				return 1;
			}
			else{
				return 0;
			}
		}
		 return 0; 
	}
	public static int armstrongNum(int num){
		double sum = 0;
		int count = 0;
		int digit;
		int temp = num;
		int temp1 = num;
		while(temp != 0) {
			temp=temp/10;
			count++;
		}
		while(temp1 != 0) {
			digit=temp1 %10;
			sum += Math.pow(digit,count);
			temp1 = temp1/10;
		}
		if(sum==num){
			return 1;
		}
		else {
			return 0;
		}
		
	}
	public static int[] LargestNumMethod (int[] arr){
		int large = Integer.MIN_VALUE ;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > large) {
				large = arr[i];
			}		
		}
		int Seclarge = Integer.MIN_VALUE ;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > Seclarge && arr[i] != large) {
				Seclarge = arr[i];
			}		
		}
		return new int[]{large, Seclarge};
	}
	public static int[] SmallestNumMethod (int[] arr){
		int small = Integer.MAX_VALUE ;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < small) {
				small = arr[i];
			}		
		}
		int Secsmall = Integer.MAX_VALUE ;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < Secsmall && arr[i] != small) {
				Secsmall = arr[i];
			}		
		}
		return new int[]{small, Secsmall};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int  CountResult = NumberChecker.Count(num);
		int[] digitArrResult = NumberChecker.digitArr(num);
		int DuckNumResult = NumberChecker.DuckNum(digitArrResult);
		int armstrongNumResult = NumberChecker.armstrongNum(num);
		int[] LargestNumMethodResult = NumberChecker.LargestNumMethod(digitArrResult);
		int[] SmallestNumMethodResult = NumberChecker.SmallestNumMethod(digitArrResult);
		System.out.println("Count: "+ CountResult);
		for(int i=0; i<digitArrResult.length; i++){
			System.out.println("Digit Arr: "+ digitArrResult[i]);
		}
		if(DuckNumResult == 1){
   			 System.out.println("Number is a Duck number.");
		} else {
    		System.out.println("Number is not a Duck number.");
		}

		if(armstrongNumResult == 1){
			System.out.println("number is a Armstrong number");
		}else {
			System.out.println("number is not a Armstrong number");
		}
		System.out.println("Largest number: " + LargestNumMethodResult[0]);
		System.out.println("Second Largest number: " + LargestNumMethodResult[1]);
		System.out.println("Smallest number: " + SmallestNumMethodResult[0]);
		System.out.println("Second Smallest number: " + SmallestNumMethodResult[1]);
	}
}