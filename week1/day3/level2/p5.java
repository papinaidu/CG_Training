import java.util.Scanner;
public class digitArrReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter A Number: ");
		int num = sc.nextInt();
		int maxDigit= 5, index;
		int[] arr = new int[maxDigit];
		int count = 0;
		for(int temp= num; temp != 0; temp = temp /10 ) {
			count++;
		}
		int temp= num;
		for(int i = 0; i < count; i++) {
			if(i==maxDigit){
				maxDigit += 10;
				int[] dynamic = new int[maxDigit];
				for(int j=0; j<arr.length; j++){
					dynamic[j] = arr[j];
				}
				arr=dynamic;
			}
			arr[i]  = temp %10;
			temp = temp /10;
		}
		int j = count-1;
		int temp1;
		for(int i = 0; i < count/2; i++) {
			temp1 = arr[i];
			arr[i] = arr[j];
			arr[j] = temp1;
			j--;
					
		}
		for(int i = 0; i < count; i++) {
			System.out.println("Reverse Digit Array: " + arr[i]);
					
		}
	}
}