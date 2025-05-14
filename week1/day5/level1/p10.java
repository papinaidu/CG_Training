import java.util.Scanner;
public class toLowercase {
	public String toLowercaseMethod (String str){
		String result = "";
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch >='A' && ch<='Z'){
				result += (char)(ch+32);
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
		toLowercase obj = new toLowercase();
		String result = obj.toLowercaseMethod(str);
		System.out.println("User defined Method result: " + result);
		String InbuiltResult = str.toLowerCase();
		System.out.println("InbuiltResult: " + InbuiltResult);
		if(result.equals(InbuiltResult)){
			System.out.println("Both the results are same");
		}
		else{
			System.out.println("Both the results are not same");
		}
	}
}