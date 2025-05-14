import java.util.Scanner;
public class Harshad {
public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		int sum = 0;
		int digit = 0;
		while(temp != 0) {
			digit=temp%10;
			sum +=digit;
			temp = temp/10;
		}
		if(num%sum==0){
			System.out.println("Number is a Harshad  number");
		}
		else {
			System.out.println("Number is not a Harshad  number");
		}
	}
}