import java.util.Scanner;

public class Uzd1_Kubi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			int cube = i * i * i;
			// ieb�v�t� funkcija Math.pow(i,3) (1.skaitlis, kuru ce�am pak�p�,2.skaitlis kur� pak�p� ce�am
			System.out.println("Cube of the " + i + "=" + cube);
		}

	}

}
