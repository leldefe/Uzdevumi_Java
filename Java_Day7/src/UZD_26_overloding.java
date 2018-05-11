import java.util.ArrayList;

public class UZD_26_overloding {
	
	public static String combineString(String A, String B, String C, String D) {
		return D+ C + B + A; //ja te pamaina secibu, piemaram, dilstos, tad visam pamainas seciba
		
	}
	public static String combineString(String A, String B, String C) {
		//return A + B + C;
		return combineString(A,B,C,"");
		
	}
	public static String combineString(String A, String B) {
		//return A + B;
		return combineString(A,B,"");
	}

	public static void main(String[] args) {
		System.out.println(combineString("AB","DD","EE","CC")); 
		System.out.println(combineString("AB","DD","EE"));
		System.out.println(combineString("AB","DD"));

	}

}
