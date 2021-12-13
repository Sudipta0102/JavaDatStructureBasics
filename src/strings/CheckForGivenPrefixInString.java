package strings;

public class CheckForGivenPrefixInString {

	public static void func(String str, String[] prefix) {
		
		int flag = 0;
		
		for(int i=0;i<prefix.length;i++) {
			
			if(str.startsWith(prefix[i])) {
				
				flag = 1;
				System.out.println("starts with " +prefix[i]);
				break;
				
			}
						
		}
		
		if(flag==0) {
			
			System.out.println("no prefix applicable");
		}
		
	}
	
	public static void main(String[] args) {

		String[] prefix = {"Ge", "I", "Yo"};
		String str = "I Am You";
		
		func(str, prefix);

	}

}
