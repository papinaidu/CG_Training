import java.util.Scanner;
public class DoubleOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		double a = sc.nextDouble();
		System.out.println("Enter Second number: ");
		double b = sc.nextDouble();
		System.out.println("Enter Third number: ");
		double c = sc.nextDouble();
		System.out.println("The results of Int Operations are a + b *c: " + (a + b *c)  + "\n a * b + c: " + (a * b + c) + "\n c + a / b: " + (c + a / b) + "\n a % b + c: " + (a % b + c));
	}
}