
public class UZD_22 {

	public static int smallestNumber(int x, int y, int z) {

		int min = 0;

			 if (x<y && x<z) {
				 min = x;
			 }
			 else if (y<x && y<z) {
				 min = y;
			 }
			 else {
				 min = z; 
			 }
			 return min;
		}

	public static void main(String[] args) {

			System.out.println(smallestNumber(5,9,3));
			System.out.println(smallestNumber(1,9,3));
			System.out.println(smallestNumber(4,2,8));
	}
}
