import java.util.ArrayList;
import java.util.Arrays;

public class Zvaiznites4_array_list {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("this","is", "lots","of","fun","for","every","Java","programmer"));
		ArrayList<String> list2 = new ArrayList();
		
		for (String str : arrayList) {
			System.out.print(str + ",");
			if (str.length()==4) {
				list2.add("****");
				
			}
			
			list2.add(str);
			
			
		}
		System.out.println(list2);
	}
	
}
