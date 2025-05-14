import java.util.Arrays;
public class FactorsMethod {
	public static int[] factors(int num) {
		int  count=0;
		for(int i =1; i <= num; i++) {
			if(num%i == 0){
				count++;
			}
		}
		int index =0;
		int[] arr = new int[count];
		for(int i =1; i <= num; i++) {
			if(num%i == 0){
				arr[index]=i;
				index++;
			}
		}
		return arr;
	}
	public int sumoffactors(int[] arr){
		int sum =0;
		for(int i = 0; i<arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
	public int sumofsquare(int[] arr){
		int sum = 0;
		for(int i = 0; i<arr.length;i++){
			sum += Math.pow(arr[i],2);
		}
		return sum;
	}
	public int productoffactors(int[] arr){
		int sum = 1;
		for(int i = 0; i<arr.length;i++){
			sum *= arr[i];
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int[] resultArr = FactorsMethod.factors(num);
		for(int i = 0; i<resultArr.length;i++){
			System.out.println("Factor: "+ (i+1)+ " : "  +resultArr[i]);
		}
		FactorsMethod obj = new FactorsMethod();
		int sum = obj.sumoffactors(resultArr);
		System.out.println("Sum of Factors: " +sum);
		int square = obj.sumofsquare(resultArr);
		System.out.println("Sum of squares of Factors: " +square);
		int product = obj.productoffactors(resultArr);
		System.out.println("product of factors : " +product);
	}
}