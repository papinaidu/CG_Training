import java.util.Scanner;
public class palindrome{
	public boolean ForPalindrome(String str){
		boolean ans = true;
		int n = str.length();
		for (int i = 0; i < n / 2; i++) {
            		if (str.charAt(i) != str.charAt(n - 1 - i)) {
                		return false;              
			}
        	}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		palindrome obj = new palindrome();
		boolean	result = obj.ForPalindrome(str);
		if(result){
			System.out.println("entered String is a palindrome ");
		}else{
			System.out.println("entered String is not a palindrome ");
		}
	}
}