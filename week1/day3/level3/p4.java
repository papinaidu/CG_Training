import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker2 {

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

    public static int[] reverseArray(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        return revArr;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int[] arr = digitArr(num);
        int[] revArr = reverseArray(arr);
        return compareArrays(arr, revArr);
    }

    public static boolean isDuckNumber(int num) {
        int[] arr = digitArr(num);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int[] digitArrResult = NumberChecker2.digitArr(num);
        int[] reversedArrResult = NumberChecker2.reverseArray(digitArrResult);

        System.out.println("Count of digits: " + NumberChecker2.Count(num));

        System.out.print("Digits array: ");
        for (int i = 0; i < digitArrResult.length; i++) {
            System.out.print(digitArrResult[i] + " ");
        }
        System.out.println();

        System.out.print("Reversed digits array: ");
        for (int i = 0; i < reversedArrResult.length; i++) {
            System.out.print(reversedArrResult[i] + " ");
        }
        System.out.println();

        if (NumberChecker2.isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }

        if (NumberChecker2.isDuckNumber(num)) {
            System.out.println(num + " is a duck number.");
        } else {
            System.out.println(num + " is not a duck number.");
        }

        sc.close();
    }
}