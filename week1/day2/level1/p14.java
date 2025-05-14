import java.util.Scanner;
public class factorialwhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int factorial = 1;
		while(num >= 1) {
			factorial = factorial * num;
			num--;
		}
		System.out.println(factorial);
	}
}