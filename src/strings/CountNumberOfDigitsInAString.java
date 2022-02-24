package strings;

public class CountNumberOfDigitsInAString {

	static void func(String str) {
		
		int n = str.length();
		int count = 0;
		for(int i=0;i<n;i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		String password = "Noneofyourbusiness@1234";
		func(password);
	}
	
}
