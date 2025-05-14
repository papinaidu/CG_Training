import java.util.Scanner;
public class CtoF {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		float num = sc.nextFloat();
		float Fahrenheit = (num * 9/5) + 32;
		System.out.println("Temperature in Fahrenheit: " + Fahrenheit);
	}
}