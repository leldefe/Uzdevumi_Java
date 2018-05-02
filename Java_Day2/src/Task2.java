import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Your Letter: ");
		String letter = scanner.next().toUpperCase(); //visus uz lielajiem uztaisîju, lai nemet kïûdu
		char c = letter.charAt(0); //pârtaisam string par char masîvu ar 1 simbolu
		
		if (letter.length()>1) {
			System.out.println("Lûdzu, ievadi tikai VIENU burtu!");
		}
		
		else if(c == 'A' || c == 'E' || c == 'I' ||c == 'U') {
			System.out.println(c + " ir patskanis");
		}
		else if (c == 'O') {
			System.out.println(c + " ir patskanis & divskanis");
		}
		else if (Character.isLetter(c)) { //pârbauda vai ievadîtais ir burts un, ja ir, tad izvada, ka ir lîdzskanis
			System.out.println(c + " ir lîdzskanis");
		}
		else {
			System.out.println(c + " ievadîts neatbilstoðs simbols");
		}
	}

}
