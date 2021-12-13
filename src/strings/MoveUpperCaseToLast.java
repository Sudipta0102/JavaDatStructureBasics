package strings;

public class MoveUpperCaseToLast {

	public static void func(String str) {
		
		String upperCaseStr = "";
		String lowerCaseStr = "";
		
		String res ="";
		
		char[] cArr = str.toCharArray();
		
		for(int i=0;i<cArr.length;i++) {
		
			if(Character.isUpperCase(cArr[i])) {
				
				upperCaseStr+=cArr[i];
				
			}
			
			else if(Character.isLowerCase(cArr[i])) {
				
				lowerCaseStr+=cArr[i];
				
			}
		}
		
		res = lowerCaseStr+upperCaseStr;
		
		System.out.println(res);
	}
	
	public static void main(String[] args) {

		func("heLlfgHjk");
		

	}

}
