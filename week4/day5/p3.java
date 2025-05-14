import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
   public static void main(String[] args) {
       System.out.println(Pattern.matches("^#([a-fA-F0-9_]{6}|[a-fA-F0-9_]{3})$", "#AFF123"));
   }
}