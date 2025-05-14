import java.util.Scanner;
public class MethodSI {
	public double SI (int principal, int rate, int time){
		double result = (double) principal*rate*time/100;
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount:");
		int principal = sc.nextInt();
		System.out.println("Enter rate:");
		int rate = sc.nextInt();
		System.out.println("Enter time:");
		int time = sc.nextInt();
		
		MethodSI obj = new MethodSI();
		double ans = obj.SI(principal,rate,time);
		System.out.printf("The Simple Interest is %.2f for Principal %d, Rate of Interest %d and Time %d\n", ans, principal, rate, time);
	}
}