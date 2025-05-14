import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Main {
   public static void main(String[] args)  {
       String line;
       try(BufferedReader buffer = new BufferedReader(new FileReader("data.txt")) ){
           while ((line = buffer.readLine()) != null){
               System.out.println(line);
           }
       } catch (IOException e) {
           System.out.println("File Not Found " + e.getMessage());
       }
   }
}