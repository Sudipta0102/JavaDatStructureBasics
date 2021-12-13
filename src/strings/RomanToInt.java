package strings;



public class RomanToInt {
	
	static int value(char c) {
		
		if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
		
        return 0;
	}
	
	
	static int func(String s) {
		
		int n = s.length()-1;
		int res = 0;
		
		for(int i =0;i<=n;i++) {
			
			int n1 = value(s.charAt(i));
			
			if(i+1<=n) {
				
				int n2 = value(s.charAt(i+1));
				
				if(n1>=n2) {
					
					res = res + n1;
					
				}
				
				else {
					
					res = res + n2 - n1;
					i++;
				}
			}
			else {
				
				res  = res + n1;
				
			}
			
			
		}
		
		
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println(func("MCMXCIV"));
		
		String strs[] = {"flower","flow","flight"};
		
		int i=1;
		
		
		
	}

}
