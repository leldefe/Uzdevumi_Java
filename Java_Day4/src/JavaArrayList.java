
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayList {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList();

		arrayList.add("ABC"); // index=0
		arrayList.add("CDE"); // index=1
		arrayList.add("FGH"); // index=2
		arrayList.add("ABC");

		for (String str : arrayList) {
			System.out.println(str + ",");
		}
		System.out.println();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + "- index = " + i + ";");
		}
		/*
		 * // izdzes visu saraksta saturu arrayList.clear();
		 */
		System.out.println(" arrayList size is= " + arrayList.size());

		System.out.println();

		arrayList.remove("ABC");
		for (String str : arrayList) {
			System.out.println(str + ",");
		}

		System.out.println(" arrayList size is= " + arrayList.size());
	

	// Isais veids ka aizpildit masivu
	ArrayList<String> arrayList2 = new ArrayList(Arrays.asList("XX", "ZZ", "LL"));
	
	//Pievieno visus elementus no arrayList2 ieks arrayList
	arrayList.addAll(arrayList2);
	for(String str:arrayList) {
		System.out.print(str +" ,");
		
		
	}
	}

}
