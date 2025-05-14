import java.util.Scanner;
public class SumNN{
	public int naturalSum (int num){
		int sum = num* (num+1)/2;
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		SumNN obj = new SumNN();
		int ans = obj.naturalSum(num);
		System.out.printf("Sum of %d first  natural numbers is: %d",num,ans);
	}
}