import java.util.Scanner;
public class VowelAndConsonant {
	public int[] countVowelAndConsonant(String str){
		int Vowelcount = 0;
		int Consonantcount = 0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u'){
					Vowelcount++;
				}
				else{
					Consonantcount++;
				}
			}
		}
		return new int[]{Vowelcount, Consonantcount};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		VowelAndConsonant obj = new VowelAndConsonant();
		int[] result = obj.countVowelAndConsonant(str);
		System.out.println("Number of vowels: " + result[0]);
		System.out.println("Number of Consonant: " + result[1]);
	}
}