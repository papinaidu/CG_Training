import java.util.Scanner;
public class Pounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in Pounds: ");
		double pounds = sc.nextDouble();
		double kg = pounds/2.2;
		System.out.println("The weight of the person in pound is " + pounds + " and in kg is " + kg);
	}
}