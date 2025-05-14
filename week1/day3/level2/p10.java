import java.util.Scanner;
public class frequencyarr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int count=0;
		for(int temp = num; temp !=0; temp= temp/10){
			count++;
		}
		int[] arr = new int[count];
		int[] freq = new int[count];
		int k =0;
		for(int temp = num; temp !=0; temp= temp/10) {
			arr[k] = temp%10;
			k++;
		}
		
		for(int i =0; i< count; i++){
			int sum=0;
			for(int j =0; j< count; j++){
				if(arr[i] == arr[j]){
					sum++;
				}
			}
			freq[i] = sum;
		}
		for(int i=0; i<count; i++){
			System.out.println("Frequency of digit:" + (i+1) + ": "+ freq[i]);
		}
	}
}