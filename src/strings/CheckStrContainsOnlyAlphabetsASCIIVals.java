package strings;

public class CheckStrContainsOnlyAlphabetsASCIIVals {

	public static void func(String str) {
		
//		char ch = 'a';
//		char ch1 = 'A';
//		char ch2 = 'z';
//		char ch3 = 'Z';
//		
//		int a = ch;
//		int b = ch1;
//		int c = ch2;
//		int d = ch3;
//		
//		System.out.println((int)ch);
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		boolean found = false;
		
		for(int i=0;i<str.length();i++) {
			
			if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90 
					||(int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
						
						continue;
				
					}
			
			else {
				
				found = true;
				
			}
		}
		
		
		if(found==false) {
			
			System.out.println("Contans only alphabets");
		}
		else
			System.out.println("Contains other than alphabets");
	}
	
	public static void funcAnother(String str) {
		
		char ch;
		boolean found = false;
		
		for(int i=0;i<str.length();i++) {
			
			ch = str.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				
				continue;
				
			}
			
			else {
				
				found = true;
			}
			
		}
		
		if(found==false) {
			
			System.out.println("Contans only alphabets");
		}
		else
			System.out.println("Contains other than alphabets");
	}
	
	
	public static void main(String[] args) {

		String str1="12^%%^&abbsggGHGH";
		
		String str2 = "HGJHGJHGghjghghghj";
		
		func(str1);
		
		func(str2);

		System.out.println("-------------------");
		
		funcAnother(str1);
		
		funcAnother(str2);
		
	}

}
