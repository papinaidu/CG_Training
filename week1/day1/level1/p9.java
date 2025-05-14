import java.util.Scanner;
public class inputfee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fee: ");
		int fee = sc.nextInt();
		System.out.println("Enter Discount: ");
		int DiscountPercent = sc.nextInt();
		int Discount = fee/DiscountPercent;
		int DiscountFee = fee - Discount;
		System.out.println("The discount amount is INR " + Discount + " and final discounted fee is INR " + DiscountFee);
	}
}