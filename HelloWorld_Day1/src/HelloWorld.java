import java.util.Scanner;

public class HelloWorld {
	

	public static void main (String[] args) {
		
		String abc="ABC";						//ja �o string saprotam k� char mas�vu, tad [A,B,C]
		Object abcObject = abc;
		
	 	String def=new String("DEF");
		
		//Savieno�ana
		String combinedStr0 = abc.concat(def); //concat noz�m� savienot kop� ABCDEF
		String combinedStr1=abc + def;			//ABCDEF
		int length = abc.length();				//3
		boolean abcEq0=abc.equals("def");		//false (p�rbauda abc vai ir vien�ds ar def
		boolean b="ABC".equals("abc");			//Te b�s false, jo ir lielie un mazie burti
		boolean c ="ABC".equalsIgnoreCase("abc");//true, jo ignor�, ka ir lielie/mazie burti
		char charAt0=abc.charAt(1);				//B
		String abcUpper = "abc".toUpperCase();	//ABC
		String abcLower = "ABC".toLowerCase();	//abc
		boolean isEmpty0="".isEmpty();			//true (nav neaks ievad�ts programmi��)
		boolean isEmpty1="A".isEmpty();			//false
		
		System.out.println(abcEq0);
		 
		int[]arr1= {1,2,3};
		int[]arr2= {4,5,6};
		System.arraycopy(arr1, 0, arr2, 0,3);
		
		for(int i=0;i<3;i++) {
			System.out.print("["+arr2[i]+"]");
		
			Scanner scanner=new Scanner(System.in); //�is vajadz�gs, lai lietot�jam liktu kkur v�l�k programm� ievad�t kaut ko
			System.out.println("Input string: ");
			String str = scanner.next();
			System.out.println("Input int:");
			int in = scanner.nextInt();
			
			scanner.nextBoolean();//��ds ir input boolean
			
			
			System.out.println("Input value: "+ str+ " "+in);
			
		} 
		
		/*
		System.out.print("Hello! ");//ja uzraksta vnk print, tad nep�rnes jaun� l�nij�
		
		System.out.println("Hello World"); //println izvada un p�rmet jaun� rind� */
	}
}
