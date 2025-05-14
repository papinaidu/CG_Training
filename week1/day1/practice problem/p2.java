import java.util.Scanner;
public class Add {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		System.out.println("Sum of tow numbers: " + (a+b));
	}
}