import java.util.Scanner;

public class Uzd4_Pirmsskaitli {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input x: ");
		int x = scanner.nextInt();
		System.out.println("Input y: ");
		int y = scanner.nextInt();

		// 1.VARIANTS, ja nezin matem�tiku

		for (int i = x; i <= y; i++) { // 2,3,4,5

			boolean isDivisible = false;
			for (int j = 2; j < i; j++) { // s�kam ciklu ar 2,jo visi dal�s ar 1 un tad dalam ar kaut ko, kas ir maz�ks par v�rt�bu, ko p�rbaud�m
				if (i % j == 0 && i != j) {
					isDivisible = true;
				}
			}
			if (!isDivisible) { // te m�s izdruk�jam tikai tos,kuriem nekad neizpild�s tas aug��jais isDivisible=true
								
				System.out.print(i+",");
			}
		}

		// 2. VARIANTS, �is ir pareiz tikai l�dz 100 robe�ai
		
		  /*for (int i = x; i <= y; i++) { // P�rbaud�m vai dalas ar 2;3;5;7
		  
		  if (i == 2 || i == 3 || i == 5 || i == 7) { System.out.println(i); continue;
		  } else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i == 1) {
		  continue; } System.out.print(i + ","); }*/
		 
	}

}
