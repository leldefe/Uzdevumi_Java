import java.util.Scanner;

public class Uzd1_Kubi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			int cube = i * i * i;
			// iebûvçtâ funkcija Math.pow(i,3) (1.skaitlis, kuru ceïam pakâpç,2.skaitlis kurâ pakâpç ceïam
			System.out.println("Cube of the " + i + "=" + cube);
		}

	}

}
