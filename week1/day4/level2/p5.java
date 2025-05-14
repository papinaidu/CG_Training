import java.util.Scanner;
public class UnitConvertorYard {
	public static double convertYardsToFeet(double yards)  {
		double yards2feet = 3;
		double feet = yards * yards2feet;
		return feet;
	}
	public static double convertFeetToYards(double feet){
		double feet2yards = 0.333333;
		double yards = feet * feet2yards;
		return yards;
	}
	public static double convertMetersToInches(double meters){
		double meters2inches = 39.3701;
		double inches = meters * meters2inches;
		return inches;
	}
	public static double convertInchesToMeters(double inches){
		double inches2meters = 0.0254;
		double meters = inches * inches2meters;
		return meters;
	}
	public static double convertInchesToCm(double inches){
		double inches2cm = 2.54;
		double cm = inches * inches2cm;
		return cm;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in yards(to feet): ");
		double yards = sc.nextDouble();
		System.out.println("Enter distance in feet(to yards): ");
		double feet = sc.nextDouble();
		System.out.println("Enter distance in meters(to inches): ");
		double meters = sc.nextDouble();
		System.out.println("Enter distance in inches(to meters, to cm): ");
		double inches = sc.nextDouble();
		
		double YardsToFeet = UnitConvertorYard.convertYardsToFeet(yards);
		double FeetToYards = UnitConvertorYard.convertFeetToYards(feet);
		double MetersToInches = UnitConvertorYard.convertMetersToInches(meters);
		double InchesToMeters = UnitConvertorYard.convertInchesToMeters(inches);
		double InchesToCm = UnitConvertorYard.convertInchesToCm(inches);
		System.out.println("convert from Yards To Feet: " + YardsToFeet);
		System.out.println("convert from Feet To Yards: " + FeetToYards);
		System.out.println("convert from Meters To Inches: " + MetersToInches);
		System.out.println("convert from Inches To Meters: " + InchesToMeters);
		System.out.println("convert from Inches To Cm: " + InchesToCm);
	}
}