package strings;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.attribute.HashAttributeSet;

public class COnevertStringToByteArray {

	public static void main(String[] args) {
		
		String s1 = "Hello Hell";

		byte[] bArr = s1.getBytes();
		
		for(int i=0;i<bArr.length;i++) {
			System.out.println(bArr[i]);
		}
		
		System.out.println();
		
		func();
		
	}
	
	static void func() {
		
		String s = "abbbcseedsaasad";
		Pattern p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		
		int count = 0;
		
		while(m.find()) {
            System.out.println(m.group());
            count++;
        }
		
		System.out.println(count);
		
		String s1 = "abbbcseedsaa";
		Pattern p1 = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
		Matcher m1 = p1.matcher(s);
		
		Set<String> set = new HashSet<String>();
		
		
	}
	
	static void func1() {
		
		
		
		String s = "abbbcseedsaasad";
		
		
	}
	
}
