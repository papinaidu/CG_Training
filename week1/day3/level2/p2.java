import java.util.Scanner;
public class AmarArr {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]  age = new int[3];
		int[] height = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("Enter Age " + (i+1));
			age[i]= sc.nextInt();
			System.out.println("Enter Height  " + (i+1));
			height[i]= sc.nextInt();
		}
		int tempAge = age[0];
		int tempHeight = height[0];
		for(int i=0; i<3; i++) {
			if(age[i] < tempAge ){
				tempAge = age[i];
			}
			if(height[i] > tempHeight ){
				tempHeight = height[i];
			}
		}
		System.out.println("Youngest: " + tempAge);
		System.out.println("Tallest: " + tempHeight);
	}
}