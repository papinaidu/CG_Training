import java.util.Scanner;
public class arr2DBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of people: ");
		int num = sc.nextInt();
		double [][] personData = new double[num][3];
		String[] weightStatus = new String[num];
		for(int i =0; i < num; i++) {	
			System.out.println("Enter Height of person: " + (i+1));
			personData[i][0] = sc.nextDouble();
			
			System.out.println("Enter Weight of person: " + (i+1));
			personData[i][1] = sc.nextDouble();
		}
		for(int i=0; i<num; i++) {
			personData[i][0] = personData[i][0]*0.01;
			personData[i][2] = personData[i][1] /(personData[i][0] * personData[i][0]);
		}
		int k = 0;
		for(int i=0; i<num; i++) {
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
		for (int i = 0; i < num; i++) {
			for(int j =0; j < 3; j++) {
            			System.out.println("BMI 2D-Array: " + personData[i][j]);
			}
			System.out.println(weightStatus[i]); 
			System.out.println("\n");
       	 	}
	}
}