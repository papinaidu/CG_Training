import java.util.Scanner;
public class TotalIncome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary: ");
		int salary  = sc.nextInt();
		System.out.println("Enter bonus: ");
		int bonus  = sc.nextInt();
		int TotalIncome = salary + bonus;
		System.out.println("The salary is INR " + salary +" and bonus is INR " + bonus + " Hence Total Income is INR " + TotalIncome);
	}
}