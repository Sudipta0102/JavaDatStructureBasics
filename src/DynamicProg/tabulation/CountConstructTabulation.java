package DynamicProg.tabulation;

import java.util.Arrays;

public class CountConstructTabulation {

	static int func(String[] s, String target) {
		
		int[] a = new int[target.length()+1];
		a[0] = 1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				for(String str:s) {
					if(target.substring(i).startsWith(str)) {
						a[i+str.length()] += a[i]; 
					}
				}
			}
		}		
		
		System.out.println(Arrays.toString(a));
		
		return a[target.length()];		
	}
	
	public static void main(String[] args) {
		String[] sArr = {"purp", "p","ur","le","purpl"};
		String target = "purple";
		
		System.out.println(func(sArr, target));
	}
}
