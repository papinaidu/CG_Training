import java.util.Scanner;
public class naturalwhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sumWhile  = 0;
		int sum=0;
		if (num > 0) {
			sum = num * (num + 1) /2;
		}
		while(num > 0) {
			sumWhile= num + sumWhile;
			num--;
		}
		if (sum == sumWhile) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both not are same");
		}
	}
}