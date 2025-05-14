import java.util.Scanner;
public class ExceptionIllegalArgument {
	public double SquareNum(int num) {
		if(num<0){
			throw new IllegalArgumentException("Number should be non-negative");
		}
		return Math.pow(num, 2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExceptionIllegalArgument obj = new ExceptionIllegalArgument();
		try {
			double result = obj.SquareNum(-1);
		}
		catch(IllegalArgumentException e){
			System.out.println("Error!: " + e.getMessage());
		}
	}
}