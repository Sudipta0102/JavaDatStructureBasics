package strings;

import java.util.Arrays;

import com.sun.tools.classfile.StackMapTable_attribute.same_frame;

public class SwapCornerWordsReverseMidWord {
	
	public static void func(String str) {
		
		String tempStr = "";
		
		String[] sArr = str.split("\\s");
		
		String resStr = "";
		//swap first and last word
		tempStr = sArr[0];
		sArr[0] = sArr[sArr.length-1];
		sArr[sArr.length-1] = tempStr;
		
		//System.out.println(Arrays.toString(sArr));
		
		tempStr = sArr[sArr.length/2];
		int n = tempStr.length()-1;
		String revStr = "";
		
		//reverse middle word
		for(int i=n;i>=0;i--) {
			
			revStr = revStr + sArr[sArr.length/2].charAt(i);
			
		}
		
		sArr[sArr.length/2] = revStr;
		
		for(int i=0;i<sArr.length;i++) {
			
			resStr = resStr + sArr[i] + " ";
			
		}
		
		
		System.out.println(resStr.substring(0, resStr.length()-1));
	}
	
	//
	public static void funcAnother(String str) {
		
		String tempStr = "";
		
		String[] sArr = str.split("\\s");
		
		String resStr = "";
		//swap first and last word
		tempStr = sArr[0];
		sArr[0] = sArr[sArr.length-1];
		sArr[sArr.length-1] = tempStr;
		
		System.out.println(Arrays.toString(sArr));
		
		int n = sArr.length;
		
		for(int i=1;i<n-1;i++) {
			
			resStr = resStr+ " " + reverseString(sArr[i]) ;
			
		}
		
		
		System.out.println(sArr[0]+resStr+" "+sArr[n-1]);
	}
	
	public static String reverseString(String str) {
		
		String resStr = "";
		
		for(int i =str.length()-1;i>=0;i--) {
			
			resStr = resStr + str.charAt(i);
			
		}
		
		
		return resStr;
	}

	public static void main(String[] args) {
		
//		func("I am you");
//		
//		func("Hi How arya");
//		
//		func("Hi How are you");
//
//		System.out.println("------------");
		
		funcAnother("I am you");
		
		//funcAnother("Hi How arya");
		
		funcAnother("Hi How are you");
		
		
		//System.out.println(reverseString("you"));
	}

}
