import java.util.Scanner;
public class PC {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base value: ");
		double base = sc.nextDouble();
		System.out.println("Enter Exponent value ");
		double exponent = sc.nextDouble();
		double ans = Math.pow(base,exponent);
		System.out.println("Result: " + ans);
	}
}