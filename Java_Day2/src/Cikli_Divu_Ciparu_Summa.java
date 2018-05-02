import java.util.Scanner;

public class Cikli_Divu_Ciparu_Summa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				String divc=String.valueOf(i+""+j);
				int divcipInt = Integer.valueOf(divc);
				int summa = i + j;
				if (divcipInt%3==0);
				System.out.println(i+""+j+"="+i + "+" + j + "=" + summa);
				//System.out.println(i + "+" + j + "=" + summa);
			}
		}
	}
}
