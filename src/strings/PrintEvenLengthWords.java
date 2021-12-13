package strings;

import java.util.Arrays;

public class PrintEvenLengthWords {

	public static void func(String str) {
		
		String[] strArr = str.split("\\s");
		
		System.out.println(Arrays.toString(strArr));
		
		int n = strArr.length;
		
		for(int i=0;i<n;i++) {
			
			if(strArr[i].length()%2==0) {
			
				System.out.println(strArr[i]);
				
			}	
			
		}
		
	}
	
	public static void main(String[] args) {
		
		func("Geeks For Feeks Tune in");
		

	}

}
