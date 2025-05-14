import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
       Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
       Matcher matcher = pattern.matcher("My SSN is 123-45-6789.");
       while (matcher.find()){
           System.out.println("SSN: " + matcher.group());
       }
   }
}