package DynamicProg.tabulation;

import java.util.Arrays;

public class CanConstructTheWord {
//please refer freecodecamp DP video for the explanation in case you forget the logic	
	static boolean func(String[] wordBank, String target) {
		
		boolean[] b = new boolean[target.length()+1];
		b[0] = true;
		System.out.println(Arrays.toString(b));
		for(int i=0;i<b.length;i++) {
			if(b[i]!=false) {
				for(String str:wordBank) {
					if(target.substring(i).startsWith(str)) {
						b[i+str.length()] = true;
					}
					
				}
			}
		}
		System.out.println(Arrays.toString(b));
		return b[target.length()];
	}
	
	public static void main(String[] args) {
		String[] sArr = {"ab","abc","cd","def","abcd"};
		String target = "abcdef";
		
		System.out.println(func(sArr, target));
	}
}
