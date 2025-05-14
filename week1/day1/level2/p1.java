import java.util.Scanner;
public class moduil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		double num1 = sc.nextDouble();
		System.out.println("Enter Second number: ");
		double num2 = sc.nextDouble();
		double Quotient = num1/num2;
		double Reminder = num1%num2;
		System.out.println("The Quotient is " + Quotient + " and Reminder is " + Reminder + " of two number " + num1 + " and " + num2);
	}
}