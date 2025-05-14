import java.util.Scanner;
public class ExceptionArrayIndexOutOfBounds {
	public void ArrayIndexOutOfBoundsException(int[] arr) {
		try {
			System.out.println(arr[20]);  		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Generic Exception: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6};
		ExceptionArrayIndexOutOfBounds obj = new ExceptionArrayIndexOutOfBounds();
		obj.ArrayIndexOutOfBoundsException(arr);
	}
}