import java.util.Scanner;
public class AmarMethod {
	public int youngest(int[] age){
		int tempAge = age[0];
		for(int i=0; i<3; i++) {
			if(age[i] < tempAge ){
				tempAge = age[i];
			}
		}
		return tempAge;
	}
	public int tallest(int[] height){
		int tempHeight = height[0];
		for(int i=0; i<3; i++) {
			if(height[i] > tempHeight ){
				tempHeight = height[i];
			}
		}
		return tempHeight;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]  age = new int[3];
		int[] height = new int[3];
		String[] names = {"Amar", "Akbar", "Anthony"};
		for(int i=0; i<3; i++) {
			System.out.println("Enter Age of " + names[i]);
			age[i]= sc.nextInt();
			System.out.println("Enter Height of " + names[i]);
			height[i]= sc.nextInt();
		}
		AmarMethod obj = new AmarMethod();
		int YoungestResult = obj.youngest(age);
		int TallestResult = obj.tallest(height);
		for(int i=0; i<3; i++) {
			if(YoungestResult == age[i]){
				System.out.println("Youngest is " + names[i]);
				System.out.println("Youngest: " + YoungestResult);
			}
			if(TallestResult == height[i]){
				System.out.println("Tallest is " + names[i]);
				System.out.println("Tallest: " + TallestResult);
			}

		}
			
	}
}