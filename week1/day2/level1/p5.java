import java.util.Scanner;
public class vote {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("The person can Vote");		
		} 
		else {
			System.out.println("The person cannot Vote");	
		}
	}
}