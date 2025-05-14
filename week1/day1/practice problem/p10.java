import java.util.Scanner;
public class KtoM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter kilometers: ");
		float km = sc.nextFloat();
		double miles = km * 0.621371;
		System.out.println("KM to miles: " + miles);
	}
}