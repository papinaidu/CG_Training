import java.util.Scanner;
public class Armstrong {
public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
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
			System.out.println("Number is a Armstrong number");
		}
		else {
			System.out.println("Number is not a Armstrong number");
		}
	}
}