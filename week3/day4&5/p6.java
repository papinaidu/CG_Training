public class Main {
   public static void main(String[] args) {
       try{
           FileReader obj = new FileReader("C:\\Users\\naidu\\IdeaProjects\\CG_Training\\src\\text.txt");
           BufferedReader in = new BufferedReader(obj);
           String line;
           int count = 0;
           while((line = in.readLine())!=null){
               String[]  strs = line.split(" ");
               for(String s : strs){
                   if(s.equals("apple")) {
                       count++;
                   }
               }
           }
           System.out.println(count);

       }
       catch(Exception e){
           e.getStackTrace();
       }
   }
}