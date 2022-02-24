package strings;

public class CheckParenthesisSanity {

	public static boolean checkParenthesis(String s) {
		
		int n = s.length();
		int count = 0;
		
		for(int i=0;i<n;i++) {
			
			char ch = s.charAt(i);
			
			if(ch=='(') {
				count++;
			}else if(ch ==')'){
				if(count==0) {
					return false;
				}
				else {
					count--;
				}
			}			
		}
		
		if(count!=0) {
			return false;
		}else {
			return true;
		}
		
		
	}
	
	public static void main(String[] args) {
	
		String s = "((AB)((c))";
		
		System.out.println(checkParenthesis(s));
		
	}
}
