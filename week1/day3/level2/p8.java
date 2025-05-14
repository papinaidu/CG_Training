import java.util.Scanner;
public class ArrGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int num = sc.nextInt();
		int[] physics = new int[num];
		int[] chemistry = new int[num];
		int[] math = new int[num];
		double[] percentage = new double[num];
		String[] grade = new String[num];
		for(int i=0; i< num; i++) {
			System.out.println("Enter physics marks of student: " + (i+1));
			physics[i]= sc.nextInt();
			System.out.println("Enter chemistry marks of student: "+ (i+1));
			chemistry[i]= sc.nextInt();
			System.out.println("Enter math marks of student: "+ (i+1));
			math[i]= sc.nextInt();
		}
		for(int i=0; i< num; i++) {
			percentage[i] = (double)(physics[i] + chemistry[i] + math[i])/3;
			if(percentage[i]>=80){
				System.out.println("Grade: A, Level4, above agency-normalized standards");
			}
			else if(percentage[i] >= 70 && percentage[i] <= 89){
				System.out.println("Grade: B, Level3, at agency-normalized standards");
			}
			else if(percentage[i] >= 60 && percentage[i] <= 69){
				System.out.println("Grade: C, Level2, below,but agency-normalized standards");
			}
			else if(percentage[i] >= 50 && percentage[i] <= 59){
				System.out.println("Grade: D, Level1, well below agency-normalized standards");
			}
			else if(percentage[i] >= 40 && percentage[i] <= 49){
				System.out.println("Grade: E, Level1, too below agency-normalized standards");
			}
			else if(percentage[i] >= 39 && percentage[i] <= 0){
				System.out.println("Grade: R, Level1, d standards");
			}	
		}
	}
}