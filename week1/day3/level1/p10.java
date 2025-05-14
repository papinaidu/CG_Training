import java.util.Scanner;
public class fizzArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int k = 0;
		if(num <=0) {
			System.err.println("Invalid Input");
			System.exit(0);
		}
		String[] arr = new String[num];
		for(int i=1; i<=num;i++){
			if(i%3==0 && i%5==0){
				arr[k]="FizzBuzz";
			}
			else if (i%3==0){
				arr[k] = "Fizz";
			}
			else if (i%5==0){
				 arr[k] = "Buzz";
			}
			else {
				arr[k] = Integer.toString(i);
			}
			k++;
		}
		for (int i = 0; i < k; i++) {
            		System.out.println("Position "+ (i+1) + ": " + arr[i]);
       	 	}
	}
}