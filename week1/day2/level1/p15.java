import java.util.Scanner;
public class factorialfor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int factorial = 1;
		for(int i =num; num >= 1; i--) {
			factorial = factorial * num;
			num--;
		}
		System.out.println(factorial);
	}
}