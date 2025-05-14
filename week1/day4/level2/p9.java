import java.util.Scanner;
public class CheckNumMethode {
	public int isPositive(int num){
		if(num<0){
			return -1;
		}
		if(num==0){
			return 0;
		}
		if(num>0){
			return 1;
		}
	return 0;
	}
	public void isEven(int num){
		if(num > 0){
			if(num%2 == 0){
				System.out.println("Positive Number And Number is Even");
			}
			else{
				System.out.println("Positive Number And Number is odd");
			}
		}
	}
	public int compare(int num1, int num2){
		if(num1 > num2){
			return 1;
		}
		if(num1 == num2){
			return 0;
		}
		if(num1 < num2){
			return -1;
		}
		return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter "+ (i+1) + " Number: ");
    			arr[i] = sc.nextInt(); 
		}

		CheckNumMethode obj = new CheckNumMethode();
		for(int i = 0; i < 5; i++){
			int isPositiveResult = obj.isPositive(arr[i]); 
			if(isPositiveResult>0){
				System.out.println("Positive Number");
				obj.isEven(arr[i]);
			}
			else {
				continue;
			}
			if(i <4){
				int compareResult = obj.compare(arr[i], arr[i+1]);
				if(compareResult>0){
					System.out.println(arr[i] + " Is greater than " + arr[i+1]);
				}
				if(compareResult<0){
					System.out.println(arr[i] + " Is Less than " + arr[i+1]);
				}
				if(compareResult == 0){
					System.out.println(arr[i] + " Both are equal " + arr[i+1]);
				}
			}
		}
	}
}