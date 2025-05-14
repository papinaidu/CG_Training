import java.util.Scanner;
public class sumcount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int sum = 0;
		while(true) {
			int count = sc.nextInt();
			sum= count + sum;
			if(count == 0){
				break;
			}
		}
		System.out.println(sum);
	}
}