import java.util.Scanner;
public class CompareStrings {
	public boolean isEqual(String string1, String string2){
		if(string1.length() != string2.length()){
			return false;
		}
		else{
			for(int i=0; i< string1.length(); i++){
				if(string1.charAt(i) != string2.charAt(i)){
					return false;
				}
			}
		}
		return true;
	}



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String one: ");
		String string1 = sc.next();
		System.out.println("Enter String Second: ");
		String string2 = sc.next();
		
		CompareStrings obj = new CompareStrings();
		boolean result = obj.isEqual(string1, string2);
		if(result && string1.equals(string2)){
			System.out.println("Both the strings are same");
		}
		else{
			System.out.println("Both the strings are not same");
		}
	}
}