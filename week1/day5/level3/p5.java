import java.util.Scanner;
public class Frequenc2Darr {
	public char[][] freq2DArr(String str){
		int count = 0;
		char[][] ch = new char[str.length()][2];
		for(int i=0; i<str.length(); i++){
			count = 0;
			for(int j=0; j<str.length(); j++){
				if(str.charAt(i) ==str.charAt(j) ){
					count++;
				}
			}
			ch[i][0]=str.charAt(i);
			ch[i][1]=String.valueOf(count).charAt(0);
		}
		return ch;
	}
 	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		
		Frequenc2Darr obj = new Frequenc2Darr();
		char[][] result = obj.freq2DArr(str);
		for(int i=0; i<result.length; i++){
			System.out.println("Character: " + result[i][0] + " | Count: " + result[i][1]);
		}
	}
}