import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Main {
   public static void main(String[] args) throws IOException {
       File file = new File("pic.jpg");
       BufferedImage image = ImageIO.read(file);

       ByteArrayOutputStream baos = new ByteArrayOutputStream();
       ImageIO.write(image,"jpg", baos);
       byte[] imageBytes = baos.toByteArray();
      
       ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
       BufferedImage newImage = ImageIO.read(bais);
      
       File outputFile = new File("output.jpg");
       ImageIO.write(newImage, "jpg", outputFile);

      
   }
}