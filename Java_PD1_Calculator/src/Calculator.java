import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input x: ");
		int x = scanner.nextInt();
		double x1 = x;
		
		System.out.println("Number is even: " + (x%2 == 0)); //saîsinâjums

		/*if (x % 2 == 0) {
			System.out.println("Number is even: True");
		} else {
			System.out.println("Number is even: False");
		}*/
		System.out.println("Input y: ");
		int y = scanner.nextInt();
		double y1 = y;

		int summa = x + y;
		int starpiba = x - y;
		double dalijums = (x1 / y1);
		int atlikums = (x % y);
		int reizinajums = (x * y);

		System.out.println("Summa: " + summa);
		System.out.println("Starpiba: " + starpiba);
		System.out.println("Dalijums: " + dalijums);
		System.out.println("Atlikums: " + atlikums);
		System.out.println("Reizinajums: " + reizinajums);

		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}

}
