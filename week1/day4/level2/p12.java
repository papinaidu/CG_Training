import java.util.Scanner;
import java.lang.Math;
public class RandomMethod {
	public int[] generate4DigitRandomArray(int size){
		int[] arr = new int[size];
		for(int i =0; i<size; i++){
			arr[i] = (int) (Math.random() * (9999 - 1000 + 1))+1000;
		}
		return arr;
	}
	public double[] findAverageMinMax(int[] numbers){
		double sum = 0;
		double avg,max,min;
		min = Integer.MAX_VALUE;
        	max = Integer.MIN_VALUE;
		for(int i = 0; i<numbers.length; i++){
			sum += numbers[i];
			min = Math.min(min, numbers[i]);
			max = Math.max(max, numbers[i]);
		}
		avg = sum/numbers.length;
		return new double[]{avg, min, max};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of random numbers array: ");
		int size = sc.nextInt();
		
		RandomMethod obj = new RandomMethod();
		int[] RandomArrayResult = obj.generate4DigitRandomArray(size);
		double[] AverageMinMaxResult = obj.findAverageMinMax(RandomArrayResult);
		System.out.println("Average: "+ AverageMinMaxResult[0]);
		System.out.println("Minimum: "+ AverageMinMaxResult[1]);
		System.out.println("Maximum: "+ AverageMinMaxResult[2]);
	}
}