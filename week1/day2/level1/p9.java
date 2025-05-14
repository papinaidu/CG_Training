import java.util.Scanner;
public class forcount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of counter");
		int count = sc.nextInt();
		for( int i=count; i>=1; i--) {
			System.out.println(i);
		}
	}
}