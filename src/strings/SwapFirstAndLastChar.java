package strings;

public class SwapFirstAndLastChar {

	public static void func(String str) {
		
		int n = str.length()-1;
		char f = str.charAt(0);
		char l = str.charAt(n);
		String res = "";
		
		System.out.println(f);
		System.out.println(l);
		
		for(int i=1;i<n;i++) {
			
			res = res+str.charAt(i);
		}
		
		System.out.println(l+res+f);
		
	}
	
	public static String funcAnother(String str) {
		
		int n = str.length()-1;
		char[] cArr = str.toCharArray();
		
		char[] resArr = new char[cArr.length];
		
		resArr[0] = cArr[n];
		resArr[resArr.length-1] = cArr[0];
		
		for(int i=1;i<n;i++) {
			
			resArr[i] = cArr[i];
			
		}
		
		
		return new String(resArr);
		
	}
	
	public static String funcAnotherOne(String str) {
		
		char[] resArr = str.toCharArray();
		
		char temp = resArr[0];
		resArr[0] = resArr[resArr.length-1];
		resArr[resArr.length-1] = temp;
		
		return new String(resArr);	
	}

	public static void main(String[] args) {
		

		func("string");
		System.out.println("--------");
		String res = funcAnother("string");
		System.out.println(res);
		System.out.println("---------");
		String res1 = funcAnotherOne("string");
		System.out.println(res1);
	}

}
