import java.util.Scanner;
public class numberOfChildren {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numberOfchocolates: ");
		int numberOfchocolates = sc.nextInt();
		System.out.println("Enter numberOfChildren: ");
		int numberOfChildren = sc.nextInt();
		int gets = numberOfchocolates/numberOfChildren;
		int rem =  numberOfchocolates%numberOfChildren;
		System.out.println("The number of chocolates each child gets is " + gets + " and the number of remaining chocolates are " + rem);
	}
}