import java.io.*;

public class Main {
   public static void main(String[] args)  {
       try {
           BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
           BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
           byte[] buffer = new byte[4096];
           long start = System.nanoTime();
           int bytesRead;
           while ((bytesRead = bis.read(buffer)) != -1) {
               bos.write(buffer, 0, bytesRead);
           }
           bos.close();
           long end = System.nanoTime();
           System.out.println("Buffer Stream: " + (end-start)/1e6 + "ms");
           FileInputStream fis = new FileInputStream("data.txt");
           FileOutputStream fos = new FileOutputStream("output.txt");

           start = System.nanoTime();
           while ((bytesRead = fis.read(buffer)) != -1) {
               fos.write(buffer, 0, bytesRead);
           }
           fos.close();
           end = System.nanoTime();
           System.out.println("File Stream: " + (end-start)/1e6 + "ms");
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("Successfully File overwrite");
       }

   }
}