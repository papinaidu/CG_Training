public class Main {
   public static void main(String[] args) {
       StringBuilder bu = new StringBuilder();
       StringBuffer bf = new StringBuffer();
       String str = "";
       long startTime = System.currentTimeMillis();
       for(int i = 0; i < 10000; i++){
           str = str + "Hello ";
       }
       long endTime= System.currentTimeMillis();
       System.out.println("String Time " + (endTime-startTime));

       startTime = System.currentTimeMillis();
       for(int i = 0; i < 10000; i++){
           bu.append("Hello ");
       }
       endTime = System.currentTimeMillis();
       System.out.println("StringBuilder Time " + (endTime-startTime));

       startTime = System.currentTimeMillis();
       for(int j = 0; j < 10000;j++){
           bf.append("Hello ");
       }
       endTime = System.currentTimeMillis();

       System.out.println("StringBuffer Time " + (endTime-startTime));
   }
}