import java.util.Scanner;

public class Uzd3_Palindroms {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input word: ");
		String word = scanner.next().toUpperCase();
		
		//1.VARIANTS
		boolean isPalindrome=true;
		for(int i=0; i<word.length();i++) {
			//ROTATOR
			if(word.charAt(i) !=word.charAt(word.length()-(i+1))) {
			//word.charAt(i) = R i-tais no kreis�s
				//word.charAt(word.length()-(i+1)) = R i-tais no lab�s puses v�rdam
				
				isPalindrome=false;
			}
		}
		System.out.println("Ir palindroms: " + isPalindrome);
		
		//2.VARIANTS
		/*String reverse = new StringBuilder(word).reverse().toString();
		
		System.out.println("Ir palindroms: " + word.equals(reverse));*/
		
		//3.VARIANTS
		/*char[] wordArr = word.toCharArray();//izveidojam mas�vu
		char [] reverseArr = new char[wordArr.length];//uztais�m otru mas�vu, kas b�s no otras puses un pasak�, ka b�s tikpat gar� k� wordArr
		int reverseArrIndex = 0;
		
		for (int i=(wordArr.length-1); i>=0; i--) {
			reverseArr[reverseArrIndex]=wordArr[i];
			reverseArrIndex++;
			
		}
		boolean isPalindrome=true;
		for (int i=0; i<wordArr.length; i++) {
			if(wordArr[i]!=reverseArr[i]) {
				System.out.println("Nav palindroms");
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("Ir palindroms");
		}*/
		
		//String reverseWord=new String(reverseArr) ��di no string uztais�m mas�vu
		
		}
	

}
