import java.util.Scanner;
public class FreqChar {
	public String[] Frequency (String str){
		char[] ch = str.toCharArray();
		int[] freq = new int[ch.length];
		
		for(int i =0; i<ch.length; i++){
			if(ch[i]=='0' || ch[i]==' '){
				continue;
			}
			freq[i] =1;
			for(int j=i+1; j<ch.length; j++){
				if(ch[i] == ch[j]  ){
					freq[i]++;
					ch[j] = '0';
				}
			}
		}
		int uniqueChar =0;
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='0' || ch[i]==' '){
				continue;
			}
			else{
				uniqueChar++;
			}
		}
		int index =0;
		String[] result = new String[uniqueChar]; 
		for(int i =0; i<ch.length;i++){
			if(ch[i]=='0' || ch[i]==' '){
				continue;
			}
			else{
				result[index]=ch[i] + " => " + freq[i] ;
				index++;
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();

		FreqChar obj = new FreqChar();
		String[] result = obj.Frequency(str);

		for(String word: result){
			System.out.println(word);
		}
	}
}