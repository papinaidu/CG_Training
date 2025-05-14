import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       String regex = "\\b(\\w+)\\b\\s+\\1";
       Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
       Matcher matcher = pattern.matcher("This is is a repeated repeated word test.");
       while (matcher.find()){
           System.out.println("Repeated: " + matcher.group(1));
       }
   }
}