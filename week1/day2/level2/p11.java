import java.util.Scanner;
public class multiplesfor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		for(int i =100; i > 0; i--) {
			if(i%num == 0){
				System.out.println(i);
			}
		}
	}
}