import java.util.Scanner;
public class anagrams{
	public boolean isanagrams(String str1, String str2){
		int[] freq1 = new int[256];
		int[] freq2 = new int[256];
		if(str1.length()!=str2.length()){
			return false;
		}
		for(int i=0; i<str1.length(); i++){
			freq1[str1.length()]++;
			freq2[str2.length()]++;	
		}
		
		for(int i=0; i<256; i++){
			if(freq1[i] != freq2[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String one: ");
		String str1 = sc.next();
		System.out.println("Enter a String two: ");
		String str2 = sc.next();
		anagrams obj = new anagrams();
		boolean	result = obj.isanagrams(str1, str2);
		if(result){
			System.out.println("Strings are anagrams");
		}else{
			System.out.println("Strings are not anagrams");
		}
	}
}