package strings;

public class SwapCornerWordsAndThenSome {

	public static void func(String s) {
		
		String[] sArr = s.split("\\W");
		
		String res = "";
		String temp = "";
		
		int n = sArr.length-1;
		
		//swap corner words
		//op: "shit is the this"
		temp = sArr[0];
		sArr[0]=sArr[n];
		sArr[n]=temp;
		
		//reverse others
		for(int i=0;i<=n;i++) {
			
			if(i!=0 && i!=n) {
				
				sArr[i] = revString(sArr[i]);
				
			}
			
			res = res+sArr[i]+" ";
		}
		
		
		
		
		System.out.println(res);
	}
	
	public static String revString(String str) {
		
		int n = str.length()-1;
		
		String res="";
		
		for(int i=n;i>=0;i--) {
			res = res + str.charAt(i);
		}
		
		return res;
	}
	
	public static void main(String[] args) {

		func("this is the shit");
		
		System.out.println(revString("null"));
		

	}

}
