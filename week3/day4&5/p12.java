public class Main {
   static String searchWord(List<String> sentence, String word){
       int size = sentence.size();
       for(int i = 0; i < size; i++){
           String[] words = sentence.get(i).trim().split("\\s+");
           for(String w : words){
               if(w.equals(word)){
                   return sentence.get(i);
               }
           }
       }
       return "Not Found";
   }
   public static void main(String[] args) {
       List<String> sentences = new ArrayList<>();
       sentences.add("This is the first sentence.");
       sentences.add("Here is the second sentence.");
       sentences.add("Java is fun!");
       sentences.add("Learning lists in Java.");
       String str = "is";
       String res = searchWord(sentences, str);
       System.out.println(res);
   }
}