package strings;

public class NosOfVowels {
	
	public static void func(String s) {
		
		int vCount = 0;
		int cCount = 0;

		String str = s.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || 
					str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				
				vCount++;
			}
			else
				cCount++;
			
		}
		
		System.out.println(vCount);
		System.out.println(cCount);
	}

	public static void main(String[] args) {

		//func("This is a simple sentence");
		
		func("abecidofu");

	}

}
