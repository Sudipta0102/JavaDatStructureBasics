package arrayInterviewQuestions.Array50GFG.Level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

	
	public static void main(String[] args) {
		
		int a[] = {85, 25, 1, 32, 54, 6};
		int b[] = {85,2};
				
		Set<Integer> hs = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			
			hs.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++) {
			
			hs.add(b[i]);
		}
		
		int c[] = new int[hs.size()];
		int j=0;
		
		for(Integer i: hs) {
			
			c[j++] = i;
		}
		
		System.out.println(Arrays.toString(c));
	}
}
