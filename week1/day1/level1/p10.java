import java.util.Scanner;
public class height{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		double inches  = height/2.54;
		int feet =  (int) inches/12;
		double rem = inches % 12;
		System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + rem);
	}
}