public class Main {
   public static void main(String[] args) {
       StringBuilder bu = new StringBuilder();
       StringBuffer bf = new StringBuffer();
       long startTimeBuild = System.currentTimeMillis();
       for(int i = 0; i < 10000000; i++){
           bu.append("Hello ");
       }
       long endTimeBuild = System.currentTimeMillis();
       long startTimeBuffer = System.currentTimeMillis();
       for(int j = 0; j < 10000000;j++){
           bf.append("Hello ");
       }
       long endTimeBuffer = System.currentTimeMillis();
       System.out.println("StringBuilder Time " + (endTimeBuild-startTimeBuild));
       System.out.println("StringBuffer Time " + (endTimeBuffer-startTimeBuffer));
   }
}