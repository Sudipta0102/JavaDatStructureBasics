package arrayInterviewQuestions.Array50GFG.Level1;

public class ReverseAnArray {

	static void func(int[] a) {
		
		int n = a.length;
		String s = "";
		
		for(int i=a.length-1;i>=0;i--) {
			
			s += a[i];
			
		}
		
		System.out.println(s);
	}
	
	static String rev(String w) {
		
		String s = "";
		
		int n = w.length()-1;
		
		for(int i=n;i>=0;i--) {
			
			s+=w.charAt(i);
		}
		
		return s;
	}
	
	
	public static void main(String[] args) {
		
		int [] a = {3,2,1,0,5};
		
		String s = "word";
		
		func(a);
		
		System.out.println(rev(s));
	}
}
