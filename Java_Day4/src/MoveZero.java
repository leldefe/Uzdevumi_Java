import java.util.Scanner;

public class MoveZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 0, 4, 0, 7, 8, 9, 0, 1 };
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			// P�rbaud�m vai skaitlis mas�v� ir nulle
			// Ja nav, tad p�rvietojam pa kreisi uzpirmo brivo poz�ciju, ja iesp�jams, t� m�snon�kam l�dz tam, kad indexu esam palielin�ju�i l�dz 5, jo nulles neiet cikl�

			if (arr[i] != 0) {
				arr[index] = arr[i]; // te var rakst�t ar� arr[index++]=arr[i]
				index++;
			}
		}
		//t�l�k no indexa 5 vis�s viet�s ierakst�m 0 
		for (int i = index; i < arr.length; i++) {
			arr[i] = 0;
		}
		//izdruk�jam mas�va saturu
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
