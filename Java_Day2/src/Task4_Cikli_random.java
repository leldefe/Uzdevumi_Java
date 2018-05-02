import java.util.Random;
import java.util.Scanner;

public class Task4_Cikli_random {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("I have choosen number between 1 and 10, try to guess it!");
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		System.out.println(n);
		System.out.println("What's your number? ");
		int number = scanner.nextInt();
		
		while (n != number) {
			System.out.println("Nop, not correct!");
			number = scanner.nextInt();
		} 
			
		System.out.println("Correct, the number was " + n);

	}

}
