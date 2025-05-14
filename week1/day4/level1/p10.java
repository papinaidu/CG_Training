import java.util.Scanner;
public class noofChildMethod {
	public static int[] chocolateGetsAndRem(int numberOfchocolates, int numberOfChildren){
		int gets = numberOfchocolates/numberOfChildren;
		int rem =  numberOfchocolates%numberOfChildren;
		return new int[] {gets,rem};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numberOfchocolates: ");
		int numberOfchocolates = sc.nextInt();
		System.out.println("Enter numberOfChildren: ");
		int numberOfChildren = sc.nextInt();
		
		int[] result = noofChildMethod.chocolateGetsAndRem(numberOfchocolates,numberOfChildren);
		System.out.println("Chocolates each students gets: " + result[0]);
		System.out.println("Remaining Chocolates: " + result[1]);
	}
}