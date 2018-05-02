import java.util.Scanner;

public class PD1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Uzdevums 1A + 1B
		System.out.println("Input Your Name: ");
		String name = scanner.next();
		String nameMod = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

		System.out.println("Hey there: " + nameMod);

	}
}
