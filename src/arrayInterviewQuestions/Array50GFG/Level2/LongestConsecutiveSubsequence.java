package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSubsequence {

	// i think it's still O(n log n) because of treeset value add operation.
	static void func(int[] a) {

		int n = a.length;

		Set<Integer> s = new TreeSet<>();

		for (int i = 0; i < n; i++) {

			s.add(a[i]);

		}

		System.out.println(s);

		int[] b = new int[s.size()];

		Iterator<Integer> it = s.iterator();
		int i = 0;
		while (it.hasNext()) {

			b[i] = it.next();
			i++;
		}

		System.out.println(Arrays.toString(b));
		int countNow = 0, count = 0;

		for (int j = 1; j < b.length; j++) {

			if (b[j - 1] + 1 == b[j]) {

				countNow++;

			} else {

				count = countNow;
				countNow = 0;
			}

			if (j == b.length - 1 && countNow != 0)
				count = countNow;

		}

		System.out.println(count);
	}

	//this is O(n) solution with O(n) space
	static void funcAgain(int[] a) {

		int n = a.length;
		Map<Integer, Boolean> hm = new HashMap<>();

		// first, assume from every element a subsequence can start.
		// everything is true here.
		for (int i = 0; i < n; i++) {

			hm.put(a[i], true);

		}

		System.out.println(hm);

		// checking for every element, the previous element is present or not.
		// if it's not present then then keep it true, otherwise false.
		// that means, whichever element is true, from there a subsequence
		// will start.
		for (Integer i : hm.keySet()) {

			if (hm.containsKey(i - 1)) {

				hm.put(i, false);
			}

		}

		System.out.println(hm);

		int count = 1;
		int maxCount = 0;
		//whichever is true, from there a check for a subsequence starts from 
		//there and keep count. same is done for every subsequence. and 
		//also keeping a maxCount for the longest subsequence.		
		for(Integer i:hm.keySet()) {
			if(hm.get(i).equals(true)) {			
				int temp = i;		
				while(hm.containsKey(temp+1)) {
					count++;
					temp++;
				}			
				if(count>=maxCount) {		
					maxCount = count;
							
				}
				count = 1;
				//i=temp;
			}		
		}
		System.out.println(maxCount);
	}

	public static void main(String[] args) {

		int[] a = { 20, 6, 10, 9, 7, 5, 30, 8 };
		int[] b = { 2, 6, 1, 9, 4, 5, 3 };
		int[] c = {10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2};
		int[] d = {100,4,200,1,3,2};
		int[] e = {0,3,7,2,5,8,4,6,0,1};
		int[] f = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
		int[] g = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
		int[] h = {-3,2,8,5,1,7,-8,2,-8,-4,-1,6,-6,9,6,0,-7,4,5,-4,8,2,0,-2,-6,9,-4,-1};
		
		//Arrays.sort(h);
		
		System.out.println(Arrays.toString(h));
		
		funcAgain(h);
		
		 
	}
}
