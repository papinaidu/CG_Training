import java.util.Scanner;
public class handshakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		int totalNum = (n * (n+1))/2;
		System.out.println("Total handshakes possible: " + totalNum);
	}
}