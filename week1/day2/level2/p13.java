import java.util.Scanner;
public class multiplesWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int i =100;
		while(i > 0) {
			if(i%num == 0){
				System.out.println(i);
			}
			i--;
		}
	}
}