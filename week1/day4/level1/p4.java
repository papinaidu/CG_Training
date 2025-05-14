import java.util.Scanner;
public class TriangularPark {
	public int Distance(int side1, int side2, int side3){
		int perimeter = side1 + side2 + side3;
    		int distance = 5000/perimeter;
		return distance;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side of triangle:");
		int side1 = sc.nextInt();
		System.out.println("Enter second side of triangle:");
		int side2 = sc.nextInt();
		System.out.println("Enter third side of triangle:");
		int side3 = sc.nextInt();
		
		TriangularPark obj = new TriangularPark();
		int ans = obj.Distance(side1, side2, side3);
		System.out.println("Number of rounds athlete has to do to cover 5km: " + ans);
	}
}