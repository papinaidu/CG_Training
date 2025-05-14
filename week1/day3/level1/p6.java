import java.util.Scanner;
public class foodballmean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[11];
		for(int i=0; i<11; i++) {
			System.out.println("Enter Height of FootBall Player " + (i+1));
			arr[i]= sc.nextInt();
		}
		
		int sum = 0;
        	for (int j = 0; j < 11; j++) {
            		sum += arr[j];
       	 	}
		int mean = sum/11;
        	System.out.println("Mean Height of all FootBall Player: " + mean);
		sc.close();
	}
}