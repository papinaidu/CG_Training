import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       String regex = "[a-zA-z0-9]+@[a-z]+\\.[a-z]{2,}";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher("Contact us at support@example.com and info@company.org");
       while (matcher.find()){
           System.out.println("Match Found: " + matcher.group());
       }

   }
}