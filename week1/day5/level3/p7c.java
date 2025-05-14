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
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		palindrome obj = new palindrome();
		//boolean	result = obj.ForPalindrome(str);
		char[] result = obj.StringtoArr(str);
		char[] inbuiltStringtoArr = str.toCharArray();
		for(int i=0;i<str.length(); i++){
			System.out.println(result[i]);
		}
		System.out.println();
		for(int i=0;i<str.length(); i++){
			System.out.println(inbuiltStringtoArr[i]);
		}
		if(Arrays.equals(result, inbuiltStringtoArr)){
			System.out.println("entered String is a palindrome ");
		}else{
			System.out.println("entered String is not a palindrome ");
		}
	}
}