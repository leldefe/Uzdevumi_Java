import java.util.Scanner;

public class Uzd2_Piramida {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = scanner.nextInt();

		for (int rinda = 1; rinda <= n; rinda++) {

			for (int atst = 1; atst <= n - rinda; atst++) {
				System.out.print(" ");
			}
			for (int cipari = 1; cipari <= rinda; cipari++) {
				System.out.print(rinda + " ");
			}
			System.out.println();
		}

	}

}
