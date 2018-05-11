import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strArray = { "ABC", "CDE", "FGA", "CDE", "GAE", "ABC", "ABO" };
		String[] uniqueVals = new String[strArray.length];

		int index = 0;
		for (int i = 0; i < strArray.length; i++) {
			String str = strArray[i];
			// Pârbaudâm uniqueVals vai tur jau ir str ("ABC")
			// Ja nav, tad rakstâm iekðâ
			// Ja ir tad neko nedaram
			boolean isDuplicate = false;
			for (int j = 0; j < uniqueVals.length; j++) {
				String str2 = uniqueVals[j];

				if (str.equals(str2)) {
					isDuplicate = true;
				}
			}
			if (!isDuplicate) {
				uniqueVals[index] = str;// vai arî apakðâ index=index +1
				index++;
			}

		}
		
		String[]arr3=new String[index];
		System.arraycopy(uniqueVals, 0, arr3, 0, index);
		for(String str:arr3) {
			System.out.println(str);
		}
		
		/*for (String str : uniqueVals) {
			if (str!=null) {
			System.out.println(str);}

		}*/

	}

}
