import java.io.*;


public class Main {
   public static void main(String[] args) throws IOException {
       String fileName = "student_data.bin";

       try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
           dos.writeInt(101);
           dos.writeUTF("Alice Johnson");
           dos.writeFloat(8.7f);

           dos.writeInt(102);
           dos.writeUTF("Bob Smith");
           dos.writeFloat(9.1f);

           System.out.println("Student data written successfully.");
       } catch (IOException e) {
           System.err.println("Error writing data: " + e.getMessage());
       }


       try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
           System.out.println("\nRetrieved Student Details:");
           while (dis.available() > 0) {
               int roll = dis.readInt();
               String name = dis.readUTF();
               float gpa = dis.readFloat();

               System.out.println("Roll No: " + roll + ", Name: " + name + ", GPA: " + gpa);
           }
       } catch (IOException e) {
           System.err.println("Error reading data: " + e.getMessage());
       }
   }
}