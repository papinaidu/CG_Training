import java.util.Scanner;
public class naturalnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if (num > 0) {
			int sum = num * (num + 1) /2;
			System.out.println("The Sum First " + num + " natural numbers is " + sum);
		}
		else {
			System.out.println("The Number " + num + " is not a natural number ");
		}
	}
}