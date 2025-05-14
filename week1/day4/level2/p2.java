import java.util.Scanner;
public class RecursiveSum {
	public int recursiveSum(int num){
		if(num==1){
			return 1;
		}
		
		return num + recursiveSum(num - 1);
		
	}
	public int formula(int num){
		int sum = num * (num+1)/2;
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		RecursiveSum obj = new RecursiveSum();
		int result = obj.recursiveSum(num);
		int formula = obj.formula(num);
		if(result == formula){
			System.out.println("Both the results are same");
		}
		else{
			System.out.println("Both the results are not same");
		}
	}
}