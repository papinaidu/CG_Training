import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       String regex = "[A-Z][a-z]+";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher("The Eiffel Tower is in Paris and the Statue of Liberty is in New York.");
       while (matcher.find()){
           System.out.println("Match Found: " + matcher.group());
       }

   }
}