import java.util.Scanner;
import java.util.Arrays;
public class StringToArray {
	public char[] stringToArr(String str){
		char[] arr = new char[str.length()];
		for(int i=0; i<str.length(); i++){
			arr[i] = str.charAt(i);
		}
		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		StringToArray obj = new StringToArray();
		char[] result = obj.stringToArr(str);
		char[] BuildIn = str.toCharArray();
		if(Arrays.equals(result, BuildIn)){
			System.out.println("Both the results are same");
			for(int i=0; i<result.length; i++){
				System.out.println(result[i]);
			}
		}
		else{
			System.out.println("Both the results are not same");
		}
	}
}