import java.util.ArrayList;
import java.util.Arrays;

public class UZD_20 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,5,4,2,3,1,5,2,3,1));
		ArrayList<Integer> list2 = new ArrayList();
		
		
		
		int index=0;
		
		for (int i=0; i<arrayList.size(); i++) {
		
			
		int x=arrayList.get(i);
			boolean isDuplicate = false;
			for (int j=0; j<list2.size(); j++) {
			int y =	list2.get(j);
				if (arrayList.get(i)==list2.get(j)) {
					isDuplicate = true;
				}
			}
			
			if (!isDuplicate) {
				list2.add(x);
				index++;
			}
		}
	//ÎSAIS VARIANTS
			//*for (Integer i:arrayList) {
				//boolean contains=list2.contains(i);
				///if(!contains) {
					//list2.add(i);}
		
		System.out.print(list2);
	}

}
