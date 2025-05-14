import java.util.Scanner;
public class Volume {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		float radius = sc.nextFloat();
		System.out.println("Enter height: ");
		float height = sc.nextFloat();
		double volume = 3.14 * radius * radius * height;
		System.out.println("Volume of cylinder: " + volume);
	}
}