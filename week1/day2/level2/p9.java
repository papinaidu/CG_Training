import java.util.Scanner;
public class factorlast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		for(int i =num-1; i > 0; i--) {
			if(num%i == 0){
				System.out.println(i);
				break;
			}
		}
	}
}