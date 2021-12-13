package strings;

public class FetchAcharFromString {
	
	public static void func(String str, int idx) {
		if(idx>str.length()) {
			
			System.out.println("Invalid index");
			return;
		}
		
		System.out.println(str.charAt(idx));
		
		
	}
	
	public static void funcAnother(String str, int idx) {
		
		if(idx>str.length()) {
			
			System.out.println("Invalid index");
			return;
		
		}
		char[] cArr = str.toCharArray();
		
		System.out.println(cArr[idx]);
		
	}

	//String.codePointAt()
		public static void funcAnotherOne(String str, int idx) {
			
			int i  = str.codePointAt(idx);
			
			char ch = (char)str.codePointAt(idx);
			
			System.out.println(ch);
		}
	
	public static void main(String[] args) {

		String str = "Iamyou";
		
		func(str, 5);
		
		funcAnother(str, 5);

		funcAnotherOne(str, 5);
	}
	
	

}
