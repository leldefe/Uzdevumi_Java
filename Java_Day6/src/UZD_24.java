import java.util.ArrayList;
import java.util.Scanner;

public class UZD_24 {

	public static boolean isSafePassword (String password) {
		
		if (password.length() < 10) {
			System.out.println("Pssword is too short");
			return false;
		}
		int countOfNumbers=0;
		for (char c : password.toCharArray()) { //pârbaudam vai stringâ ir burti/cipari
			
			if (Character.isAlphabetic(c) == true || Character.isDigit(c)==true) {
				//Character.isAlphabetic(c); //atgriezîs true, ja ir alfabçta burts
				//Character.isDigit(c);		//true, ja ir skitlis, false, ja nav skaitlis
					
				//Satur 2 ciparus
				if (Character.isDigit(c)) {
					countOfNumbers++;
				}
			}else {
				System.out.println("Password contains invalid symbol!");
				return false;
			}	

			}
			if (countOfNumbers<2) {
				System.out.println("Not enough digits in password!");
				return false;

		}
			//Parole ir korekta
			System.out.println("Nice password!");
			return true;
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Your Password: ");
		String password = scanner.next();
		System.out.println(isSafePassword(password));
		
		

	}

}
