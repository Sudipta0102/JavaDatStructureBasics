package arrayInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

	// brute force
	static void func(int[] a) {

		int n = a.length;
		boolean flag = false;

		for (int i = 0; i < n; i++) {

			if (a[i] != Integer.MIN_VALUE) {

				for (int j = i + 1; j < n; j++) {

					if (i!=j && a[i] == a[j]) {

						a[j] = Integer.MIN_VALUE;
						flag = true;

					}

				}

				if (flag == false) {

					System.out.println(a[i]);
					break;
				}

				a[i] = Integer.MIN_VALUE;
				flag = false;
				System.out.println(Arrays.toString(a));

			}

		}

	}
	
	//O(n) solution..i am pretty much a stupid guy...
	public static void funcOnSolution(int[] a) {
		
		int n = a.length;
		
		Map<Integer, Integer> hm= new HashMap<>();
		
		for(int i=0;i<n;i++) {
			
			Integer freq = hm.get(a[i]);
			hm.put(a[i], (freq==null)?1:freq+1);
		}
		
		System.out.println(hm);
		
		for(int i =0;i<n;i++) {
			
			if(hm.get(a[i])==1) {
				
				System.out.println(a[i]);
				break;
				
			}
			
		}
		
		//System.out.println("every value repeated");
	}

	public static void main(String[] args) {

		int arr[] = { -1, 6, 2, 5, 3, 2, -1 };

		funcOnSolution(arr);

	}
}
