import java.util.Scanner;
public class table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		for(int j=num; j<=9;j++) {
			for(int i=1; i<=10;i++) {
				System.out.println(j + " * " + i + " = " + j*i);
			}
			System.out.println("\n");
		}
	}
}