package strings.Strings50GFG.Level1;

import java.util.Arrays;

public class ShortestDistance {

	static void func(String[] a, String s1, String s2) {
		
		int n = a.length;
		int idx1 = -1;
		int idx2 = -1;
		String s = "";
		int distance=Integer.MAX_VALUE;
		String temp = "";

		//{"geeks", "for", "contribute", "geeks", "practice"
		//,"for", "geeks", "practice"}
		for(int i=0;i<n;i++) {
			
			if(a[i].equals(s1)) {
				
				//temp = s1;
				idx1 = i;
						
			}
			
			else if(a[i].equals(s2) /*&& !temp.equals(s2)*/) {
				
				//temp = s2;
				idx2 = i;
				
				
			}
			
			if(idx1>-1 && idx2>-1 && a[i]!= temp && distance>Math.abs(idx1-idx2)) {
				
				distance=Math.abs(idx1-idx2);
								
			}
			
			temp = (idx1>idx2)?a[idx1]:a[idx2];
			
			
			
		}
		
		System.out.println(distance);
		
	}
	//1. look for s1 or s2.
	//2. if you find s1, update s1 index and if the count is not zero,
	//then get the last updated s1 index minus s2 index;
	//3. if you find s2 and if the count is not zero, 
	//then get the last updated s1 index minus s2 index;
	public static void main(String[] args) {
		
		String[] S = {"geeks", "for", "contribute", "geeks1", "practice1"
				,"for", "geek", "practice"};
		
		System.out.println(Arrays.toString(S));
		
		func(S,"geeks","practice");
	}
	
}
