
import java.util.Scanner;

public class NumberChecker1 {

    public static int Count(int num) {
        int count = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            count++;
        }
        return count;
    }

    public static int[] digitArr(int num) {
        int count = Count(num);
        int[] arr = new int[count];
        int i = count - 1;
        for (int temp = num; temp != 0; temp /= 10) {
            arr[i] = temp % 10;
            i--;
        }
        return arr;
    }

    public static int sumOfDigits(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num, int[] arr) {
        int sum = sumOfDigits(arr);
        return (num % sum == 0);
    }

    public static int[][] digitFrequency(int[] arr) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int[] digitArrResult = NumberChecker1.digitArr(num);

        System.out.println("Count of digits: " + NumberChecker1.Count(num));

        System.out.print("Digits array: ");
        for (int i = 0; i < digitArrResult.length; i++) {
            System.out.print(digitArrResult[i] + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + NumberChecker1.sumOfDigits(digitArrResult));
        System.out.println("Sum of squares of digits: " + NumberChecker1.sumOfSquaresOfDigits(digitArrResult));

        if (NumberChecker1.isHarshadNumber(num, digitArrResult)) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }

        int[][] freq = NumberChecker1.digitFrequency(digitArrResult);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " times.");
            }
        }
        sc.close();
    }
}

