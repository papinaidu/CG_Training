import java.util.*;

public class Main {
   public static void main(String[] args) {
       List<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 20, 30, 30, 40, 50));
       ListIterator<Integer> it = list.listIterator();
       ListIterator<Integer> main = list.listIterator();
       int count = 0,n=7,pos;
       while(it.hasNext()){
           count++;
           it.next();
       }
       pos = count - n;
       while (pos>0){
           if(main.hasNext()){
               main.next();
           }
           pos--;
       }
       System.out.println(main.next());
   }
}