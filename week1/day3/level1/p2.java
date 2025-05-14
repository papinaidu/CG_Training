import java.util.Scanner;
public class numberarr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("Enter number " + (i+1));
			arr[i]= sc.nextInt();
		}
		
		for(int i=0; i<5; i++) {

			if(arr[i] > 0){
				if(arr[i]%2 == 0){
				System.out.println("Positive Number And Number is Even");
				}
				else{
				System.out.println("Positive Number And Number is odd");
				}
			}
			else if(arr[i] == 0){
				System.out.println("Number is equal to zero");
			}

			else if(arr[i] < 0){
				System.out.println("Negative number");
			}

		}
		sc.close();
	}
}