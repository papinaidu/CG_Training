import java.util.Scanner;
public class moduilMethod{
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int Quotient = number/divisor;
		int Reminder = number%divisor;
		return new int[] {Quotient, Reminder};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		System.out.println("Enter divisor number: ");
		int divisor = sc.nextInt();
		
		int[] result = moduilMethod.findRemainderAndQuotient(number, divisor);
		System.out.println("Qutient: " + result[0]);
		System.out.println("Reminder: " + result[1]);
	}
}