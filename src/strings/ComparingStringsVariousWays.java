package strings;

import java.text.CollationKey;
import java.text.Collator;

public class ComparingStringsVariousWays {

	//1
	public static boolean funcEqualsToOperator(String str1, String str2) {
		
		if(str1==str2) {
			
			return true;
			
		}
		else
			
			return false;
		
	}
	
	//2
	public static boolean funcEqualsToMethod(String str1, String str2) {
		
		if(str1.equals(str2)) {
			
			return true;
			
		}
		else
			
			return false;
		
	}
	
	//3
	public static int funcCompareTo(String str1, String str2) {
		
		int flag=0;
		if(str1.compareTo(str2)==0) {
			
			return flag;
			
		}
		else {
			flag = str1.compareTo(str2);
			return flag;
		}
	}
	
	//4
	public static int funcCompareToIgnoreCase(String str1, String str2) {
		
		int flag=0;
		if(str1.compareToIgnoreCase(str2)==0) {
			
			return flag;
			
		}
		else {
			flag = str1.compareToIgnoreCase(str2);
			return flag;
		}
	}
	
	//5
	public static int funcCompareCollator(String str1, String str2) {
		
		Collator collator = Collator.getInstance();
		int flag = 0;
		
		if(collator.compare(str1, str2)==0) {
			
			return flag;
			
		}
		else {
			
			flag = collator.compare(str1, str2);
			return flag;
			
		}
		
	}
	
	//6
	public static boolean funcEqualsToIgnoringCase(String str1, String str2) {
		
		if(str1.equalsIgnoreCase(str2)) {
			
			return true;
			
		}
		else
			
			return false;
		
	}
	
	//7
	public static boolean funcContentEquals(String str1, String str2) {
		
		if(str1.contentEquals(str2)) {
			
			return true;
			
		}
		else
			
			return false;
		
	}
	
	//8 (String with a stringBuffer)
	public static boolean funcContentEqualsStringWithStringBuffer(String str1, String str2) {

		StringBuffer sb = new StringBuffer(str2);
		
		if (str1.contentEquals(sb)) {

			return true;

		} else

			return false;

	}
	
	//9
	public static boolean funcStringbuilderContentEquals(String str1, String str2) {
		
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str2);
		
		if(sb1.equals(sb2)) {
			
			return true;
			
		}
		else
			
			return false;
		
	}
	
	
	public static void main(String[] args) {


		String s1 = "A";
        String s2 = "A";
        String s3 = "a";
        String s4 = new String("A");
        
        //1
        // if they are referring to same objects, they return true
        System.out.println(funcEqualsToOperator(s1, s2));
        System.out.println(funcEqualsToOperator(s1, s4));
        System.out.println(funcEqualsToOperator(s1, s3));
		
		System.out.println("-------");

		//2
		System.out.println(funcEqualsToMethod(s1, s2));
		System.out.println(funcEqualsToMethod(s1, s4));
		System.out.println(funcEqualsToMethod(s1, s3));
		
		System.out.println("-------");
		
		//3
		System.out.println(funcCompareTo(s1, s2));// content equal so returns 0
		System.out.println(funcCompareTo(s1, s4));// content equal so returns 0
		System.out.println(funcCompareTo(s1, s3));//content not equal so returns (str.charAt(i)-str.charAt(i))
		
		System.out.println("-------");
		
		//4
		System.out.println(funcCompareToIgnoreCase(s1, s2));
		System.out.println(funcCompareToIgnoreCase(s1, s4));
		System.out.println(funcCompareToIgnoreCase(s1, s3));
		
		System.out.println("-------");
		
		//5
		System.out.println(funcCompareCollator(s1, s2));
		System.out.println(funcCompareCollator(s1, s4));
		System.out.println(funcCompareCollator(s1, s3));
		
		System.out.println("-------");
		
		//6
		System.out.println(funcEqualsToIgnoringCase(s1, s2));
		System.out.println(funcEqualsToIgnoringCase(s1, s4));
		System.out.println(funcEqualsToIgnoringCase(s1, s3));
		
		System.out.println("-------");
		
		//7
		System.out.println(funcContentEquals(s1, s2));
		System.out.println(funcContentEquals(s1, s4));
		System.out.println(funcContentEquals(s1, s3));
				
		System.out.println("-------");
		
		//8
		System.out.println(funcContentEqualsStringWithStringBuffer(s1, s2));
		System.out.println(funcContentEqualsStringWithStringBuffer(s1, s4));
		System.out.println(funcContentEqualsStringWithStringBuffer(s1, s3));
						
		System.out.println("-------");
		
		//9
		System.out.println(funcStringbuilderContentEquals(s1, s2));//false it says, dont know why
		System.out.println(funcStringbuilderContentEquals(s1, s4));//false it says, dont know why
		System.out.println(funcStringbuilderContentEquals(s1, s3));//false it says, dont know why
						
		System.out.println("-------");
	}

}
