import java.util.Scanner;
import java.util.Arrays;
public class StringToSplitAndLength {
	public String[][] toSplit(String str, char ch){
		int words =1;
		String word="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)== ch){
				words++;
			}
		}
		String[][] strArr = new String[words][2];
		int index =0;
		int wordlen =0;
		for(int i=0;i<str.length();i++){
				if(str.charAt(i)== ch){
					wordlen = word.length();
					strArr[index][0]=word;
					strArr[index][1]= String.valueOf(wordlen);
					index++;
					word="";
				
				}
				else{
					word += str.charAt(i);
				}
		}
		strArr[index][0] = word;
		strArr[index][1] = String.valueOf(word.length());
		return strArr;
				
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		System.out.println("Enter character to split: ");
		char ch = sc.next().charAt(0);
		
		StringToSplitAndLength obj = new StringToSplitAndLength();
		String[][] result = obj.toSplit(str, ch);
		for (int i = 0; i < result.length; i++) {
            		System.out.println("Word: " + result[i][0] + ", Length: " + result[i][1]);
			System.out.println();
        	}
	}
}