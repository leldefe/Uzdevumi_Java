import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Your Letter: ");
		String letter = scanner.next().toUpperCase(); //visus uz lielajiem uztais�ju, lai nemet k��du
		char c = letter.charAt(0); //p�rtaisam string par char mas�vu ar 1 simbolu
		
		if (letter.length()>1) {
			System.out.println("L�dzu, ievadi tikai VIENU burtu!");
		}
		
		else if(c == 'A' || c == 'E' || c == 'I' ||c == 'U') {
			System.out.println(c + " ir patskanis");
		}
		else if (c == 'O') {
			System.out.println(c + " ir patskanis & divskanis");
		}
		else if (Character.isLetter(c)) { //p�rbauda vai ievad�tais ir burts un, ja ir, tad izvada, ka ir l�dzskanis
			System.out.println(c + " ir l�dzskanis");
		}
		else {
			System.out.println(c + " ievad�ts neatbilsto�s simbols");
		}
	}

}
