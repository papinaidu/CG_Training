import java.util.Scanner;
public class bonusArr {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double[]  salary = new double[10];
		double[] service = new double[10];
		double[] bonus = new double[10];
		for(int i=0; i<10; i++) {
			System.out.println("Enter Salary of Employee " + (i+1));
			salary[i]= sc.nextDouble();
			System.out.println("Enter service (in years) of Employee " + (i+1));
			service[i]= sc.nextDouble();
		}
		System.out.println(salary[0]);
		for(int i=0; i<10; i++) {
			if(service[i] >= 5) {
				bonus[i] = salary[i] * 0.05;	
			} 
			else {
				bonus[i] = salary[i] * 0.02;

			}
		}
		System.out.println(salary[0]);
		for(int i=0; i<10; i++) {
			System.out.println("\nEmployee " + (i + 1) + ":");
          		System.out.printf("Old Salary: %.2f%n", salary[i]);
            		System.out.printf("Bonus: %.2f%n", bonus[i]);
            		System.out.printf("New Salary: %.2f%n", (salary[i] + bonus[i]));
		}
	}
}