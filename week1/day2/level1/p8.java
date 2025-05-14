import java.util.Scanner;
public class count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of counter");
		int count = sc.nextInt();
		while(count >= 1) {
			System.out.println(count);
			count--;
		}
	}
}