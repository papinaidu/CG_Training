import java.util.Scanner;
public class leaplogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		if(year%400 == 0 && year%100 == 0) {
			System.out.println("Its a Leap year");
		}
		else if(year%4 == 0 && year%100 != 0) {
			System.out.println("Its a Leap year");
		}
		else {
			System.out.println("Its not a Leap year");
		}
	}
}