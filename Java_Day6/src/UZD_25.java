import java.util.ArrayList;
import java.util.Arrays;

public class UZD_25 {
	
	public static boolean isIncreasing(ArrayList<Integer> listOfInts) {
		
		boolean isIncreasing = true; //ja isincreasing ir true, tad ir augoðs
		for (int i=1; i<listOfInts.size(); i++) {
			if (listOfInts.get(i-1) > listOfInts.get(i)) {
				return false;
			}
		}
		System.out.println("isIncreasing "+isIncreasing);
		return true;
		
	}
	public static boolean isDecreasing(ArrayList<Integer> listOfInts) {
		
		boolean isDecreasing = true;
		for (int i=1; i<listOfInts.size(); i++) {
			if (listOfInts.get(i-1) < listOfInts.get(i)) {
				return false;
			}
		}
		System.out.println("isDecreasing "+isDecreasing);
		return true;
	}
	
	/*public static void elementOrder(ArrayList<Integer> listOfInts) {
		boolean isIncreasing = isIncreasing(listOfInts);
		boolean isDecreasing = isDecreasing(listOfInts);
		
		if (isIncreasing) {			//isIncreasing uzreiz var likt ieksa isIncreasing(listOfInts) un augsa boolean nemaz nerakstit
			System.out.println("isIncreasing "+isIncreasing);
		} 
		else if (isDecreasing){
			System.out.println("isDecreasing "+isDecreasing);
			
		}
		else {
			System.out.println("NotIncreasing/NotDecreasing");
		}
	}*/
	

	public static void main(String[] args) {
		
		ArrayList arr1=new ArrayList(Arrays.asList(1,2,3,5,11));
		System.out.println(arr1);
		//elementOrder(arr1);
		
	
		if (!isIncreasing(arr1)&&!isDecreasing(arr1)) {	
			System.out.println("NotIncreasing/NotDecreasing"); 
			}
			
		
		
		/*isIncreasing(new ArrayList(Arrays.asList(1,2,3,5,11)));
		isIncreasing(new ArrayList(Arrays.asList(9,7,5,2,1)));
		isIncreasing(new ArrayList(Arrays.asList(1,7,3,5,11)));
		isDecreasing(new ArrayList(Arrays.asList(1,2,3,5,11)));
		isDecreasing(new ArrayList(Arrays.asList(9,7,8,2,1)));
		isDecreasing(new ArrayList(Arrays.asList(1,7,3,5,11)));*/
	}
}
