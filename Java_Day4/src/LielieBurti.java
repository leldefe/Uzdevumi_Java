import java.util.ArrayList;

public class LielieBurti {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("aDs"); // index=0
		arrayList.add("add"); // index=1
		arrayList.add("dd"); // index=2
		arrayList.add("eee");
		// System.out.println(str.toUpperCase() + ",");
		for (int i = 0; i < arrayList.size(); i++) {
											//{"aDs","add","dd","eee"}
			String str = arrayList.remove(i); //{"add","dd","eee"}	i=0,str=aDs
			str = str.toUpperCase();		// i=0, str="ADS"
			arrayList.add(i, str);			//{"ADS","add","dd","eee"}
			
		}
		for (String str : arrayList) {
			System.out.println(str);
		}

	}

}
