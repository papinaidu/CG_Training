import java.util.Scanner;
public class IntOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		System.out.println("Enter Third number: ");
		int c = sc.nextInt();
		System.out.println("The results of Int Operations are a + b *c: " + (a + b *c)  + "\n a * b + c: " + (a * b + c) + "\n c + a / b: " + (c + a / b) + "\n a % b + c: " + a % b + c);
	}
}