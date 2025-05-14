import java.util.Scanner;

public class VowelConsonantChecker {

    public String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public String[][] analyzeString(String str) {
        int length = str.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    public void displayResult(String[][] result) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("----------------------------");
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        VowelConsonantChecker obj = new VowelConsonantChecker();
        String[][] result = obj.analyzeString(str);
        for (int i = 0; i < result.length; i++) {
            System.out.println( result[i][0] + " " + result[i][1]);
        }
    }
}