import java.util.Scanner;
public class celsiusResult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit: ");
		double Fahrenheit  = sc.nextDouble();
		double Celsius = (Fahrenheit-32)*5/9;
		System.out.println("The " + Fahrenheit + " fahrenheit is " + Celsius + " Celsius ");
	}
}