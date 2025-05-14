import java.util.Scanner;

public class ExceptionClass {
	public void nullpointerException(String str) {
		try {
			int length = str.length();  
		}
		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Generic Exception: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		String str = null;
		ExceptionClass obj = new ExceptionClass();
		obj.nullpointerException(str);
	}
}