import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// Sâkuma vçrtîba A
		// Beigu vçrtîba B
		// if skaitlis%3 system out Fizz
		// if skaitlis%5 system out Buzz
		// if skaitlis%3 && skaitlis%5 system out FizzBuzz
		
		
		String []array = {"1","2","3","5","8","30","15","12","7"};
		
		for (int i=0; i<array.length; i++) {
			String str = array[i];
			int a = Integer.parseInt(str); //Konvertçjam string-->int
			if ((a % 3 == 0) && (a % 5 == 0)) {
				array[i]="fizzBuzz";
			}
			else if (a % 5 == 0) {
				array[i]="Buzz";
			}
			else if (a % 3 == 0) {
				array[i]="Fizz";
			}
			
			System.out.print(array[i] + " ");
			
			
		}
		
		
		
		//MANS VARIANTS
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Input A: ");
		int A = scanner.nextInt();
		System.out.println("Input B: ");
		int B = scanner.nextInt();

		for (int i = A; i <= B; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.print(" FizzBuzz, ");

			} else if (i % 5 == 0) {
				System.out.print(" Buzz, ");
			} else if (i % 3 == 0) {
				System.out.print(" Fizz, ");
			} else {
				System.out.print(" " + i + " ");
			}
		}*/
	}

}
