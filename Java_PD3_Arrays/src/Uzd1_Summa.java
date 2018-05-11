import java.util.ArrayList;
import java.util.Scanner;

public class Uzd1_Summa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 1, 5, 2, 10, 22, 105, 2, 5 };

		int summa = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 10 && arr[i] <= 99) {
				
				continue;
				
			} else {
				System.out.println("Vertiba: " + arr[i]);
				summa+=arr[i];
			}

		}
		System.out.println("Summa: " + summa);
	}

}
