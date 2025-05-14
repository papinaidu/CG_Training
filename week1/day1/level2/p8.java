import java.util.Scanner;
public class travel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fromCity: ");
		String fromCity = sc.nextLine();
		System.out.println("Enter viaCity: ");
		String viaCity = sc.nextLine();
		System.out.println("Enter toCity: ");
		String toCity = sc.nextLine();
		System.out.println("Enter ToVia in Miles: ");
		double ToVia = sc.nextDouble();
		System.out.println("Enter viaToFinalCity in Miles: ");
		double viaToFinalCity = sc.nextDouble();
		System.out.println("Enter timeFromToVia: ");
		int timeFromToVia = sc.nextInt();
		System.out.println("Enter timeViaToFinalCity: ");
		int timeViaToFinalCity = sc.nextInt();
		double totalDistance = viaToFinalCity + ToVia;
		int totalTime = timeFromToVia + timeViaToFinalCity;
		System.out.println("The Total Distance travelled by John from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
	}
}