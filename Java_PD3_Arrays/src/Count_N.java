import java.util.Scanner;

public class Count_N {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input y: ");
		int y = scanner.nextInt();
		int[] arr = { 7, 2 ,8,9,21, 2 ,5,3,1,5, 2 ,12,21};
		int index = 0;
		

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == y) {
				System.out.print(i+",");
				arr[index] = arr[i]; 
				index++;
			}
		}
		System.out.print("vietu skaits-"+index);

	}

}
