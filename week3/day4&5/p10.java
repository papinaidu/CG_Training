public class Main {
   public static int Count(Reader reader) throws IOException {

       BufferedReader br = new BufferedReader(reader);
       String line;
       String[]  str;
       int wordcount = 0;
       while ((line = br.readLine()) != null){
           line = line.trim();
           if(!line.isEmpty()){
               str = line.split("\\s+");
               wordcount += str.length;
           }

       }
       return wordcount;
   }
   public static void main(String[] args) throws IOException {
       String path = "C:\\Users\\naidu\\IdeaProjects\\CG_Training\\src\\text.txt";
       long startFR = System.currentTimeMillis();
       int resultFR = Count(new FileReader(path));
       long endFR = System.currentTimeMillis();
       System.out.println("File Result: " + resultFR);
       System.out.println("Time Taken: " + (endFR - startFR));
       long startISR = System.currentTimeMillis();
       int resultISR = Count(new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8));
       long endISR = System.currentTimeMillis();
       System.out.println("File Result: " + resultISR);
       System.out.println("Time Taken: " + (endISR - startISR));
   }
}