import java.util.Scanner;
public class toUppercase {
	public String toUppercaseMethod (String str){
		String result = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch >='a' && ch<='z'){
				result += (char)(ch-32);
			}
			else{
				result += ch;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		toUppercase obj = new toUppercase();
		String result = obj.toUppercaseMethod(str);
		System.out.println("User defined Method result: " + result);
		String InbuiltResult = str.toUpperCase();
		System.out.println("InbuiltResult: " + InbuiltResult);
		if(result.equals(InbuiltResult)){
			System.out.println("Both the results are same");
		}
		else{
			System.out.println("Both the results are not same");
		}
	}
}