import java.util.Scanner;
public class RecursiveSum {
	public int recursiveSum(int num){
		if(num==1){
			return 1;
		}
		
		return num + recursiveSum(num - 1);
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int sum = num * (num+1)/2;
		RecursiveSum obj = new RecursiveSum();
		int result = obj.recursiveSum(num);
		if(result == sum){
			System.out.println("Both the results are same");
		}
		else{
			System.out.println("Both the results are not same");
		}
	}
}