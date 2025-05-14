import java.io.*;

public class Main {
   public static void main(String[] args)  {
       try {
           BufferedReader buffer = new BufferedReader(new FileReader("data.txt"));
           BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
           String line;
           while ((line = buffer.readLine()) != null){
               writer.write(line);
               writer.newLine();
           }
           writer.close();
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("Successfully File overwrite");
       }

   }
}