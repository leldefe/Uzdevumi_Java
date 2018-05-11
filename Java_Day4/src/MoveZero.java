import java.util.Scanner;

public class MoveZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 0, 4, 0, 7, 8, 9, 0, 1 };
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			// Pârbaudâm vai skaitlis masîvâ ir nulle
			// Ja nav, tad pârvietojam pa kreisi uzpirmo brivo pozîciju, ja iespçjams, tâ mçsnonâkam lîdz tam, kad indexu esam palielinâjuði lîdz 5, jo nulles neiet ciklâ

			if (arr[i] != 0) {
				arr[index] = arr[i]; // te var rakstît arî arr[index++]=arr[i]
				index++;
			}
		}
		//tâlâk no indexa 5 visâs vietâs ierakstâm 0 
		for (int i = index; i < arr.length; i++) {
			arr[i] = 0;
		}
		//izdrukâjam masîva saturu
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
