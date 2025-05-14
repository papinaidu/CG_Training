
import java.util.Scanner;	
public class StudentVoteChecker {
	public boolean canStudentVote(int age) {
		if (age  >= 18){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++){
			System.out.println("Enter age of the Student " + (i+1));
			arr[i] = sc.nextInt();
		}

		StudentVoteChecker obj= new StudentVoteChecker();
		for(int i=0; i<num; i++){
			int age = arr[i];
			if(obj.canStudentVote(age)){
				System.out.println("Student " +(i+1)+ " can Vote");
			}
			else{
				System.out.println("Student " +(i+1)+ " can not Vote");
			}
		}
		
	}
}

