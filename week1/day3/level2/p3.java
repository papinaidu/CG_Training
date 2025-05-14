import java.util.Scanner;
public class digitArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter A Number: ");
		int num = sc.nextInt();
		int count = 0;
		for(int temp= num; temp != 0; temp = temp /10 ) {
			count++;
		}
		int[] arr = new int[count];
		int temp= num;
		for(int i = 0; i < count; i++) {
			arr[i]  = temp %10;
			temp = temp /10;
		}
		int large = arr[0] ;
		for(int i = 0; i < count; i++) {
			System.out.println("Digit Array: " + arr[i]);
			if(arr[i] > large) {
				large = arr[i];
			}		
		}
		System.out.println("Largest element: "+ large);
		int Seclarge = -1 ;
		for(int i = 0; i < count; i++) {
			if(arr[i] > Seclarge && arr[i] != large) {
				Seclarge = arr[i];
			}		
		}
		System.out.println("Second Largest element: "+ Seclarge);
	}
}