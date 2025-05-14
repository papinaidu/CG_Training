import java.util.Scanner;
public class CheckNum {
	public int Number(int num){
		if(num<0){
			return -1;
		}
		else if(num==0){
			return 0;
		}
		else if(num>0){
			return 1;
		}
	return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber: ");
		int num = sc.nextInt();
		
		CheckNum obj = new CheckNum();
		int ans = obj.Number(num);
		System.out.println(ans);
	}
}