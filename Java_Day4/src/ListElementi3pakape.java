import java.util.ArrayList;

public class ListElementi3pakape {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList();
		arrayList.add(1); // index=0
		arrayList.add(5); // index=1
		arrayList.add(6); // index=2
		arrayList.add(4);
		
		ArrayList<Integer> arrayList2 = new ArrayList();
		arrayList.add(2); // index=0
		arrayList.add(3); // index=1
		//arrayList.add(7); // index=2
		//arrayList.add(8);
		
		/*int skaitlis =0;*/
		arrayList.addAll(arrayList2);
		for (int i = 0; i < arrayList.size(); i++) {
			
			Integer skaitlis = arrayList.remove(i);
			skaitlis = skaitlis*skaitlis*skaitlis;
			arrayList.add(i, skaitlis);
			
			/*skaitlis = arrayList.get(i);
			System.out.println("Skaitlis"+ arrayList.get(i)+"="+(skaitlis*skaitlis*skaitlis));*/
		}
		for (Integer i:arrayList) {
			System.out.println(i);
		}
	}

}
