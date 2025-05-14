import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       String regex = "https?://(www\\.)?[a-z]+\\.[a-z]{3}";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher("Visit https://www.google.com and http://example.org for more info.");
       while (matcher.find()){
           System.out.println("Match Found: " + matcher.group());
       }

   }
}