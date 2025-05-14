import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
		HashMap<String, Integer> map = new HashMap<>();
		int count=0;
		for(int i=0;i<list.size();i++) {
			if(!map.containsKey(list.get(i))) {
				map.put(list.get(i), 1);
			}
			else {
				count =  map.get(list.get(i));
				count++;
				map.replace(list.get(i),count );
			}
		}
		System.out.print(map);

	}

}