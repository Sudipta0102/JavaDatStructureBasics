package recursion.PracticeConfidenceGain;

public class DecimalToBinary {

	static String funcRec(int num) {
		
		if(num==0) {
			
			return "0";
			
		}
		
		return funcRec(num/2) + num%2;
		
	}
	
	public static void func(int num) {
		
		String s= "";
		String res = "";
		
		while(num>0) {
			
			s = s + String.valueOf(num%2);
			
			num = num/2;
			
		}
		
		for(int i=s.length()-1;i>=0;i--) {
			
			res = res + s.charAt(i);
			
		}
		
		System.out.println(res);
		
	}
	
	public static void main(String[] args) {

		System.out.println(funcRec(11));

	}

}
