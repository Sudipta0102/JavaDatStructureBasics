package strings.Strings50GFG.Level1;

public class EncryptTheString {

	static String convert(int num) {
		
		String res = "";
				
			while(num>0) {
				
				int rem = num%16;
				
				if(rem>=0 && rem<=9) {
					
					res = rem + res;
				}
				if(rem>=10 && rem<=15) {

					res = (char)('A' + (rem - 10)) + res;
				
				}
				num = num/16;
				
			}
					
			return res;
		
	}
	
	static String libraryHex(int num) {
		
		return Integer.toHexString(num);
		
	}
	
	static String reverse(String s) {
		
		String res = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			
			res+=s.charAt(i);
			
		}
		
		return res;
	}
	
	static void func(String s) {
		
		int n = s.length();
		int count = 1;
		String res = "";
		//aaabc
		for(int i=1;i<n;i++) {
		
			if(i==n-1 && s.charAt(i-1)==s.charAt(i)) {
				count++;
				res+=s.charAt(i)+convert(count);
				break;
			}
			
			if(s.charAt(i-1)==s.charAt(i)) {
				
				count++;
				
			}else {
				
				res+=s.charAt(i-1)+convert(count);
				count = 1;
				//i++
				if(i==n-1) {
					
					res+=s.charAt(i)+convert(count);
				}
			}		
		}
		
		System.out.println(reverse(res));
	}
	
	public static void main(String[] args) {
		
		String s = "ccccccccccccccccccccc";
		
		System.out.println(s.length());
		
		char a = 'A'+5;
		
		System.out.println(a);
		
		func(s);
		
		System.out.println(convert(4239));
		
		System.out.println(libraryHex(4239));
		
	}
	
}
