import java.util.Scanner;
public class FootBallTeamMethod {
	public int SumOfHeights(int[] height){
		int sum =0;
		for(int i=0; i<height.length; i++){
			sum += height[i];
		}
		return sum;
	}
	public double MeanHeight(int[] height){
		int sum =0;
		for(int i=0; i<height.length; i++){
			sum += height[i];
		}
		double mean = (double) sum/height.length;
		return mean;
	}
	public int ShoterPlayer(int[] height){
		int shorter= height[0];
		for(int i=0; i< height.length; i++){
			if(shorter > height[i]){
				shorter = height[i];
			}
		}
		return shorter;
	}
	public int TallerPlayer(int[] height){
		int taller= height[0];
		for(int i=0; i< height.length; i++){
			if(taller < height[i]){
				taller = height[i];
			}
		}
		return taller;
	}	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of FootBall Players ");
		int num = sc.nextInt();
		int[] height = new int[num];
		for(int i = 0; i<num; i++){
			System.out.println("Enter Height of Player " + (i+1));
			height[i] = sc.nextInt();
		}
		
		FootBallTeamMethod obj = new FootBallTeamMethod();
		int sumResult = obj.SumOfHeights(height);
		double meanResult = obj.MeanHeight(height);
		int shortResult = obj.ShoterPlayer(height);
		int tallResult = obj.TallerPlayer(height);
		System.out.println("Sum of the Heigth of all Players: " + sumResult);
		System.out.println("mean of the Heigth of all Players: " + meanResult);
		System.out.println("Shortest of all Players: " + shortResult);
		System.out.println("Tallest of all Players: " + tallResult);
	}
}