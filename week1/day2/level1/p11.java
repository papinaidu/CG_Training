import java.util.Scanner;
public class negativecount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int sum = 0;
		while(true) {
			int count = sc.nextInt();
			if(count <= 0){
				break;
			}
			sum= count + sum;
		}
		System.out.println(sum);
	}
}