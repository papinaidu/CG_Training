import java.util.Scanner;
public class TotalPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price: ");
		int Unitprice = sc.nextInt();
		System.out.println("Enter quantity: ");
		int quantity = sc.nextInt();
		int TotalPrice = quantity*Unitprice;
		System.out.println("The total purchase price is INR " +TotalPrice +" if the quantity " + quantity+" and unit price is INR " + Unitprice);
	}
}