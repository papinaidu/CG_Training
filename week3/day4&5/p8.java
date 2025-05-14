public class Main {
   public static void main(String[] args) {
       try{
           InputStreamReader a = new InputStreamReader(System.in);
           BufferedReader in = new BufferedReader(a);
           FileWriter b = new FileWriter("C:\\Users\\naidu\\IdeaProjects\\CG_Training\\src\\text.txt");
           System.out.println("Enter a String: ");
           String str;
           while(!(str = in.readLine()).equals("exit")){
               b.write(str);
               b.flush();
           }
           b.close();
       }
       catch(Exception e){
           e.getStackTrace();
       }
   }
}