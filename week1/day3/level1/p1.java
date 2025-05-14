import java.util.Scanner;
public class votearr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			System.out.println("Enter age of Student " + (i+1));
			arr[i]= sc.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			if(arr[i] >= 18){
				System.out.println("Student " + (i+1) + " Can Vote");
			}
			else{
				System.out.println("Student " + (i+1) + " Can not Vote");
			}
		}
		sc.close();
	}
}