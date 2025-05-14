import java.util.Scanner;
public class SubString {
	public String CompareSubstrings(String str, int start, int end){
		String result = "";
		for(int i=0;i<end; i++){
			result += str.charAt(i)+ "";
		}
		return result;
	}
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		System.out.println("Enter Start: ");
		int start = sc.nextInt();
		System.out.println("Enter End: ");
		int end = sc.nextInt();
		SubString obj = new SubString();
		String result = obj.CompareSubstrings(str, start, end);
		String InbuildString = str.substring(start, end);
		System.out.println("Through method: "+result);
		System.out.println("Through Inbuild: "+InbuildString);
		if(result.equals(InbuildString)){
			System.out.println("Both the results are same");
		}
		else{
			System.out.println("Both the results are not same");
		}
	}
}