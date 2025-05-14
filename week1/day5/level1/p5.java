import java.util.Scanner;
public class ExceptionStringIndexOutOfBounds {
	public void StringIndexOutOfBoundsException(String str) {
		try {
			char a = str.charAt(20);  		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bounds Exception: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Generic Exception: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		ExceptionStringIndexOutOfBounds obj = new ExceptionStringIndexOutOfBounds();
		obj.StringIndexOutOfBoundsException(str);
	}
}