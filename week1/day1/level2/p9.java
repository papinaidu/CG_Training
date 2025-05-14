import java.util.Scanner;
public class NumRounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side1: ");
		int side1 = sc.nextInt();
		System.out.println("Enter Side2: ");
		int side2 = sc.nextInt();
		System.out.println("Enter Side3: ");
		int side3 = sc.nextInt();
		int perimeter = side1 + side2 + side3;
		int NumRounds = 5000/perimeter;
		System.out.println("The total number of rounds the athlete will run is " + NumRounds + " to complete 5 km");
	}
}
