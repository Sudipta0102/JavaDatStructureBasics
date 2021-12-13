package strings;

public class RemoveWordFromString {

	public static void func(String str, String s) {
		
		String[] sArr = str.split("\\W");
		String resStr="";
		
		
		int n = sArr.length-1;
		
		for(int i=0;i<n;i++) {
			if(!sArr[i].equals(s)) {
				resStr = resStr+sArr[i]+" ";
			}
		}
		
		System.out.println(resStr);
	}
	
	public static String convertStrArrToStr(String[] strArr) {
		
		StringBuilder sb = new StringBuilder();
		
		for(String str:strArr) {
			
			sb.append(str);
			
		}
		
		return sb.substring(0, sb.length()-1);
	}
	
	public static void main(String[] args) {
		
		
		func("this is the", "the");
		

	}

}
