import java.util.Scanner;
public class farenheitResult  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius: ");
		double Celsius  = sc.nextDouble();
		double Fahrenheit = (Celsius*9/5)+32;
		System.out.println("The " + Celsius+ " Celsius is " + Fahrenheit + " fahrenheit");
	}
}