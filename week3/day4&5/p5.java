public class Main {
   public static void main(String[] args) {
       try{
           FileReader obj = new FileReader("C:\\Users\\naidu\\IdeaProjects\\CG_Training\\src\\text.txt");
           BufferedReader in = new BufferedReader(obj);
           String line = in.readLine();
           while(line != null ){
               System.out.print(line);
               line = in.readLine();
           }
       }
       catch(Exception e){
           e.getStackTrace();
       }
   }
}