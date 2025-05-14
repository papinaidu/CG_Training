import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   public static void main(String[] args) throws IOException {
       try{
           FileInputStream file = new FileInputStream("data.txt");
           InputStreamReader a = new InputStreamReader(file);
           BufferedReader buffer = new BufferedReader(a);
           String line ;
           while ((line = buffer.readLine()) != null){
               System.out.println(line);
           }
       }
       catch (IOException e){
           System.out.println("File not found " + e.getMessage());
       }
   }
}