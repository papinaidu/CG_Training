import java.util.Scanner;
public class CountLength {
	public void StringLength(String str) {
		int len = 0;
		try { 
			int i=0;
			while(true){
				str.charAt(i);
				len+=1;
				i++;
			}
			 			
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Length of the string: " + len);
		}
		catch (Exception e) {
			System.out.println("Generic Exception: " + e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		CountLength obj = new CountLength();
		obj.StringLength(str);
	}
}