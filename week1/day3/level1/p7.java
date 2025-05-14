import java.util.Scanner;
public class oddevenarr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int j=0,k=0;
		int sizeEven = num/2;
		int sizeOdd = (num+ 1)/2;
		int[] arrEven = new int[sizeEven];
		int[] arrOdd = new int[sizeOdd];
		for(int i=1; i<=num; i++) {
			
			if(i%2==0){
				arrEven[j]= i;
				j++;
			}
			else {
				arrOdd[k]= i;
				k++;
			}
			
		}

        	for (int i = 0; i < j; i++) {
            		System.out.println("Even array: " + arrEven[i]);
       	 	}
		for (int i = 0; i < k; i++) {
			System.out.println("Odd array: " + arrOdd[i]);
       	 	}
		sc.close();
	}
}