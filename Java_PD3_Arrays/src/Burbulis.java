import java.util.Arrays;

public class Burbulis {

	public static void main(String[] args) {
		int []arr = {5,3,7,1,9,0};
		//Arrays.sort(arr);
		
		
		//5,3,7,1,9,0
		
		for (int i=0; i<arr.length; i++) {
			for (int j=1; j<(arr.length-i); j++) { 
				//arr.lenght-i, p�c k�rt�j�s�r�j� ciklaiter�cijas, k�rt�jais liel�kais elements ir beig�s
				if(arr[j-1]>arr[j]) { //iepriek��jais elements ir maz�ks
					//arr[j-1] j�samaina ar arr[j]
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int num:arr) {
			System.out.print(num + ",");
		}
	}

}
