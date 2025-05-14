import java.util.Scanner;
import java.util.Arrays;
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
	public char[] StringtoArr(String str){
		char[] ch = new char[str.length()];
		for(int i=0;i<str.length(); i++){
			ch[i]=str.charAt(i);
		}
		return ch;
	}
	public boolean isPalindrome(String str, int start, int end) {
        	if (start >= end) {
            		return true;
        	}

                if (str.charAt(start) != str.charAt(end)) {
 	        	return false;          
		}

                return isPalindrome(str, start + 1, end - 1);
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
}import java.util.Scanner;
import java.util.Arrays;
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
	public char[] StringtoArr(String str){
		char[] ch = new char[str.length()];
		for(int i=0;i<str.length(); i++){
			ch[i]=str.charAt(i);
		}
		return ch;
	}
	public boolean isPalindrome(String str, int start, int end) {
        	if (start >= end) {
            		return true;
        	}

                if (str.charAt(start) != str.charAt(end)) {
 	        	return false;          
		}

                return isPalindrome(str, start + 1, end - 1);
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