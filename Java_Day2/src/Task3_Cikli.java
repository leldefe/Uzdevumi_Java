import java.util.Scanner;

public class Task3_Cikli {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input x: ");
		int x = scanner.nextInt();

		for (int i = 0; i <= x; i++) {
			int reizinajums = x * i;
			System.out.println(x + "X" + i + "=" + reizinajums);

		}

	}

}
