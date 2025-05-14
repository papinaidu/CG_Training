public class fee {
	public static void main(String[] args) {
		int fee = 125000;
		int DiscountPercent = 10;
		int Discount = fee/DiscountPercent;
		int DiscountFee = fee - Discount;
		System.out.println("The discount amount is INR " + Discount + " and final discounted fee is INR " + DiscountFee);
	}
}