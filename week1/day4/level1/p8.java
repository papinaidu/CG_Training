import java.util.Scanner;
public class LargstMethod{
	public static int[] findSmallestAndLargest(int num1, int num2, int num3){
		int smallest = num1;
		int largest = num1;
		if(num2 > largest){
			largest=num2;
		}
		if(num3>largest){
			largest=num3;
		}
		if(num2<smallest){
			smallest = num2;
		} 
		if(num3<smallest){
			smallest = num3;
		}
		return new int[]{smallest,largest};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Third number: ");
		int num3 = sc.nextInt();
		int[] result = LargstMethod.findSmallestAndLargest(num1,num2,num3);
		System.out.println("Smallest number is:" + result[0]);
		System.out.println("Largest number is: " + result[1]);
	}
}