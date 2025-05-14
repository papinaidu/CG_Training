import java.util.Scanner;
public class caluculaterswitch {
public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter a operator: ");
		char op =  sc.next().charAt(0);
		
		switch (op) {
			case '+' :
				System.out.println("Addition: " + (num1 + num2));
				break;
			case '-' :
				System.out.println("Subtract: " + (num1 - num2));
				break;
			case '/' :
				System.out.println("Division: " + (num1 / num2));
				break;
			case '%' :
				System.out.println("Reminder: " + (num1 % num2));
				break;
			case '*' :
				System.out.println("Multiple: " + (num1 * num2));
				break;
		}
		sc.close();
	}
}