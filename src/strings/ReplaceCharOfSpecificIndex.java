package strings;

public class ReplaceCharOfSpecificIndex {

	public static void func(String str, int idx, char ch) {
		
		String res = "";
		
		if(str.length()<idx) {
			
			System.out.println("invalid index");
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			
			if(i==idx-1) {
				str = str.replace(str.charAt(i), ch);
			}
			
			res = res + str.charAt(i);
			
		}
			
		System.out.println(res);
			
	}
		
	public static void funcAnother(String str, int idx, char ch) {
		
		str = str.substring(0, idx)+ch+str.substring(idx+1, str.length());
		
		
		System.out.println(str);
	}
	
	public static void funcLast(String str, int idx, char ch) {
		
		StringBuilder sb = new StringBuilder(str);
		
		
		sb.setCharAt(idx-1, ch);
		
		
		System.out.println(sb.toString());
		
	}
	
	
	public static void main(String[] args) {
		
		func("IAmyou", 4, 'Y');
		
		System.out.println("-------");

		func("IAmyou", 20, 'Y');
		
		System.out.println("-------");
		System.out.println("-------");
		
		func("IAmyou", 4, 'Y');
		
		System.out.println("-------");
		System.out.println("-------");
		
		funcLast("IAmyou", 4, 'Y');
		
	}

}
