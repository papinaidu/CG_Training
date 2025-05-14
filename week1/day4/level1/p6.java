import java.util.Scanner;
public class SpringSeasonMethod {
	public Boolean Spring(int month, int day){
		if(month == 3) {
			if(day >= 20){
				return true;
			}
			else {
				return false;
			}
		}
		if(month > 3 && month < 6) {
			return true;
		}
		if(month == 6) {
			if(day <= 20){
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month in Number: ");
		int month = sc.nextInt();
		System.out.println("Enter the day: ");
		int day = sc.nextInt();
		
		SpringSeasonMethod obj = new SpringSeasonMethod();
		if(obj.Spring(month, day)){
			System.out.println("Its a spring season");
		}
		else {
			System.out.println("Its not a spring season");
		}
	}
}