import java.util.Scanner;
public class powerWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the power: ");
		int power = sc.nextInt();
		int result = 1;
		int i =1;
		while( i <= power) {
			result = result*num;
			i++;
		}
		System.out.println(result);
	}
}