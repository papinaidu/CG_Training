import java.util.Scanner;
public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal: ");
		double principal = sc.nextDouble();
		System.out.println("Enter rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter time: ");
		int time = sc.nextInt();
		double SI = (principal * rate * time)/100;
		System.out.println("The Simple Interest is " + SI +" for Principal " + principal + " Rate of Interest " + rate + " and Time " + time);
	}
}