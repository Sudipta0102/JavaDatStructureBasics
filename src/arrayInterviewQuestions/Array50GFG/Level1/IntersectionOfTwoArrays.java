package arrayInterviewQuestions.Array50GFG.Level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		int a[] = {85, 25, 1, 32, 54, 6};
		int b[] = {85,2,6};
		
		Set<Integer> hs = new HashSet<>(a.length);
		List<Integer> al = new ArrayList<>(1);
		
		for(int i =0;i<a.length;i++) {
			
			hs.add(a[i]);
			
		}
		
		for(int j=0;j<b.length;j++) {
			
			if(!hs.add(b[j])) {
				
				al.add(b[j]);
				
			}
		}
		
		System.out.println(al);
	}
	
}
