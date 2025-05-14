import java.util.Scanner;
public class firstnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Third number: ");
		int num3 = sc.nextInt();
		if( num1 <= num2 && num1 <= num3) {
			System.out.println("First number is smallest");
		}
		else {
			System.out.println("First number is not smallest");
		}
	}
}