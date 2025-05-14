import java.util.Scanner;
public class UnitConvertorTemp {
	public static double convertFarhenheitToCelsius(double farhenheit)  {
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;
	}
	public static double convertCelsiusToFarhenheit(double celsius){
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
	public static double convertPoundsToKilograms(double pounds){
		double pounds2kilograms = 0.453592;
		double kilograms = pounds * pounds2kilograms;
		return kilograms;
	}
	public static double convertKilogramsToPounds(double kilograms){
		double kilograms2pounds = 2.20462;  
		double pounds = kilograms * kilograms2pounds;
		return pounds;
	}
	public static double convertGallonsToLiters(double gallons){
		double gallons2liters = 3.78541; 
		double liters = gallons * gallons2liters;
		return liters;
	}
	public static double convertLitersToGallons(double liters){
		double liters2gallons = 0.264172; 
		double gallons = liters * liters2gallons;
		return gallons;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in farhenheit(to celsius): ");
		double farhenheit = sc.nextDouble();
		System.out.println("Enter temperature in celsius(to farhenheit): ");
		double celsius = sc.nextDouble();
		System.out.println("Enter distance in pounds(to kilograms): ");
		double pounds = sc.nextDouble();
		System.out.println("Enter distance in kilograms(to pounds): ");
		double kilograms = sc.nextDouble();
		System.out.println("Enter distance in gallons(to liters): ");
		double gallons = sc.nextDouble();
		System.out.println("Enter distance in liters(to gallons): ");
		double liters = sc.nextDouble();
		
		double FarhenheitToCelsius = UnitConvertorTemp.convertFarhenheitToCelsius(farhenheit);
		double CelsiusToFarhenheit = UnitConvertorTemp.convertCelsiusToFarhenheit(celsius);
		double PoundsToKilograms = UnitConvertorTemp.convertPoundsToKilograms(pounds);
		double KilogramsToPounds = UnitConvertorTemp.convertKilogramsToPounds(kilograms);
		double GallonsToLiters = UnitConvertorTemp.convertGallonsToLiters(gallons);
		double LitersToGallons = UnitConvertorTemp.convertLitersToGallons(liters);
		System.out.println("convert from Farhenheit To Celsius: " + FarhenheitToCelsius);
		System.out.println("convert from Celsius To Farhenheit: " + CelsiusToFarhenheit);
		System.out.println("convert from Pounds To Kilograms: " + PoundsToKilograms);
		System.out.println("convert from Kilograms To Pounds: " + KilogramsToPounds);
		System.out.println("convert from Gallons To Liters: " + GallonsToLiters);
		System.out.println("convert from Liters To Gallons: " + LitersToGallons);
	}
}