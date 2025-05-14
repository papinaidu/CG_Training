import java.util.Scanner;
import java.lang.Math;
public class trigonometry {
	public double[] calculateTrigonometricFunctions(double angle){
		double radians = Math.toRadians(angle);
		double sinValue = Math.sin(radians);
		double cosValue = Math.cos(radians);
		double tanValue = Math.tan(radians);
		return new double[] {sinValue, cosValue, tanValue};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle: ");
		double angle = sc.nextDouble();
		
		trigonometry obj = new trigonometry();
		double[] result = obj.calculateTrigonometricFunctions(angle);
		System.out.println("sinValue: " + result[0]);
		System.out.println("cosValue: " + result[1]);
		System.out.println("tanValue: " + result[2]);
	}
}