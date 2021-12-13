package recursion.recursionString;

public class AllPossibleSubstring {
	
	public static void generate(String word) {
        if (word.length() == 1) {
            //System.out.println(word);
            return;
        }else{
        	
        	if(/*word.length()>1 && */ (word.charAt(0) == word.charAt(word.length()-1)))
        		System.out.println(word);
            generate(word.substring(0, word.length()-1)); 
            generate(word.substring(1, word.length())); 
        }

        
        
    }
	
copied code, I do not understand this, need to ask somebody, but who???!!!	
	

	public static void main(String[] args) {
		
		generate("abcba");
		

	}

}
