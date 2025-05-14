import java.util.Scanner;
public class arr2DBMIMethod {
	public double[][] CalculateBMI(double[][] personData){
		for(int i=0; i<10; i++) {
			personData[i][0] = personData[i][0]*0.01;
			personData[i][2] = personData[i][1] /(personData[i][0] * personData[i][0]);
		}
		return personData;
	}
	public String[] Status(double[][] personData){
		String[] weightStatus = new String[10];
		int k = 0;
		for(int i=0; i<10; i++) {
			if(personData[i][2] <= 18.4){
				weightStatus[k]= "Underweight";
			}
			else if(personData[i][2] >= 18.5 && personData[i][2] <= 24.9){
				weightStatus[k] = "Normal";
			}
			else if(personData[i][2] >= 25.0 && personData[i][2] <= 39.9){
				weightStatus[k] = "Overweight";
			}
			else if(personData[i][2] >= 40.0){
				weightStatus[k] = "Obese";
			}
			k++;
		}
		return weightStatus;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double [][] personData = new double[10][3];
		
		for(int i =0; i < 10; i++) {	
			System.out.println("Enter Height of person: " + (i+1));
			personData[i][0] = sc.nextDouble();
			
			System.out.println("Enter Weight of person: " + (i+1));
			personData[i][1] = sc.nextDouble();
		}
		
		arr2DBMIMethod obj = new arr2DBMIMethod();
		double [][] personDataResult = obj.CalculateBMI(personData);
		String[] weightStatusResult = obj.Status(personDataResult);
		for (int i = 0; i < 10; i++) {
			for(int j =0; j < 3; j++) {
            			System.out.println("BMI 2D-Array: " + personData[i][j]);
			}
			System.out.println(weightStatusResult[i]); 
			System.out.println("\n");
       	 	}
	}
}