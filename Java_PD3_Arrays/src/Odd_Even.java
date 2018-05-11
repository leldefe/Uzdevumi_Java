
public class Odd_Even {

	public static void main(String[] args) {
		int[] arr = {1 ,4,2, 5 , 13 ,24, 51 ,6, 7 , 9 , 11};
		int indexOdd = 0;
		int indexEven=0;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2 == 0) {
				
				arr[indexEven] = arr[i]; 
				indexEven++;
			} else {
				arr[indexOdd] = arr[i]; 
				indexOdd++;
			}
			
		}
		System.out.println("Even-"+indexEven);
		System.out.println("Even-"+indexOdd);

	}

}
