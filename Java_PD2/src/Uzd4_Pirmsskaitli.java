import java.util.Scanner;

public class Uzd4_Pirmsskaitli {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input x: ");
		int x = scanner.nextInt();
		System.out.println("Input y: ");
		int y = scanner.nextInt();

		// 1.VARIANTS, ja nezin matemâtiku

		for (int i = x; i <= y; i++) { // 2,3,4,5

			boolean isDivisible = false;
			for (int j = 2; j < i; j++) { // sâkam ciklu ar 2,jo visi dalâs ar 1 un tad dalam ar kaut ko, kas ir mazâks par vçrtîbu, ko pârbaudâm
				if (i % j == 0 && i != j) {
					isDivisible = true;
				}
			}
			if (!isDivisible) { // te mçs izdrukâjam tikai tos,kuriem nekad neizpildâs tas augðçjais isDivisible=true
								
				System.out.print(i+",");
			}
		}

		// 2. VARIANTS, ðis ir pareiz tikai lîdz 100 robeþai
		
		  /*for (int i = x; i <= y; i++) { // Pârbaudâm vai dalas ar 2;3;5;7
		  
		  if (i == 2 || i == 3 || i == 5 || i == 7) { System.out.println(i); continue;
		  } else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i == 1) {
		  continue; } System.out.print(i + ","); }*/
		 
	}

}
