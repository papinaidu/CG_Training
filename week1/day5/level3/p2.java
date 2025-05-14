import java.util.Scanner;
public class findUniqueChar {
	public char[] Uniquechar(String str){
		int  index=0;
		boolean	ans = true;
		char[] ch = new char[str.length()];
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<str.length(); j++){
				ans = true;
				if(str.charAt(i) ==str.charAt(j) && i != j){
					ans = false;
					break;
				}
			}
			if(ans){
				ch[index] = str.charAt(i);
				index++;
			}
		}
		char[] uniqueChars = new char[index];
        	for (int i = 0; i < index; i++) {
            		uniqueChars[i] = ch[i];
        	}
		return uniqueChars;
	}
 	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		
		findUniqueChar obj = new findUniqueChar();
		char[] result = obj.Uniquechar(str);
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
}