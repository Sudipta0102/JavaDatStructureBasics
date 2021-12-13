package strings;

public class RemoveFirstAndLastCharInJava {
	
	//using char array and loop
	public static void func(String str) {
		
		char[] cArr = str.toCharArray();
		String res = "";
		
		for(int i=1;i<cArr.length-1;i++) {
			
			res += cArr[i];
			
		}
		
		System.out.println(res);
		
	}
	
	//not using char array and only loop
	public static void funcAnother(String str) {
		
		String res = "";	
	
		for(int i=1;i<str.length()-1;i++) {
			
			res = res + str.charAt(i);
			
		}
		
		System.out.println(res);
		
	}
	
	//using sub string method
	public static void funcOneMore(String str) {
		
		str = str.substring(1, str.length()-1);
		
		System.out.println(str);
		
	}

	//Using String builder
	public static void funcLastbutOne(String str){
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.deleteCharAt(str.length()-1);//why this needs to be deleted first
		
		sb.deleteCharAt(0);
		
		System.out.println(sb.toString());
	}
	
	//using string buffer
	public static void funcLast(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.deleteCharAt(str.length()-1);
		sb.deleteCharAt(0);
		
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {


		func("str");
		funcAnother("str");
		funcOneMore("str");
		funcLastbutOne("str");
		funcLast("str");	
	}

}
