import java.util.Scanner;
import java.lang.Math;
public class windSpeedMethod{
	public double calculateWindChill(double temperature, double windSpeed){
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * (Math.pow(windSpeed,0.16));
		return windChill;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature: ");
		double temperature = sc.nextDouble();
		System.out.println("Enter windSpeed: ");
		double windSpeed = sc.nextDouble();

		windSpeedMethod obj = new windSpeedMethod();
		double result = obj.calculateWindChill(temperature, windSpeed);
		System.out.println("windChill: "+ result);
	}
}