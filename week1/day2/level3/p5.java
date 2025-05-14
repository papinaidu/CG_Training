import java.util.Scanner;
public class digits {
public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		while(temp != 0) {
			temp=temp/10;
			count++;
		}
		System.out.println("Number of Digit's in the number is " + count);
	}
}