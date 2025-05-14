import java.util.Scanner;
public class NumberFormatExceptionDemo  {
	public void numberformateException(String str){
		try{
			int result = Integer.parseInt(str);
			System.out.println(result);
		}
		catch(NumberFormatException e){
			System.out.println("String can't convert into int "+ e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Generic Exception: " + e.getMessage());
		}
	}
	public static void main(String[] args){
		NumberFormatExceptionDemo  obj = new NumberFormatExceptionDemo ();
		obj.numberformateException("a123");
	}
}