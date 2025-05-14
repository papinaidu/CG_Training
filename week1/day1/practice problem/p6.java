import java.util.Scanner;
public class SI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		float principal = sc.nextFloat();
		System.out.println("Enter Rate: ");
		float rate = sc.nextFloat();
		System.out.println("Enter Time: ");
		float time = sc.nextFloat();
		double SI = (principal * rate * time) / 100;
		System.out.println("Simple Intrest: " + SI);
	}
}