import java.util.Scanner;
import java.util.Arrays;
public class factorarr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int maxIndex = 10, index=0;
		int[] arr = new int[maxIndex];
		for(int i =1; i <= num; i++) {
			if(num%i == 0){
				arr[index]=i;
				index++;
				if(index == maxIndex ){
					maxIndex = maxIndex * 2;
                    			arr = Arrays.copyOf(arr, maxIndex);
				}
			}
		}
		for (int i = 0; i < index; i++) {
            		System.out.println("Factors array: " + arr[i]);
       	 	}
	}
}