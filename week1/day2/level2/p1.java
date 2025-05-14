import java.util.Scanner;
public class oddeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		while(num > 0) {
			if(num%2==0){
				System.out.println(num +" Is Even number");
			}
			else {
				System.out.println(num +" Is odd number");
			}
			num--;
		}
	}
}