
public class UZD_23 {
	public static double averageArr( int []arr) {

		double summ=0.00;
		for (int number: arr) {	
			summ=summ +number;
		}
			return summ/arr.length;
		}

	public static void main(String[] args) {
		
		System.out.println(averageArr(new int [] {4, 5, 2, 1, 3, 2, 1, 8}));
	}

}
