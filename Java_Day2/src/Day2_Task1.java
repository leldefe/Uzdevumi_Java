import java.util.Scanner;

public class Day2_Task1 {
//enumer�cijas parasti taisa atsevi��os failos/klas�s, kur ir iepriek� defin�tas v�rt�bas
	enum Auto {
		AUDI, GOLF, BMW;
		public void toString(Auto a) {
			System.out.println(a);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Auto auto = Auto.GOLF;

		switch (auto) {
		case GOLF:
			System.out.println("A");
			break;
		case AUDI:
			System.out.println("B");
			break;
		default:
			System.out.println("C");
			break;
		}
		/*
		 * int age = 19; String message = (age >= 18) ? "Vari balsot" : "Nevari balsot";
		 * System.out.println(message);
		 * 
		 * // aug��jais ir tas pats, kas te apak��, tikai �s�k pierakst�ts if (age >=
		 * 18) { message = "Vari balsot"; } else { message = "Nevari balsot"; }
		 */

		/*
		 * System.out.println("Input a: "); int a = scanner.nextInt();
		 * System.out.println("Input b: "); int b = scanner.nextInt(); int summa = a +
		 * b;
		 */

		/*
		 * String message = (summa >=10 && summa <=19) ? ("Summa: " + (20)) : ("Summa: "
		 * + (summa)); System.out.println(message);
		 */

		/*
		 * if (summa >=10 && summa <=19) { System.out.println("Summa: " + 20); } else {
		 * System.out.println("Summa: " + summa); }
		 */
	}

}
