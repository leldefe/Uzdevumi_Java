import java.util.Scanner;

public class Uzdevums1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// ievadi X
		// ievadi Y
		// Izvadi x un y summu
		/*
		 * System.out.println("Input x: "); int x = scanner.nextInt();
		 * System.out.println("Input y: "); int y = scanner.nextInt();
		 * 
		 * System.out.println("Summa: "+ (x+y)); //int res=x+y, ja es ðitâ nodefinçtu,
		 * tad varçti pie izvades tikai + res
		 */

		// Ievadam 3 skaitïus un izvadâm skaitïu vidçjo
		/*System.out.println("Input a: ");
		int a = scanner.nextInt();
		System.out.println("Input b: ");
		int b = scanner.nextInt();
		System.out.println("Input b: ");
		int c = scanner.nextInt();

		double videjais = (a + b + c) / 3.0;

		System.out.println("Videjais: " + videjais);*/
		
		System.out.println("Input a: ");
		String a=scanner.next();
		System.out.println("Input b: ");
		String b=scanner.next();
		int aInt=Integer.valueOf(a);
		int bInt=Integer.valueOf(b);
		//double dbl=Double.valueOf("12.3");
		
		double videjais = (aInt + bInt) / 2.0;
		System.out.println(videjais);
	}

}
