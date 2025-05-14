
import java.util.Scanner;
public class SpringSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month in Number: ");
		int month = sc.nextInt();
		System.out.println("Enter the day: ");
		int day = sc.nextInt();
		if(month == 3) {
			if(day >= 20){
				System.out.println("Its a Spring Season");
			}
			else {
			System.out.println("Its a Not Spring Season");
			}
		}
		if(month > 3 && month < 6) {
			System.out.println("Its a Spring Season");
		}
		if(month == 6) {
			if(day <= 20){
				System.out.println("Its a Spring Season");
			}
			else {
			System.out.println("Its a Not Spring Season");
			}
		}
	}
}

