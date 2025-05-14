import java.util.Scanner;
public class largestnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Third number: ");
		int num3 = sc.nextInt();
		if( num1 >= num2 && num1 >= num3) {
			System.out.println("First number is Largest");
		}
		if( num2 >= num1 && num2 >= num3) {
			System.out.println("Second number is Largest");
		}
		if( num3 >= num1 && num3 >= num2) {
			System.out.println("Third number is Largest");
		}

	}
}