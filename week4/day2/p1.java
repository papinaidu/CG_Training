import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		list.add(6);
		int temp,n=list.size()-1;
		for(int i=0;i<list.size()/2;i++) {
			temp = list.get(i);
			list.set(i, list.get(n));
			list.set(n, temp);
			n--;
		}
		for(int a : list) {
			System.out.println(a);
		}

	}

}