import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       String regex = "\\$?[0-9]+\\.[0-9]+";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher("The price is $45.99, and the discount is 10.50.");
       while (matcher.find()){
           System.out.println("Language: " + matcher.group());
       }
   }
}