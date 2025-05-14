import java.util.Scanner;
public class triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base: ");
		int base = sc.nextInt();
		System.out.println("Enter height: ");
		int height = sc.nextInt();
		double area = (double) 1/2 * base * height;
		System.out.println("Height in cm is " + height + " base is " + base + " and area of triangle in square centimeters " + area + " area in square inches " + area/6.4516);
	}
}