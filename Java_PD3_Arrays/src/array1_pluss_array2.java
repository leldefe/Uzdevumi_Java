
public class array1_pluss_array2 {

	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 1, 3 };
		int[] arr2 = { 4, 1, 9 };

		int lengthA = arr1.length;
		int lengthB = arr2.length;
		int[] result = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, result, 0, lengthA);
		System.arraycopy(arr2, 0, result, lengthA, lengthB);

		System.out.print("[");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.print("]");

	}

}
