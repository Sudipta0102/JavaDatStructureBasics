package strings;

import java.util.Arrays;

public class PaddingString {
	
	public static String funcLeft(String str, char pad, int L) {
		
		char[] resArr = new char[str.length() + L];
		
		int pos = 0;
		int j=0;
		
		for(pos=0;pos<L;pos++) {
			
			resArr[pos] = pad;
			
		}
		
		for(int i=pos;i<resArr.length;i++) {
			
			resArr[i] = str.charAt(j);
			
			j++;
			pos++;
		}
		
		//System.out.println(Arrays.toString(resArr));
		
		return new String(resArr);
		
	}
	
	public static String funcMiddle(String str, char pad, int L) {
		
		char[] resArr = new char[str.length()+L];
		
		int pos = 0;
		int j = 0;
		
		for(int i=pos;i<str.length()/2;i++) {
			
			resArr[i] = str.charAt(j);
			
			j++;
			pos++;
			
		}
		
		//System.out.println("pos: "+pos);
		
		for(int i=0;i<L;i++) {
			
			resArr[pos] = pad;
			
			pos++;
		}
		
		//System.out.println(j);
		//System.out.println("pos: "+pos);
		
		for(int i=pos;i<resArr.length;i++) {
			
			resArr[i] = str.charAt(j);
			
			j++;
		}
		
		return new String(resArr);
	}
	
	public static String funcRight(String str, char pad, int L) {
		
		char[] resArr = new char[str.length()+L];
		
		int pos = 0;
		int j = 0;
		
		for(int i=0;i<str.length();i++) {
			
			resArr[i] = str.charAt(j);
			
			pos++;
			j++;
		}
		
		while(pos<L+str.length()) {
			
			resArr[pos] = pad;
			
			pos++;
			
		}
		
		//System.out.println(Arrays.toString(resArr));
		
		return new String(resArr);
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(funcLeft("geeks", '_', 5));
		System.out.println(funcMiddle("geeks", '_', 5));
		
		System.out.println(funcRight("geeks", '_', 5));

	}

}
