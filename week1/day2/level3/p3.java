import java.util.Scanner;
public class marksAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the MathMarks: ");
		int MathMarks = sc.nextInt();
		System.out.println("Enter the PhysicsMarks: ");
		int PhysicsMarks = sc.nextInt();
		System.out.println("Enter the ChemistryMarks: ");
		int Chemistry = sc.nextInt();
		int avg =  (MathMarks+PhysicsMarks+Chemistry)/3;
		System.out.println("Average:" + avg);
		if(avg>=80){
			System.out.println("Grade: A, Level4, above agency-normalized standards");
		}
		else if(avg >= 70 && avg <= 89){
			System.out.println("Grade: B, Level3, at agency-normalized standards");
		}
		else if(avg >= 60 && avg <= 69){
			System.out.println("Grade: C, Level2, below,but agency-normalized standards");
		}
		else if(avg >= 50 && avg <= 59){
			System.out.println("Grade: D, Level1, well below agency-normalized standards");
		}
		else if(avg >= 40 && avg <= 49){
			System.out.println("Grade: E, Level1, too below agency-normalized standards");
		}
		else if(avg >= 39 && avg <= 0){
			System.out.println("Grade: R, Level1, d standards");
		}

		
	}
}