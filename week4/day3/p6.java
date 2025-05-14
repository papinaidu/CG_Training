import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;

public class Main {
   public static void main(String[] args) throws IOException {
       try (
               BufferedReader reader = new BufferedReader(
                       new InputStreamReader(new FileInputStream("data.txt"), StandardCharsets.UTF_8)
               );

               BufferedWriter writer = new BufferedWriter(
                       new OutputStreamWriter(new FileOutputStream("output.txt"), StandardCharsets.UTF_8)
               )
       ) {
           String line;
           while ((line = reader.readLine()) != null) {
               writer.write(line.toLowerCase());
               writer.newLine();
           }
           System.out.println("Conversion completed. Check 'output.txt'");
       } catch (IOException e) {
           System.err.println("Error occurred: " + e.getMessage());
       }
   }
}