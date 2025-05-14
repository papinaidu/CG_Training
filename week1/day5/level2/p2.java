import java.util.Scanner;
import java.util.Arrays;
public class StringToSplit {
	public boolean toSplit(String str, char ch){
		int words =1;
		String word="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)== ch){
				words++;
			}
		}
		String[] strArr = new String[words];
		int index =0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)== ch){
				strArr[index]=word;
				index++;
				word=" ";
				
			}
			else{
				word += str.charAt(i);
			}
		}
		strArr[index] = word;
		String[] inbuiltArr = str.split(String.valueOf(ch));
		if(Arrays.equals(inbuiltArr,strArr)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		System.out.println("Enter character to split: ");
		char ch = sc.next().charAt(0);
		
		StringToSplit obj = new StringToSplit();
		boolean	result = obj.toSplit(str, ch);
		if(result){
			System.out.println("Both the results are same");
		}
		else{
			System.out.println("Both the results are not same");
		}
	}
}