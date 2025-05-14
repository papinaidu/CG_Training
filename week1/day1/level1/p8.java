import java.util.Scanner;
public class kmTOm{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Km: ");
		double km = sc.nextDouble();
		double m = km * 1.6;
		System.out.println("The total miles is " + m + " mile for the given " + km +" km");
	}
}