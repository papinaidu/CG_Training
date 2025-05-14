import java.util.Scanner;
public class caluculater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + (num1 + num2) +", " + (num1 - num2) + ", " + (num1*num2) +" and " + num1/num2);
	}
}
