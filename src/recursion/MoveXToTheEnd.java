package recursion;

public class MoveXToTheEnd {	

	// i'm sure, i am going come tomorrow and not understand 
	//what i did here today
	static String func(String s, int idx, String res){		
		if(s.isEmpty()) {
			return res;
		}
		StringBuilder sb = new StringBuilder(res);		
		if(s.charAt(0)!='x') {		
			sb.setCharAt(idx, s.charAt(0));
			sb.setCharAt(res.length()-s.length(), res.charAt(idx));			
			res = sb.toString();
			idx++;
		}		
		return func(s.substring(1), idx, res);
	}
	
	static String funcIterative(String s) {
		//axxbxcx
		int n = s.length();
		int next = 0;
		StringBuilder sb = new StringBuilder(s);
		
		for(int i=0;i<n;i++) {
			
			if(s.charAt(i)!='x') {
				sb.setCharAt(i, s.charAt(next));
				sb.setCharAt(next, s.charAt(i));
				
				next++;				
			}
			
			//String temp = sb.toString();
		}		
		return sb.toString();	
	}
	
	static String funcAnother(String s, int count, String res) {
		
		if(s.isEmpty()) {
			for(int i=0;i<count;i++) {
				res += 'x';
			}
			return res;
		}
		
		if(s.charAt(0)=='x') {
			count++;
		}else {
			res += s.charAt(0);
		}
		
		return funcAnother(s.substring(1), count, res);
	}
	
	public static void main(String[] args) {
		
		//String s = "xxaxxbxcxdff";
		String s = "abcxxs";
		String result = s;
		
		//System.out.println(funcIterative(s));
		System.out.println(func(s, 0, result));
		
		String res = "";
		System.out.println(funcAnother(s, 0, res));
		
		
	}
	
}
