import java.util.Scanner;
public class arr2Darr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr2D = new int[3][3];
		int[] arr = new int[9];
		int k = 0;
		for(int i =0; i < 3; i++) {	
			for(int j =0; j < 3; j++) {
				System.out.println("Enter the number for Position: " + i + ", " + j);
				arr2D[i][j] = sc.nextInt();
				arr[k] = arr2D[i][j];
				k++;
			}
		}
		for (int i = 0; i < k; i++) {
            		System.out.println("1D-Array: " + arr[i]);
       	 	}
	}
}