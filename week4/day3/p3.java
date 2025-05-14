import java.io.*;

public class Main {
   public static void main(String[] args)  {
       try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
           BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
           System.out.println("Enter Your Name: ");
           String name = br.readLine();
           System.out.println("Favorite programming language");
           String programLang = br.readLine();
           System.out.println("Enter your age: ");
           int age = Integer.parseInt(br.readLine());

           bw.write("Name: " + name + "\n");
           bw.write("Age: " + age + "\n");
           bw.write("Favorite programming language: " + programLang + "\n");
           bw.write("|---------------------------------------------|");
           bw.close();
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("Successfully File overwrite");
       }

   }
}