import java.util.Scanner;

public class NumberChecker3 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;
        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        return true;
    }

    public static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (NumberChecker3.isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        if (NumberChecker3.isNeon(num)) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }

        if (NumberChecker3.isSpy(num)) {
            System.out.println(num + " is a spy number.");
        } else {
            System.out.println(num + " is not a spy number.");
        }

        if (NumberChecker3.isAutomorphic(num)) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }

        if (NumberChecker3.isBuzz(num)) {
            System.out.println(num + " is a buzz number.");
        } else {
            System.out.println(num + " is not a buzz number.");
        }

        sc.close();
    }
}