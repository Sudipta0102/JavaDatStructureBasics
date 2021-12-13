package strings.Strings50GFG.Level1;

public class CheckDivisibilityBy7 {

	static boolean func(String s) {
		
		int n = s.length();
		
		if (n == 1 && s.charAt(0) == '0')
            return true;
		
		if(n%3==1) {
			
			s = "00" + s;
			
		}
		if(n%3==2) {
			
			s = '0' + s;
		}
		n = s.length();
		
		int groupSum = 0, p = 1;
		
		for(int i=n-1;i>=0;i--) {
			
			int group = 0;
			group += (s.charAt(i--)-'0')*1;
			group += (s.charAt(i--)-'0')*10;
			group += (s.charAt(i)-'0')*100;
			
			groupSum += group * p;
			
			p = p * -1;
			
		}
		
		return groupSum%7==0;
	}
	
	public static void main(String[] args) {
		
		String s = "8955795758";
		
		//System.out.println(s.charAt(2));
		
		System.out.println(func(s));
		
		/*
		int group = (s.charAt(2)-'0')*1;
		int group1 = (s.charAt(1)-'0')*10;
		int group2 = (s.charAt(0)-'0')*100;
		
		
		System.out.println(group);
		System.out.println(group1);
		System.out.println(group2);
		System.out.println(group+group1+group2);
		*/
	}
}
