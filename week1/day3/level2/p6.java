import java.util.Scanner;
public class ArrBMI {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of persons: ");
		int num = sc.nextInt();
		double[]  weight = new double[num];
		double[] height = new double[num];
		double[] BMI = new double[num];
		for(int i=0; i<num; i++) {
			System.out.println("Enter weight of person " + (i+1));
			weight[i]= sc.nextDouble();
			System.out.println("Enter Height of person " + (i+1));
			height[i]= sc.nextDouble();
		}

		for(int i=0; i<num; i++) {
			height[i] = height[i]*0.01;
			BMI[i] = weight[i] /(height[i] * height[i]);
		}

		for(int i=0; i<num; i++) {
			if(BMI[i] <= 18.4){
				System.out.println("Underweight");
			}
			else if(BMI[i] >= 18.5 && BMI[i] <= 24.9){
				System.out.println("Normal");
			}
			else if(BMI[i] >= 25.0 && BMI[i] <= 39.9){
				System.out.println("Overweight");
			}
			else if(BMI[i] >= 40.0){
				System.out.println("Obese");
			}
		}
	}
}