import java.util.Scanner;
public class UnitConvertor {
	public static double convertKmToMiles(double km) {
		double km2miles = 0.621371;
		double miles = km * km2miles;
		return miles;
	}
	public static double convertMilesToKm(double miles){
		double miles2km = 1.60934;
		double km = miles * miles2km;
		return km;
	}
	public static double convertMetersToFeet(double meters){
		double meters2feet = 3.28084;
		double feet = meters * meters2feet;
		return feet;
	}
	public static double convertFeetToMeters(double feet){
		double feet2meters = 0.3048;
		double meters = feet * feet2meters;
		return meters;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in km(to miles): ");
		double km = sc.nextDouble();
		System.out.println("Enter distance in miles(to km): ");
		double miles = sc.nextDouble();
		System.out.println("Enter distance in meters(to feet): ");
		double meters = sc.nextDouble();
		System.out.println("Enter distance in feet(to meters): ");
		double feet = sc.nextDouble();
		
		double KmToMiles = UnitConvertor.convertKmToMiles(km);
		double MilesToKm = UnitConvertor.convertMilesToKm(miles);
		double MetersToFeet = UnitConvertor.convertMetersToFeet(meters);
		double FeetToMeters = UnitConvertor.convertFeetToMeters(feet);
		System.out.println("convert from Km To Miles: " + KmToMiles);
		System.out.println("convert from Miles To Km: " + MilesToKm);
		System.out.println("convert from Meters To Feet: " + MetersToFeet);
		System.out.println("convert from Feet To Meters: " + FeetToMeters);
	}
}