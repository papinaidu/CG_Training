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
			count=0;
			for(int j=0;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					count++;
				}
			}
			if(!map.containsKey(list.get(i))) {
				map.put(list.get(i), count);
			}
		}
		System.out.print(map);

	}

}