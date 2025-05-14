public class Main {
   public static void main(String[] args) {
       try{
           FileInputStream a = new FileInputStream("C:\\Users\\naidu\\IdeaProjects\\CG_Training\\src\\text.txt");
           InputStreamReader b = new InputStreamReader(a);
           BufferedReader in = new BufferedReader(b);
           String line;

           while((line = in.readLine())!=null) {
               System.out.println(line);
           }
       }
       catch(Exception e){
           e.getStackTrace();
       }
   }
}