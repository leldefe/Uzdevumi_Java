import java.util.Scanner;

public class Masivi {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in); neko nelasam ðobrîd tâpçc nevajag ðo
		
		int[]arr = new int[3];
		arr[0] = 1;
		arr[1]=4;
		arr[2]=5;
		//[1];,[4], [5]
		int[]arr2 =arr.clone(); //[1];[4]; [5]
		for (int i: arr2) {
			System.out.print(i+" ,");
		}
		int[]arr3= {1,2,3,4,5}; //[1];[3];[4];[5]
		System.out.print("Length is: " +arr3.length +" ,");
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
