import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       String regex = "[0-9]{2}/[0-9]{2}/[0-9]{2}";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher("The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.");
       while (matcher.find()){
           System.out.println("Match Found: " + matcher.group());
       }

   }
}