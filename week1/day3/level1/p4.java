import java.util.Scanner;

public class arrmultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i = 0;
        while (i < 10) {
            System.out.println("Enter number " + (i + 1));
            int num = sc.nextInt();
            if (num > 0) {
                arr[i] = num;
                ++i;
            } else {
                System.out.println("You entered Negative or Zero. Exiting...");
                break;
            }
        }
        int sum = 0;
        for (int j = 0; j < i; j++) {
            System.out.println("Number " + (j + 1) + " is: " + arr[j]);
            sum += arr[j];
        }
        System.out.println("Sum of all elements: " + sum);
        sc.close();
    }
}