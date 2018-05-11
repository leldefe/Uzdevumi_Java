
public class Second_min {

	public static void main(String[] args) {

		 int[] arr ={ 7, 0, 8, 9, 21, 2, 5, 3, 1, 5, 2, 12, 21 };
		// int[] arr = {7, 7, 2, 2, 9};
		// int[] arr = { 7, 2, 8, 9, 21, 2, 5, 3, 1, 5, 2, 12, 21 };
		//int[] arr = { 5, 4, 3, 2, 1 };
		int min = Integer.MAX_VALUE;
		int min2 = min;
		int min3 = min2;
		int min4 = min3;
		int min5 = min4;

		for (int i : arr) {
			if (min2 == i || min3 == i || min4 == i) {
				continue;
			} else if (i < min) {
				min4=min3;
				min3=min2;
				min2 = min;
				min = i;
			} else if (i < min2) {
				min4=min3;
				min3=min2;
				min2 = i;
			} else if (min2 < i&&i<min3) {
				
				min3 = min2;
				min3=i;
			} else if (min3<i&&i<min4) {
				
				min4 = min3;
				min4=i;
			}
		}
		System.out.print("2. mazâkais skaitlis: " + min4);
	}

}
