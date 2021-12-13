package recursion.recursionString;

class copyString {

	static void func(String s) {
		
		String dest = "";
		int n = s.length();
		
		for(int i=0;i<n;i++) {
		  dest = dest + s.charAt(i);	
		}
		
		System.out.println(dest);
	}
	
	static String funcRec(String s, int end) {
		
		if(s.length()==0) {
			
			return "";
			
		}
		
		return funcRec(s.substring(0,end), end-1)+s.charAt(end);
		
	}
	
	
	public static void main(String[] args) {

		//func("asd");

//		String s = "sad";
//		
//		String dest = s.copyValueOf(s.toCharArray());
//		
//		System.out.println(dest);
		
		System.out.println(funcRec("asd", 2));
	}

}
