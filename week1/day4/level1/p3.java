import java.util.Scanner;
public class HandshakeMethode {
	public int MaxHandshake(int n){
		int result = n*(n-1)/2;
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students:");
		int n = sc.nextInt();
		
		HandshakeMethode obj = new HandshakeMethode();
		int ans = obj.MaxHandshake(n);
		System.out.println("Maximum possible Hand Shakes are: " + ans);
	}
}