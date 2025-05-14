import java.util.Scanner;
public class factorLastWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int i = num-1;
		while(i>0) {
			if(num%i == 0){
				System.out.println(i);
				break;
			}
			i--;
		}
	}
}