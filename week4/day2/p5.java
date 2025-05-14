import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class Main {
   public static void main(String[] args) {
       List<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
       int rotate = 2;
       int j = 0;
       rotate = rotate%list.size();
       List<Integer> list2 = new LinkedList<>(list.subList(rotate, list.size()));
	//List<Integer> list3 = new LinkedList<>(list.subList(0, rotate));
       list2.addAll(list.subList(0, rotate));
       System.out.println(list2); // This prints the actual rotated list
   }
}

