import java.util.Scanner;
public class BMI {
public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in kg: ");
		int weight = sc.nextInt();
		System.out.println("Enter your height in cm: ");
		double height = sc.nextDouble();
		height = (double)height*0.01;
		double BMI = weight/(height*height);
		System.out.println(BMI);
		if(BMI <= 18.4){
			System.out.println("Underweight");
		}
		else if(BMI >= 18.5 && BMI <= 24.9){
			System.out.println("Normal");
		}
		else if(BMI >= 25.0 && BMI <= 39.9){
			System.out.println("Overweight");
		}
		else if(BMI >= 40.0){
			System.out.println("Obese");
		}	
	}
}