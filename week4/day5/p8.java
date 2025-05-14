import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       String input = "This is a damn bad example with some stupid words.";
       List<String> list = Arrays.asList("damn", "stupid");

       for(String word : list){
            input = input.replaceAll("(?i)\\b" + word + "\\b","****");
       }

       System.out.println(input);
   }
}