import java.util.Scanner;
public class feet{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance in feet: ");
		double  feet = sc.nextDouble();
		double miles  = feet/5280;
		double yards =  feet/3;
		System.out.println("Distance in feet " + feet  + " in miles is " + miles + " and in yards is " + yards);
	}
}