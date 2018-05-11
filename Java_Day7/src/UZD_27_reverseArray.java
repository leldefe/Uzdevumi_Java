
public class UZD_27_reverseArray {
	
	public static int[] reverseArray(int []arr) {
		
		int []arr2=new int[arr.length];
		int index=0;
		for (int i=arr.length-1; i>=0; i--) {
			arr[index] = arr[i];
			index++;
		}
		return arr2;
		
	}
	public static String []reverseArray(String []arr) {
		
		String [] arr2=new String[arr.length];
		int index=0;
		
		for (int i=arr.length-1; i>=0; i--) {
			arr2[index] = arr[i];
			index++;
		}
		return arr2;
			
	}

	public static void main(String[] args) {
		
		int [] arr = new int [] {1,3,5,2};
		for (int i:arr) {
			System.out.print(i+",");
		}
		System.out.println();
		
		String [] arrStr = new String [] {"AB","CDE","FED"};
		for (int i=0; i<arrStr.length; i++) {
			System.out.print(arrStr[i] + ",");
		}
		System.out.println();
		
		arrStr=reverseArray(arrStr);
		for (String str: arrStr) {
			System.out.print(str+",");
		}
	}

}
