import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       String regex = "[A-Z][a-z]+";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher("I love Java, Python, and JavaScript, but I haven't tried Go yet.");
       while (matcher.find()){
           System.out.println("Language: " + matcher.group());
       }
   }
}