package strings;

public class RandomStringGenerationOfGivenSize {
	
	public static void func(int size) {
		
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<size;i++) {
        	
        	int index = (int)(AlphaNumericString.length()*Math.random());
        	
        	System.out.println(index);
        	
        	sb.append(AlphaNumericString.charAt(index));
        }
		
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		
		func(4);

	}

}
