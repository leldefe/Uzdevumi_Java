import java.util.Scanner;

public class Main_Rectangle {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(5, 4);
		r1.isSquare();
		r1.area();
		r1.perimeter();
		System.out.println(r1);
		
		System.out.println();
		
		Rectangle r2 = new Rectangle(3, 8);
		r2.isSquare();
		r2.area();
		r2.perimeter();
		System.out.println(r2);
		
		System.out.println();
		
		Rectangle r3 = new Rectangle(6);
		r3.isSquare();
		r3.area();
		r3.perimeter();
		System.out.println(r3);

	}

}
