import java.util.Scanner;
public class bonus {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary: ");
		double Salary = sc.nextDouble();
		System.out.println("Enter the Years of service: ");
		int years = sc.nextInt();
		if(years >= 5) {
			double bonus = Salary * 0.5;
			System.out.println("Bonus " + bonus);		
		} 
		else {
			System.out.println("Not eligible for bonus");	
		}
	}
}