package strings;

import java.util.Arrays;

etao korte parini tobe kortei hobe

public class RemoveWordFromAString {
	
	public static void func(String str, String word) {
		
		String[] sArr = str.split(" ");
		
		System.out.println(Arrays.toString(sArr));
		
		String res = "";
		
		for(int i=0;i<sArr.length;i++) {
			
			String str1 = sArr[i];
			
			if(str1.equals(word))//it doesn't work and I have no idea why
			{
				continue;
			}
			
			res += sArr[i] + " ";
			
		}
		
		System.out.println(res.substring(0, res.length()-1));
	}
	
	public static void funcAnother(String str, String word) {
		
		if(str.contains(word)) {
			
			String tempWord = word + "";
			
			System.out.println(tempWord);
			//System.out.println(str);
			str = str.replace(tempWord, "");
			
			System.out.println(str);
			
			tempWord = "" + word;
			str = str.replace(tempWord, "");
			System.out.println(str);
			
					
			
		}
		else {
			
			System.out.println("Word is not ithe string");
			return;
		}
		
	}
	
	
	public static String removeWord(String string, String word)
    {
  
        // Check if the word is present in string
        // If found, remove it using removeAll()
        if (string.contains(word)) {
  
            // To cover the case
            // if the word is at the
            // beginning of the string
            // or anywhere in the middle
            String tempWord = word + " ";
            string = string.replaceAll(tempWord, "");
  
            // To cover the edge case
            // if the word is at the
            // end of the string
            tempWord = " " + word;
            string = string.replaceAll(tempWord, "");
        }
  
        // Return the resultant string
        return string;
    }
  
	

	public static void main(String[] args) {

		String str = "I Am Am You Amyou youAm Am";
		
		//func(str, "Am");
		
		//funcAnother(str, "You");
	
		
		System.out.println(removeWord(str, "Am"));
	}

}
